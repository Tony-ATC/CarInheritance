package be.intecbrussel;

public class Car {
    private String color;
    private int speed;
    private int horsePower;

// Instance Method
    public void accelerate(int amount){
        this.speed = (amount + (horsePower/100));
    }

    public void slow(int amount){
        this.speed = (amount - (horsePower/100));
    }

    public void park(){
        this.speed = 0;
    }

// Setters
    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

// Getters
    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    public int getHorsePower() {
        return horsePower;
    }


    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", speed=" + speed +
                ", horsePower=" + horsePower +
                '}';
    }
}
