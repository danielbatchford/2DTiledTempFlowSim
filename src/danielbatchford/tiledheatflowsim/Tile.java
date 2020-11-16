package danielbatchford.tiledheatflowsim;

import java.util.Random;

public class Tile {

    private final int maxTemp;
    private float temp;
    private boolean locked;

    Tile(float temp, int maxTemp) {
        this.temp = temp;
        this.maxTemp = maxTemp;
        this.locked = false;
    }

    Tile(int maxTemp) {
        this.maxTemp = maxTemp;
        this.temp = new Random().nextFloat() * maxTemp;
        this.locked = false;
    }

    void addTemp(float toAdd) {
        this.temp += toAdd;
    }

    float getTemp() {
        return this.temp;
    }

    void setTemp(float temp) {
        this.temp = temp;
    }

    void setTempHighOrLow(boolean highOrLow){
        this.temp = highOrLow ? maxTemp : 0;
        this.locked = true;
    }

    boolean isLocked(){
        return this.locked;
    }

    void unlock(){
        this.locked = false;
    }
}
