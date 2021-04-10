package dersnotlari1;

public class SumOffArry {

	public static void main(String[] args) {
	 /// creat an array
		int numbers[]= {14,21,3,41,5,73};
		// sum of array (rakamlar toplami)
		int sum = 0;
		/// advanced for loop
		for(int x : numbers) {
			sum = sum + x;
			
		}
   System.out.println("Sum of the elements is:" +sum);
	}

}
