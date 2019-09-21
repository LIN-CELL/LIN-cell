public class JT{
	/*public static void main (String args[]){
		int i = 5;
		for (int j = 1; j <= i; j++){
			int times = j;
			while(times != 0){
				System.out.print("*");
				times --;
			}
			System.out.println("\n");
		}
	}
}*/
	public static void main (String args[]){
		int i=5;
		for (int j = 1; j <= i;j++){
			int a = (2*j)-1;  
			int b = 0;
			while(b!=(i-j))
			{
				System.out.print(" ");
				b ++;
			}
			while (a != 0){
				System.out.print("*");
				a --;
			}
			System.out.print("\n");
		}
	}
}