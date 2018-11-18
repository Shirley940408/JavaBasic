import java.io.NotActiveException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.omg.CORBA.DoubleSeqHelper;

public class Admin {
	//initiate user and items
	private static List<Goods>goodsList;
	private static List<User>userList;
	private static Scanner sc=new Scanner(System.in);
	static{
		userList=new ArrayList<>();
        userList.add(new User("admin", "789"));
        userList.add(new User("jack", "123"));
        
        goodsList=new ArrayList<>();
        goodsList.add(new Goods("100", "washingMachine", new BigDecimal("600"), 10));
        goodsList.add(new Goods("200", "airConditioner", new BigDecimal("1200"), 50));
        goodsList.add(new Goods("300", "dustCleaner", new BigDecimal("100"), 100));
	}
	public static void main(String[] args){
		welcome();
		//login();
		//Manager();
	}
	public static void welcome(){
//		while(true){
			System.out.println("===welcome to MyOnlineShop===");
			System.out.println("1.login");
			System.out.println("2.searching");
			System.out.println("3.logOut");

			int input=sc.nextInt();
			
			switch(input){
			case 1:
				login();
				break;
			case 2:
				showGoods();
				System.out.println("login successful");
				break;
			case 3:
				System.out.println("logout successful");
				System.exit(-1);
			default:
				System.out.println("login information error");
				break;
	           
			}
//		}
		
	}
	private static void login(){
		int num=3;
		do{
			System.out.println("===login===");
			System.out.println("Please input your username");
			String usn=sc.next();
			System .out.println("Please input your password");
			String pwd=sc.next();
			if (Exists(usn, pwd)){
				System.out.println("Congratuation "+usn);
				Manager();
				break;
			}else{
				System.out.println("Login information error, you still have "+(--num)+" times to try, after that your information would be blocked based on the purpose of protection");
			}
		}while(num>0);
	}
	private static boolean Exists(String name, String pwd){
		for(User u:userList){
			if(name.equals(u.getUsn())&&pwd.equals(u.getPwd())){
				System.out.println("welcome "+ name);
				return true;
			}	
		}
		return false;
	}
	public static void Manager(){
		while(true){
			System.out.println("===items===");
			System.out.println("1.add items");
			System.out.println("2.delete items");
			System.out.println("3.select items");
			System.out.println("4.update items");
			System.out.println("5.exit");
			System.out.println("please input the number matching your choise");
			
			int input=sc.nextInt();
			
			switch(input){
			case 1:
				System.out.println("add items ");
				addGoods();
				break;
			case 2:
				System.out.println("delete items");
				deleteGoods();
				break;
			case 3:
				System.out.println("Show items");
				showGoods();
				break;
			case 4:
				System.out.println("update items");
				updateGoods();
				break;
			case 5:
				System.out.println("exit successful");
				System.exit(-1);
		    default:
		    	System.out.println("please input correct number");
			}

		}
	}
	//check whether id exits on itemTable
	public static Goods getGoodsById(String id){
		for(Goods g:goodsList){
			if(id.equals(g.getId())){
				return g;
			}
		}
		return null;
	}
	public static void addGoods(){
		String id="";
		while(true){
			System.out.println("PLease input your item number");
			id=sc.next();
			Goods goods=getGoodsById(id);
			if(goods!=null){
				System.out.print("The item already exits, please input a new item");
			}else{
				break;
			}
		}

		System.out.println("Please input the itemName");
		String name=sc.next();
		System.out.println("Please input the price");
		BigDecimal price=new BigDecimal(sc.next());
		System.out.println("Please input the number you would like to add");
		int num=sc.nextInt();
        goodsList.add(new Goods(id, name, price, num));
//		Goods goods=new Goods(id, name, price, num);
		System.out.println("add items successfully");
		showGoods();
	}
	public static void showGoods(){
		System.out.println("No.\t\tName\t\tPrice\t\tNumber");
		for(int i=0; i<goodsList.size();i++){
			System.out.println(goodsList.get(i).getId() + "\t\t" + goodsList.get(i).getName() + "\t\t" + goodsList.get(i).getPrice() + "\t\t" + goodsList.get(i).getNum());		
		}
	}
	public static void updateGoods(){
		while(true){
			System.out.println("Please input the No. of the item that you would like to update");
			String id=sc.next();
			Goods goods=getGoodsById(id);
			if(goods!=null){
				System.out.println("Please input the new name");
				String name=sc.next();
				System.out.println("Please input the new item price");
				BigDecimal price=new BigDecimal(sc.next());
				System.out.println("Please input the new item number");
				int num=sc.nextInt();
				goods.setName(name);
				goods.setPrice(price);
				goods.setNum(num);
				break;
			}else{
				System.out.println("Your id does not exist");
			}
		}
	}
	public static void deleteGoods(){
		while(true){
			System.out.println("Please input the No. of the item that you would like to delete");
			String id=sc.next();
			Goods goods=getGoodsById(id);
			if(goods!=null){
				goodsList.remove(goods);
				break;
			}else{
				System.out.println("Your id does not exist");
			}
		}
	}
}
