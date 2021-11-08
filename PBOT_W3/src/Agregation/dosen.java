package Agregation;

public class dosen {
  private String Kddosen;
  private String[] nimMHS;
  private int JmlMahasiswa;
  public void setKddosen (String Kddosen) {
   this.Kddosen = Kddosen;
  }
  public void setNimMahasiswa (String nimMhs) {
    if (JmlMahasiswa<5) {
      nimMHS[JmlMahasiswa] = nimMhs;
      JmlMahasiswa++;
    }
  }
  public int getJmlMahasiswa () {
    return this.JmlMahasiswa;
  }
  public String getKddosen () {
    return this.Kddosen;
  }
  public String getMahasiswa (int i) {
    return (nimMHS[i]);
  }
}
    
