import java.util.Scanner;
class Dividible {
	public static void main(String[] args ) {
		int x  ;
		int y ;
		Scanner myobj = new Scanner(System.in);
		System.out.println("Enter a number: ");
	//	Scanner myobj = new Scanner(System.in);
	//	System.out.println("You entered number is :")
		String number = myobj.nextLine();
		System.out.println("You Enterd NUmber is :"+number);	

		if (int x%2==0){
			System.out.println(" is divisible by 2"+ number);
		} /*else{
			System.out.println(" is not divisible by 2" + number);
		}*/
	}
}

