package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class collection {
	public static void main(String[] args) {
		
		LinkedList<Integer> linked = new LinkedList<>();
		
		linked.add(12);
		linked.add(11);
		linked.add(10);
		System.out.println(linked);
		linked.remove(1); // 11
		System.out.println(linked);
		// linked.remove(12); //java.lang.IndexOutOfBoundsException
		System.out.println(linked);
		
//====== Verilen bir Array'deki tekrarli elemanlari silip=====================
        // unique elemanlardan olusan bir Array'e ceviren 
        // bir method yaziniz		
		int arr[]= {1,2,3,2,3,4,4,5,6,7,8,9};
		
		int tekrarsizArray[]= tekrarSil(arr);
		
		System.out.println(Arrays.toString(arr));
				
	System.out.println(Arrays.toString(tekrarsizArray));
	
	
	zamanHesapla();

	
}
private static void zamanHesapla() {
	// linked fast more than set
		Set<String> set2 = new HashSet<>();
		
		System.out.println(System.currentTimeMillis());
		for( int i=0; i<100000; i++) {
			set2.add(""+i);
		}
		System.out.println("Set suresi : "+System.currentTimeMillis());
		System.out.println("===========================");
		
		LinkedList<String> set3 = new LinkedList<>();
		System.out.println(System.currentTimeMillis());
		for( int i=0; i<100000; i++) {
			set3.add(""+i);
		}
		System.out.println("Linken suresu : "+System.currentTimeMillis());
	}
// NASIL YAPTIK : Verilen array icindeki parametreleri olusturdugumuz gecici set list in icine for each ile ekledik
// olusan set deki argumanlari foreach ile tek tek tekrarsiz array icine ekledik.
// return e tekrarsiz array ismini verdik
// array yazdirirken mutlaka Arrays.toString(arr) ile yazdirilmalidir
// set ler her zaman tekrarsiz arguman alirlar. en onemli ozellikleri budur.	
// list leri yazdirmak icin toString metoduna gerek yoktur	
	
	private static int[] tekrarSil(int[] arr) {
		
		Set<Integer> set1 = new HashSet<>();
	
	for(Integer each : arr) {
		
		set1.add(each);
	}
		int index=0;
		
		int tekrarsizArray[]= new int[set1.size()];
		
		for(Integer each1: set1) {
			tekrarsizArray[index]=each1;
			index++;
			
		}
		
		return tekrarsizArray;
	}
	
}
