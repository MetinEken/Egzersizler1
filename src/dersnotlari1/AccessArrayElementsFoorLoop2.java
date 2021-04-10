package dersnotlari1;

public class AccessArrayElementsFoorLoop2 {

	public static void main(String[] args) {



        String citys[] = {"New York", "Mexico", "Los Angles"};


        //loop through the array
        //using for loop


        System.out.println("Using for loop: ");

        // dizi 3 elemanli ama 3. eleman yok. Cunku siralama 0. elemanda basliyor.

        for (int i = 0; i < citys.length; i++) {

            System.out.println(citys[i]);

            //System.out.println(citys[0]);
            //System.out.println(citys[1]);
            //System.out.println(citys[2]);



	}

}
}
