package be.intecbrussel;

public class Cabrio extends Car {
    private boolean sunRoof;

    public void setSunRoof(boolean toggle) {
        this.sunRoof = toggle;
    }

    public boolean isSunRoof() {
        return sunRoof;
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }

    @Override
    public String toString() {
        return "Cabrio{" +
                "sunRoof=" + sunRoof +
                '}';
    }
}
