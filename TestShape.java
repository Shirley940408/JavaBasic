public class TestShape{
    public static void main(String[] args){
        Shape c=new Circle(5.0);
        Shape r=new Rect(3,4);
        System.out.println("circle girth "+ c.girth());
        System.out.println("rectangle girth "+ r.girth());
    }
}
abstract class Shape{
    public abstract double girth();
    public abstract double area();
}

class Circle extends Shape{
    private double r;
    private static final double PI=3.14;
    public Circle(double r){
        this.r=r;
    }
    public double girth(){
        return 2*PI*r;
    }
    public double area(){
        return PI*r*r;
    }  
}

class Rect extends Shape{
    private double a;
    private double b;
    public Rect(double a,double b){
        this.a=a;
        this.b=b;
    }
    public double girth(){
        return 2*(a+b);
    }
    public double area(){
        return a*b;
    }
}