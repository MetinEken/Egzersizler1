package dersnotlari1;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		///klavyeden string gir
		System.out.println("Input a string : ");
		///kelimeyi harflere bol
		char[] letters = scan.nextLine().toCharArray();
		
		System.out.println("Rvense string : ");
        for(int i = letters.length -1; i>=0; i--) {
            System.out.print(letters[i]);
        }
            System.out.println("\n");
	}

}
