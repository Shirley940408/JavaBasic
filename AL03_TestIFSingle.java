
/*
	�ж��û�������ַ��Ƿ���Ӣ���ַ�
*/
import java.util.Scanner;

public class AL03_TestIFSingle{
	public  static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�");
		String input = sc.next();//��ȡ�û�������ַ���

		char c = input.charAt(0);//ȡ��input����ַ����еĵ�һ���ַ�
		
		if(('A' <= c && c <= 'Z') || ('a' <= c && c <= 'z')){
			System.out.println("������Ӣ���ַ���" + c);
		}
		
	}
}