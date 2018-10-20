import java.util.ArrayList;

public class DataType{
        public static void main(String[] args){
        ArrayList list=new ArrayList();
       
            
        for(byte i=-128;i<=127;i++){
                
            if((byte)(i+1) < i){
                System.out.println(i); 
                list.add((byte)(i+1));
                if((i==127)&&(byte)(i+1)/i<0){
                    break;
                }
                //myList.add(i);
            }           
        }
            System.out.println(list.toString());

        }
    }