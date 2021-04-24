package Inheritance;

public class Muhasebe extends Personel{
	
	Muhasebe(String isim){
		super();
		//  yazmasak ta super calisir
		System.out.println("parametreli muhasebe konst.. calisti");
	}
	
	Muhasebe(){
		this("a"); // buraya ilk satira super yazamayiz. ya super olacak ya da this. this ve super ikiside ilk satirda olmasi gerekiyor
		System.out.println("Parametresiz muhasebe const.. calisti");
	}

}
