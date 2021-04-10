
public class StringConcatination {

	public static void main(String[] args) {
		
		
		String first = "Java";
		String second = "Python";
		String third = "Javascript";
		String forth = "25022013";
		int fifth = 25022013;
		
		System.out.println(first.toUpperCase());
		System.out.println(second.toLowerCase());
		System.out.println(third);
		System.out.println(forth);
		System.out.println(fifth);
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		///yeni bir string olusturalim 
		
//JavaPython
		String new_word = first.concat(second);
///String new_word = first+ second;
System.out.println("New word :"+new_word);


		
			
	}

}
