package danielbatchford.tiledheatflowsim;

import java.util.Random;

public class Tile {

    private float temp;
    private final int maxTemp;

    private boolean blocked;

    Tile(float temp, int maxTemp) {
        this.temp = temp;
        this.maxTemp = maxTemp;
    }

    Tile(int maxTemp) {
        this.maxTemp = maxTemp;
        this.temp = new Random().nextFloat()*maxTemp;
    }

    void addTemp(int toAdd){
        this.temp += toAdd;
    }

    void setTemp(float temp){
        this.temp = temp;
    }

    float getTemp(){
        return this.temp;
    }

    void toggleBlocked(){
        this.blocked = !this.blocked;
    }

    boolean isBlocked() {
        return blocked;
    }
}
