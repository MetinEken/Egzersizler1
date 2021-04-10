
package dersnotlari1;
	public class WhileLoop2{
		////tekrar eden islemlerde kullanilir (iken)
		public static void main(String[] args) {
			///islemi x=20 den baslat
			int x= 20;
			
			///start x in 20 den kucuk olmasi 
			while (x > 5 ) {
				System.out.println("value of x " + x);
				// 1 er 1 er azalt
				
				x--;
				///alt satira gecmek icin 
				System.out.println("\n");
			}
		}
	}