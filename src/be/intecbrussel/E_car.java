package be.intecbrussel;

public class E_car extends Car {
    private int battery;

    public void charge (int chargeAmount) {
        this.battery = chargeAmount;
    }

    public int getBattery() {
        return battery;
    }

    @Override
    public void accelerate(int amount) {
        super.setSpeed(super.getSpeed() + (amount + (battery/100)));
    }

    @Override
    public void slow(int amount) {
        super.setSpeed(super.getSpeed() + (amount - (battery/100)));
    }

    @Override
    public void park() {
        super.park();
    }


    @Override
    public int getSpeed() {
        return super.getSpeed();
    }

    @Override
    public String toString() {
        return "E_car{" +
                "battery=" + battery +
                '}';
    }
}
