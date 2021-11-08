package depedency;

public class Cafe {
    private String Minuman;
    private double HargaMinuman, Total_Harga;
    
    public String getMinuman() {
        return Minuman;
    }
    
    public void setMinuman(String Minuman) {
        this.Minuman = Minuman;
    }
    
    public double getHargaMinuman() {
        return HargaMinuman;
    }
    
    public void setHargaMinuman(double HargaMinuman) {
        this.HargaMinuman = HargaMinuman;
    }
    
    public double getTotal_Harga() {
        return Total_Harga;
    }
    
    public void setTotal_Harga(double Total_Harga) {
        this.Total_Harga = Total_Harga;
    }
    
    public void BuatPesanan() {
        System.out.println("Minuman     : " +this.Minuman);
        System.out.println("Total Harga : " +this.Total_Harga);
        System.out.println("====================================");
    }

    
    }
