import java.util.Scanner;
public class Grade{
	public static void main(String[] args){
		int a;
		do{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�����������");
		int gra = scan.nextInt();
		gra /= 18;
		
		switch(gra){
			case 0:
			System.out.println("С������");
			break;
			default:
			System.out.println("�������");
			break;
		}
		System.out.print("������������𣿼������밴1���˳��밴0");
		 a = scan.nextInt();
	}while(a == 1);
	}
}