package Agregation;

public class Jurusan {
    private String kodeJurusan, 
    private String namaJurusan;
    private String mahasiswa;
    private Mahasiswa[] Daftar = new Mahasiswa[10];
    public Jurusan(String kode, String nama) {
        this.kodeJurusan = kode;
        this.namaJurusan = nama;
  }
    private static int JmlMhs = 0;
  public void addMahasiswa(Mahasiswa m) {
   this.Daftar[JmlMhs] = m;
   this.JmlMhs++;
  }
  public void displayMahasiswa() {
    int i;
    System.out.println("Kode Jurusan : "+this.kodeJurusan);
    System.out.println("Nama Jurusan : "+this.namaJurusan);
    System.out.println("Daftar Mahasiswa :");
    for (i=0;i<JmlMhs;i++) {
      System.out.println(Daftar[i].GetNim()+" "+Daftar[i].GetNama());
}
  }
}