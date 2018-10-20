public class Car{
    String carBrand;
    int price;
    String color;
    String motorcycleType;
    double oilConsumption;
    Engine carEngine;
    public void start(){
        System.out.println("Pull the strike");
        carEngine.start();
    }
    public void stop(){
        System.out.println("Stop the Engine");
        carEngine.stop();
    }
    public void showInfo(){
        System.out.println("---Your car's information---");
        System.out.println("carBrand:" + carBrand);
        System.out.println("price:" + price);
        System.out.println("motorcycleType:" + motorcycleType);
        System.out.println("oilConsumption:" + oilConsumption);

        System.out.println("displacement:" + carEngine.displacement);
        System.out.println("powerSize:" + carEngine.powerSize);
    }
}