package depedency;
import java.util.Scanner;

public class Pesanan {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Cafe cafe = new Cafe();
        Pemesan pemesan = new Pemesan();
        int pilih;
        String name;
        int noAntrian;
        
        System.out.println(" *********** DAFTAR MENU ***********");
        System.out.println("        Minuman             Harga");
        System.out.println(" 1.    Cappucinno            Rp.18.000,-");
        System.out.println(" 2.    Americano             Rp.25.000.-");
        System.out.println(" 3.    Macchiato             Rp.20.000,-");
        System.out.println(" 4.    Kopi Gula Aren        Rp.23.000,-");
        System.out.print("Pilih Minuman : ");
        pilih = keyboard.nextInt();
        
        switch(pilih){
            case 1 :
            {
                System.out.println("Anda memesan Minuman Cappucino");
                cafe.setMinuman("Cappucino");
                cafe.setHargaMinuman(18000.0);
                break;
            }
            case 2 : 
            {
                System.out.println("Anda memesan Minuman Americano");
                cafe.setMinuman("Americano");
                cafe.setHargaMinuman(25000.0);
                break;
            }
            case 3 :
            {
                System.out.println("Anda memesan Minuman Macchiato");
                cafe.setMinuman("Macchiato");
                cafe.setHargaMinuman(20000.0);
                break;
            }
            case 4 :
            {
                System.out.println("Anda memesan Minuman Latte");
                cafe.setMinuman("Cappucino");
                cafe.setHargaMinuman(18000.0);
                break;
            }  
    }
         System.out.println("========= Isi Data Pemesan =========");
         System.out.print("Nama Pemesan : ");
         name = keyboard.next();
         pemesan.setNamaPemesan(name);
         System.out.print("Nomor Antrian : ");
         noAntrian = keyboard.nextInt();
         pemesan.setnoAntrian(noAntrian);
         
         cafe.getTotal_Harga();
         pemesan.InfoPemesan();
         cafe.BuatPesanan();
    }
}
