package D41;
import java.util.Scanner;
public class awanda {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        
      String a = input.nextLine();
      String b = input.nextLine();
      
     int nilai = Integer.parseInt(a);
     int angka = Integer.parseInt(b);
     
      int w = nilai + angka;
      int w1 = nilai - angka;
      int w2 = nilai * angka;
      int w3 = nilai / angka;
      int w4 = nilai % angka;
      
        boolean wnda = w > w2;
        System.out.println("penjumlahan:" +w);
        System.out.println("pengurangan:" +w1);
        System.out.println("perkalian:" +w2);
        System.out.println("pembagian:" +w3);
        System.out.println("mmodulus:" +w4);
        System.out.println("apakah penjumlahan lebih besar dari perkalian:" + wnda);
      
    }
    
}
