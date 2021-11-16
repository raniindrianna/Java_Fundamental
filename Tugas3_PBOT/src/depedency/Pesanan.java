package depedency;

import java.util.Scanner;

public class Pesanan {
   public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       Fotocopy fotocopy = new Fotocopy();
       Pembeli pembeli = new Pembeli();
       int pilih;
       String nama;
       String notelp;
       
       System.out.println("=======Daftar Menu =========");
       System.out.println(" Alat Tulis      Harga");
       System.out.println(" 1. Pensil       Rp.5.000,-");
       System.out.println(" 2. Buku         Rp.6.000,-");
       System.out.println(" 3. Binder       Rp.35.000,-");
       System.out.print("Pilih Alat Tulis : ");
       pilih = keyboard.nextInt();
       
       switch(pilih) {
           case 1 :
           {
               System.out.println("Anda membeli Pensil.");
               fotocopy.setAlatTulis("Pensil");
               fotocopy.setHarga_alatTulis(5000);
               break;              
           }
           case 2 :
           {
               System.out.println("Anda membeli Buku.");
               fotocopy.setAlatTulis("Pensil");
               fotocopy.setHarga_alatTulis(6000);
               break; 
           }
           case 3 :
           {
               System.out.println("Anda membeli Binder.");
               fotocopy.setAlatTulis("Binder");
               fotocopy.setHarga_alatTulis(35000);
               break;
           }
       }
       System.out.println(" ============ Isi data Pemesan =======");
       System.out.print("Nama Pemesan : ");
       nama = keyboard.next();
       pembeli.setnamaPembeli(nama);
       System.out.print("Nomor Telepon : ");
       notelp = keyboard.next();
       pembeli.settelpPembeli(notelp);
       
       fotocopy.setTotal_pendapatan(0);
       pembeli.InfoPembeli();
       fotocopy.BuatPendapatan();
   }  
}
