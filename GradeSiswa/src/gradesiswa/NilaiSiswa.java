package gradesiswa;

import java.util.Scanner;

public class NilaiSiswa {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        char grade;
        final double nilai_tugas , nilai_uts , nilai_uas , nilai_akhir;
        
        
        System.out.println(" === Menghitung Nilai Siswa === \n");
            
            System.out.print("Masukkan nilai tugas : ");
            nilai_tugas = keyboard.nextInt();
            
            System.out.print("Masukkan nilai UTS : ");
            nilai_uts = keyboard.nextInt();
            
            System.out.print("Masukkan nilai UAS : ");
            nilai_uas = keyboard.nextInt();
            
            nilai_akhir = (0.20 * nilai_tugas + 0.35 * nilai_uts + 0.45 * nilai_uas);
            
            if (nilai_akhir >= 85 && nilai_akhir <=100) {
                grade = 'A';
            }
            else if (nilai_akhir >= 75 && nilai_akhir <= 84) {
                grade = 'B';
            }
            else if (nilai_akhir >= 65 && nilai_akhir <= 74) {
                grade = 'C';  
            }
            else if (nilai_akhir >= 49 && nilai_akhir <= 64) {
                grade = 'D';  
            }
            else {
                grade = 'E';            
            }
            
            System.out.println("Nilai akhir = "+nilai_akhir);
            System.out.println("Hasil akhir yang di dapat : "+grade);
        }
    }
