package be.intecbrussel;

public class Suv extends Car {
    private boolean bullBar;
    private boolean offRoad;

// Instance Method
    public void fourByFour(boolean offRoad) {
        this.offRoad = offRoad;
    }

// Setters
    public void setBullBar(boolean bullBar) {
        this.bullBar = bullBar;
    }

// Getters
    public boolean isBullBar() {
        return bullBar;
    }

    @Override
    public int getSpeed() {
        if(offRoad && (super.getSpeed() >= 30)){
            super.setSpeed(30);
        }
        return super.getSpeed();
    }

    @Override
    public String toString() {
        return "Suv{" +
                "bullBar=" + bullBar +
                ", offRoad=" + offRoad +
                '}';
    }
}
