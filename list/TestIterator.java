import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class TestIterator {

	public static void main(String[] args) {
		Collection collection=new ArrayList();
		
		collection.add(100);
		collection.add(3.14);
		collection.add(false);
		
		Iterator iterator=collection.iterator();
		System.out.println(iterator);
		//must using hasNext() to examine whether it is true or not before implement next();
		while(iterator.hasNext()){
			Object element=iterator.next();
			System.out.println(element);
		}
		//for
		for(Iterator it=collection.iterator();it.hasNext();){
			Object object=it.next();
			System.out.println(object);
		}
		
	}

}