package danielbatchford.tiledheatflowsim;

import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TileController implements Constants {

    private final PApplet parent;
    private final int[] divs;
    private final int[] boxDims;

    private final Tile[][] tiles;

    TileController(PApplet parent) {
        this.parent = parent;
        this.divs = DIVS;
        this.boxDims = new int[]{WIDTH / this.divs[0], HEIGHT / this.divs[1]};
        this.tiles = new Tile[divs[0]][divs[1]];
        for (int x = 0; x < divs[0]; x++) {
            for (int y = 0; y < divs[1]; y++) {
                this.tiles[x][y] = new Tile(new Random().nextFloat() * MAX_TEMP, MAX_TEMP);
            }
        }
    }

    // update new heats
    void update() {

        Tile[][] newTempMap = this.tiles.clone();
        List<Tile> neighbors = new ArrayList<>();

        for (int x = 0; x < divs[0]; x++) {
            for (int y = 0; y < divs[1]; y++) {
                if(tiles[x][y].isLocked()) continue;
                if (x > 0) neighbors.add(newTempMap[x - 1][y]);
                if (y > 0) neighbors.add(newTempMap[x][y - 1]);
                if (x < divs[0] - 1) neighbors.add(newTempMap[x + 1][y]);
                if (y < divs[1] - 1) neighbors.add(newTempMap[x][y + 1]);

                float newTileTemp = evalTemp(newTempMap[x][y], neighbors);
                this.tiles[x][y].setTemp(newTileTemp);

                neighbors.clear();
            }
        }
    }

    private float evalTemp(Tile center, List<Tile> neighbors) {

        float neighborSum = 0;
        for (Tile n : neighbors) {
            neighborSum += n.getTemp();
        }
        float edgeWeightedNeighborSum = neighborSum * (4.0f / neighbors.size());
        float unclampedNewTemp = center.getTemp() + ALPHA * (-4 * center.getTemp() + edgeWeightedNeighborSum);

        return Math.min(MAX_TEMP, Math.max(0, unclampedNewTemp));
    }

    void draw() {

        for (int x = 0; x < divs[0]; x++) {
            for (int y = 0; y < divs[1]; y++) {
                Tile currTile = this.tiles[x][y];
                int[] fillCol = HEAT_MAP[MAX_TEMP - (int) currTile.getTemp()]; //temp fix
                parent.fill(fillCol[0], fillCol[1], fillCol[2]);
                parent.rect(x * boxDims[0], y * boxDims[1], boxDims[0], boxDims[1]);
            }
        }
    }

    Tile[][] getTiles() {
        return this.tiles;
    }


}
