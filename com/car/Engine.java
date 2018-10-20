public class Engine{
    double displacement;
    int powerSize;
    public Engine(double displacement,int powerSize){
        this.displacement=displacement;
        this.powerSize=powerSize;
    }
    public void start(){
        System.out.println("strike the engine");
    }
    public void stop(){
        System.out.println("stop the engine");
    }
}