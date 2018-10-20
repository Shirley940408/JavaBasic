public class TestCar{
    public static void main(String[] args){
     Car car1=new Car();
     car1.carBrand="Benz";
     car1.color="red";
     car1.motorcycleType="SUV";
     car1.oilConsumption=15;
     car1.price=130;
    

    car1.carEngine=new Engine(4.5,250);
    car1.showInfo();
    car1.start();
    car1.stop();
    }

}