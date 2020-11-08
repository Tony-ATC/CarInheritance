package be.intecbrussel;

public class RunningApp {
    public static void main(String[] args) {
        Suv suvNumber0 = new Suv();
        Cabrio cabrioNumber0 = new Cabrio();
        E_car e_CarNumber0 = new E_car();

        suvNumber0.setColor("Red");
        suvNumber0.setHorsePower(250);
        cabrioNumber0.setColor("Yellow");
        cabrioNumber0.setHorsePower(250);
        e_CarNumber0.setColor("Green");
        e_CarNumber0.charge(60);
        suvNumber0.accelerate(50);
        cabrioNumber0.accelerate(50);
        suvNumber0.accelerate(50);

        Car [] parkArray = new Car[]{suvNumber0, cabrioNumber0, e_CarNumber0 };
        for(Car element : parkArray) {
            element.park();
        }

        System.out.println("All Cars: ");
        System.out.println(suvNumber0);
        System.out.println(cabrioNumber0);
        System.out.println(e_CarNumber0);
    }
}
