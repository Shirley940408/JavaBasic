import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestList {

	public static void main(String[] args) {
		List list=new ArrayList<>();
		list.add("Amy");
		list.add("Bob");
		list.add("Chirstina");
		list.add("Diane");
//		//Cannot use remove in "++" based for cycle, because each time the size of list changes after a remove has been done.
//		for(int i=list.size()-1;i>0;i--){
//			list.remove(i);
//		}
//		for(Object o:list){
//			System.out.println(o);
//		}
		//foreach cannot use remove directory, only could using the way below
		list=new CopyOnWriteArrayList<>(list);
		for(Object str:list){
			if(str.equals("Bob")){
				list.remove(str);
			}
			System.out.println(str);
		}
//		for(Object o:list){
//		System.out.println(o);
//	}

		Iterator iterator=list.iterator();
		while(iterator.hasNext()){
			try {
				Object string=iterator.next();
				list.remove(string);				
			} catch (Exception e) {
				e.printStackTrace();
			}

//				iterator.remove();//has problem				

		}
	}

}