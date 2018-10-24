public class Equals{
    public static void main(String[] args){
        Person p1=new Person();
        p1.id=1000;
        p1.name="Michael";
        Person p2=new Person();
        p2.id=1000;
        p2.name="Michael";
        System.out.println(p1.equals(p2));
    }
}
class Person{
    int id;
    String name;
    public boolean equals(Object obj){
        if(obj==null){
            return false;
        }
        if(this==obj){
            return true;
        }
        if(obj instanceof Person){
            Person p=(Person) obj;
            if(this.id==p.id){
                return true;
            }
        }
        return false;
    }
} 