
/*
	判断用户输入的字符是否是英文字符
*/
import java.util.Scanner;

public class AL03_TestIFSingle{
	public  static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符");
		String input = sc.next();//获取用户输入的字符串

		char c = input.charAt(0);//取出input这个字符串中的第一个字符
		
		if(('A' <= c && c <= 'Z') || ('a' <= c && c <= 'z')){
			System.out.println("输入了英文字符：" + c);
		}
		
	}
}