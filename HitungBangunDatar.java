import static java.lang.System.out;
import java.util.Scanner;

public class HitungBangunDatar {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
         System.out.println("1.Bujursangkar");
         System.out.println("2.persegi panjang");
         System.out.print("---Isikan Pilihan---:");
         
         int Pilihan = sc.nextInt();
         if (Pilihan==1){
             BujurSangkar bs = new BujurSangkar(10);
             //int luas = bs.hitungLuas(;
             //int keliling = bs.hitungkeliling();
             System.out.println(bs);
         }
    }     
}
