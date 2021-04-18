package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Pratic {
	public static void main(String[] args) {
		
		List<Integer> metinListe = new ArrayList<>();
		
		metinListe.add(1);
		metinListe.add(2);
		metinListe.add(3);
		metinListe.add(4);
		metinListe.add(5);
		metinListe.add(6);
		System.out.println(metinListe);
		
//1- listeyi tersten yazdirip yeni bir liste olusturalim	
//2- cift sayilardan olusan baska bir liste yapalim
//3- listeyi ayni isimle tersten yazdirip kaydedelim		
		
		ListIterator temp1 =metinListe.listIterator();// iterator olusturuken, sag bastaki list
		
		//buyuk harfle, sol sondaki list kucuk harfle basliyor. entersting yav
		
		List<Integer> ters = new ArrayList();
		
		while(temp1.hasNext()) {
			temp1.next();			// bu sekilde imleci sona aldik
		}
		
		while(temp1.hasPrevious()) {
			
			int temp2 = (int) temp1.previous();
			
			ters.add(temp2);
			
		} System.out.println("1- kalici tesr liste olusturuldu :\r\n" + ters);
		
		List<Integer> ciftSayilar=new ArrayList();
		
		while(temp1.hasNext()) {
			
			int temp3= (int) temp1.next();
			if(temp3%2==0) {
				ciftSayilar.add(temp3);
			}
			
		} System.out.println("2- Cift sayilardan olusan yeni list : \r\n" + ciftSayilar);
		List<Integer> sepet= new ArrayList();
		while(temp1.hasPrevious()) {
		int temp4 =(int)temp1.previous();
		sepet.add(temp4);
			
		}
		
		metinListe.clear();
		metinListe.addAll(sepet);
		
		System.out.println("3- Ilk liste terse cevrildi ve kalici kaydedildi\r\n");
	}
	

}

