package danielbatchford.tiledheatflowsim;

import processing.core.PApplet;

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
                this.tiles[x][y] = new Tile(new Random().nextFloat()*MAX_TEMP, MAX_TEMP);
            }
        }
    }

    // update new heats
    void update() {

        float[][] newTempMap = new float[divs[0]][divs[1]];
        for(int x = 0; x < divs[0]; x++){
            for(int y = 0; y < divs[1]; y++){
                newTempMap[x][y] = new Random().nextFloat()*MAX_TEMP;
            }
        }

        for (int x = 0; x < divs[0]; x++) {
            for (int y = 0; y < divs[1]; y++) {
                this.tiles[x][y].setTemp(newTempMap[x][y]);
            }
        }
    }

    void draw() {

        for (int x = 0; x < divs[0]; x++) {
            for (int y = 0; y < divs[1]; y++) {
                Tile currTile = this.tiles[x][y];
                int[] fillCol = currTile.isBlocked() ? BLOCK_COL : HEAT_MAP[(int) currTile.getTemp()];
                parent.fill(fillCol[0],fillCol[1],fillCol[2]);
                parent.rect(x * boxDims[0], y * boxDims[1], boxDims[0], boxDims[1]);
            }
        }
    }

    Tile[][] getTiles(){
        return this.tiles;
    }


}
