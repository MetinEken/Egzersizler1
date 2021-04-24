package Inheritance;

import java.util.ArrayList;
import java.util.List;

public class Isci extends Muhasebe{
	
	Isci(){
		System.out.println("isci constractir calisti");
	}
public static void main(String[] args) {
	
	Isci obj = new Isci();
	
	String isim = "Ali";
	List<String> str = new ArrayList<>();
	str.add("Ali");
	System.out.println(str);
}
}
