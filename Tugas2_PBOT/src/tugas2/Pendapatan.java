package tugas2;

public class Pendapatan {

    public static void main(String[] args) {

        Fotocopy fotocopy = new Fotocopy();

        fotocopy.setAlatTulis("Buku");
        fotocopy.setStok_barang(20);
        fotocopy.setHarga_satuan(5000);
        fotocopy.setHarga_alatTulis(0);
        double x = fotocopy.getHarga_alatTulis();

        fotocopy.BuatPendapatan();

        fotocopy.setAlatTulis("Binder");
        fotocopy.setStok_barang(5);
        fotocopy.setHarga_satuan(35000);
        fotocopy.setHarga_alatTulis(0);
        double y = fotocopy.getHarga_alatTulis();

        fotocopy.BuatPendapatan();

        double Total_seluruh = x + y;
        System.out.println("Total pendapatan = Rp." + Total_seluruh);

    }
}
