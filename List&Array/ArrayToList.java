import java.util.Arrays;
import java.util.List;
public class ArrayToList{
    public static void main(String[] args){
        String[] arr={"a","b","c"};
        List<String>asList=Arrays.asList(arr);//Cannot excute add(element); for this arraylist is a Static class in Class Arraylist; not the one we use regularly.
       // asList.add("d");
        System.out.println(asList);

        Integer[] intArray={1,2,3,4};
        List<Integer>intList=Arrays.asList(intArray);
        System.out.println(intList);
    }
}