import java.util.Scanner;
public class Grade{
	public static void main(String[] args){
		int a;
		do{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("输入你的年龄");
		int gra = scan.nextInt();
		gra /= 18;
		
		switch(gra){
			case 0:
			System.out.println("小姐姐你好");
			break;
			default:
			System.out.println("大姐姐你好");
			break;
		}
		System.out.print("还想继续输入吗？继续输入按1，退出请按0");
		 a = scan.nextInt();
	}while(a == 1);
	}
}