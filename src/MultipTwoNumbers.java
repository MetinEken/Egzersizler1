import java.util.Scanner;

public class MultipTwoNumbers {

	public static void main(String[] args) {
		
	////kullanici klavyeden input girmesi icin
		Scanner scan =new Scanner (System.in);
		System.out.println("Enter first number:");
		
		int first_number = scan.nextInt();
		
		System.out.println("Enter second number :");
		
		int second_number = scan.nextInt();
		///Scanner sinifini kapat 
		
		
		////hesaplama (calculate)
		int calculate = first_number * second_number;
		
		///sonucu goster (sisplay)
		
		System.out.println("Outout is : "+ calculate);

	}

}
