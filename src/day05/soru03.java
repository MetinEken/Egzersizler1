package day05;

import java.util.Scanner;

public class soru03 {

	public static void main(String[] args) {
		/* Kullanicidan int  list uzunlugunu isteyin
		 * Listin uzunlugu kadar kullanicidan list elemanlarini girmesini isteyin
		 * Tekrarli list elemanlarindan yeni bir list olusturan ve  yazdiran metod yazin	 

 			Kullanicidan int  list uzunlugunu isteyin
		 * Listin uzunlugu kadar kullanicidan list elemanlarini girmesini isteyin
		 * Tekrarli list elemanlarindan yeni bir list olusturan ve  yazdiran metod yazin
		 *
		 * n = 5 icin (listin uzunlugu);
		 * input { 1 , 2 , 2 , 3 , 4}
		 * output {2}
		 *
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Olusturmak istediginiz arrayin uzunlugunu giriniz");
		int arrLen = scan.nextInt();
		
		int arr [] = new int [arrLen];
		
		
		// 2. adim kullanicidan array uzunlugu kadar array elemanlarini girmesini isteyin
		
		System.out.println("Array elemanlarini giriniz");
		
		for(int i = 0 ; i < arrLen ; i++) {
			arr[i] = scan.nextInt();
		}
		
		//4. adim olusturulan metodun cagrilmasi
		
		// System.out.println("olusturulan array elemanlari toplami = " + tekrarliList(arr));
		
		scan.close();
		
		
		
   }
	
	/* 3. adim array elemanlarini toplayan metod yazalim
	
	public static int tekrarliList(int arrSum []) {
		
		int sum = 0 ;
		
		for (int x : arrSum) {
			if (arrSum.)
			sum += each;
		}
		
		return sum;*/
		
	}


