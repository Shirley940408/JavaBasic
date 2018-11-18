import java.util.ArrayList;
import java.util.List;
public class ListToArray{
    public static void main(String[] args){
        List<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        // Object[] arr=list.toArray();
        String[] arr=list.toArray(new String[1]);
        System.out.println(arr.length);
    }
}