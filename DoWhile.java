/*implement a login function
1.check the username and password(username:admin;pwd:123);otherwise give the "reinput" hint.
2.3 times is the maximum times that a user could login the wrong information, above that the information would be blocked.
*/
import java.util.Scanner;
public class DoWhile{
    public static void main(String[] args){
    int wrong=0;
    //check the info of user
        do{
            Scanner sc =new Scanner(System.in);
            System.out.println("Please input your username");
            String name=sc.next();
            System.out.println("Please input your password");
            String pwd=sc.next();
            if(name.equals("admin")&&pwd.equals("123")){
                System.out.println("Login Successfully!");
                break;
            }else{
                wrong++;
                System.out.println("Information error, please relogin and your maximum time to put in wrong information would be 3"); 
            }
        
        }while(wrong<=2);
    }
}