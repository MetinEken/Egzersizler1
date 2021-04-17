package yeniDeneme;

public class Swap {

	public static void main(String[] args) {
		int a =10;
		int b=20;
		
		a=a-b; // 10-20=-10
		b=a+b; // -10+20=10
		a=b-a; // 10--10=20
		
		System.out.println(a); // 20
		System.out.println(b); //10
	// swap takas demek a==b oldu  //  b=a oldu
	//	temp ile degisturmek
		int temp;
		
		temp=a;
		a=b; // a b ye esit oldu
		b=temp;	// b de gecici deger atanan temp(a) esit oldu
		
		System.out.println(a); // 20
System.out.println(b);// 10
	}

}
