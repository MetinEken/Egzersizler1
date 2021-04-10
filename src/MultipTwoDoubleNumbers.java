import java.util.Scanner;

public class MultipTwoDoubleNumbers {

	public static void main(String[] args) {
		
   ///kullanicinin klavyeden ondalik sayi input girmesi icin
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter first number : ");
		double first_number =scan.nextDouble();
		
		System.out.println("Enter second number :");
		double second_number = scan.nextDouble ();
		
		///Scanner sinifini kapat 
	
		
		// hesaplama ( calculate)
		double calculate = first_number *second_number;
		
		///sonucu goster (display)
		System.out.println("Output is : "+ calculate);
	}

}
