import java.util.Scanner;

public class DifferentDataTypes {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		////String isim ornek 
		System.out.println("Please enter your name");
		String name = scan.nextLine();
		
		
		////Int ornek yas (tam sayi)
		System.out.println("Please enter your age");
		int age = scan.nextInt();
		
		
		////dooble olarak maas (ondalik sayi)
		System.out.println("Please enter your salary");
		double salary = scan.nextDouble();
		System.out.println(salary);
		
		

	}

}
