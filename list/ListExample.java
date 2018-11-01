import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("001", "Amy", 11);
		Student s2=new Student("002", "Bob", 12);
		Student s3=new Student("003", "Christina", 16);
		Student s4=new Student("004", "Diane", 21);
        List list=new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        
        if(!list.contains(s4)){
        	list.add(s4);
        }
        System.out.println(list.size());
        System.out.println("---------------");
        for(Object o:list){
        	Student student=(Student)o;
        	System.out.println(student.name);
        }
        System.out.println(list.contains(s4));
        System.out.println("---------------");
        Iterator iterator=list.iterator();
        while(iterator.hasNext()){
        	Student student=(Student)iterator.next();
        	System.out.println(student.name+" : "+student.age);
        }
	}

}
class Student{
	String no;
	String name;
	int age;
	public Student(String no, String name, int age){
		this.no=no;
		this.name=name;
		this.age=age;
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj){
		return true;
		}
		if(obj==null){
		return false;
		}
		
		if(this.getClass()!=obj.getClass()){
			return false;
		}
		Student other=(Student)obj;
		if(this.age!=other.age){
			return false;
		}
		if(this.name==null){
			if(other.name!=null){
				return false;
			}
		}else if(!this.name.equals(other.name)){
			return false;
		}
		if(no==null){
			if(other.no!=null){
				return false;
			}
		}else if(!no.equals(other.no)){
			return false;
		}
		return true;
	}
	
}