import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class AddToList{
    public static void main(String[] args){
        String s1=new String("Amy");
        String s2=new String("Bob");
        String s3=new String("Sam");
        List list=new ArrayList();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.remove(1);
        System.out.println(list.size());
        System.out.println(list.contains(s2));
        System.out.println(list.get(0));
        System.out.println(list.get(1));

        System.out.println("-----------");
        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("-----------");
        for(Object obj:list){
            obj=(String)obj;
            System.out.println(obj);
        }
        System.out.println("-----------");
        Iterator it=list.iterator();
        while(it.hasNext()){
            // String s=(String)it.next();
            // System.out.println(s);
            System.out.println(it.next());
        }
        System.out.println("-----------");
        for(Iterator it1=list.iterator();it1.hasNext();){
            String s=(String) it1.next();
            System.out.println(s);
        }
    }
}