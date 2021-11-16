package depedency;

public class Fotocopy {
    private String AlatTulis;
    private double Harga_alatTulis, Total_pendapatan;
    
    public String getAlatTulis() {
        return AlatTulis;
    }
    
    public void setAlatTulis (String AlatTulis) {
        this.AlatTulis = AlatTulis;
    }
    
    public double getHarga_alatTulis() {
        return Harga_alatTulis;
    }
    
    public void setHarga_alatTulis (double Harga_alatTulis) {
        this.Harga_alatTulis = Harga_alatTulis;
    }
    
    public double getTotal_pendapatan() {
        return Total_pendapatan;
    }
    
    public void setTotal_pendapatan (double Total_pendapatan) {
        this.Total_pendapatan = Total_pendapatan;
    }
    
    public void BuatPendapatan() {
        System.out.println(" Alat Tulis     : " + this.AlatTulis);
        System.out.println("Total Pendapatan  : " + this.Total_pendapatan);
        System.out.println("===============================================");
    }
}
