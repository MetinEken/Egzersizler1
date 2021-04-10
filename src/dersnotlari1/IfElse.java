package dersnotlari1;

public class IfElse {

	public static void main(String[] args) {
		
		int num = 12345;
		if (num< 100 && num >=10) {
			System.out.println("its a two digit number");
		}
	
	else if (num<1000&& num >= 100) {
		System.out.println();
	System.out.println("it is a  four digit number");
	}
	else if(num<1000&& num>=1000) {
		System.out.println("it is  five digit number");
	}
	else {
		System.out.println("number is not botween 1 & 9999");
	}
	}
	
	 
}

