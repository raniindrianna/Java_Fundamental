package tugas2;

import java.util.Scanner;

public class Fotocopy {
    private String AlatTulis;
    private Integer Stok_barang; 
    private Integer Harga_satuan;
    private Integer Harga_alatTulis; //Stok_barang*Harga_satuaN
    double x,y;
    
     Scanner keyboard = new Scanner(System.in);
    
    //Method getter and setter 
    public String getAlatTulis() {
        return AlatTulis;
    }
    
    public void setAlatTulis(String AlatTulis) {
        this.AlatTulis = AlatTulis;
    }
    
    public Integer getStok_barang() {
        return Stok_barang;
    }
    
    public void setStok_barang(Integer Stok_barang) {
        this.Stok_barang = Stok_barang;
    }
            
    public double getHarga_satuan() {
        return Harga_satuan;
    }
    
    public void setHarga_satuan(Integer Harga_Satuan) {
        this.Harga_satuan = Harga_Satuan;
    }
    
    public double getHarga_alatTulis(){
        return Harga_alatTulis;
    }
    
    public void setHarga_alatTulis(Integer Harga_alatTulis) {
        this.Harga_alatTulis = Stok_barang * Harga_satuan;
    }
        
  public void BuatPendapatan() {
       System.out.println("==============================================");
       System.out.println("Nama Alat Tulis  : "+AlatTulis);
       System.out.println("Stok Barang      : "+Stok_barang);
       System.out.println("Harga Satuan     : "+Harga_satuan);
       System.out.println("Total            : "+Harga_alatTulis);
       System.out.println("==============================================");
   } 
      
    }

    
    

