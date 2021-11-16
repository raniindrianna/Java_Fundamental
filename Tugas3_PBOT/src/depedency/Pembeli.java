package depedency;

    
public class Pembeli {
    private String namaPembeli;
    private String telpPembeli;
    
    public String getnamaPembeli() {
        return namaPembeli;
    }
    
    public void setnamaPembeli(String namaPembeli){
        this.namaPembeli = namaPembeli;
    }
    
    public String gettelpPembeli() {
        return telpPembeli;
    }
    
    public void settelpPembeli(String telpPembeli) {
        this.telpPembeli = telpPembeli;
    }
    
    public void InfoPembeli() {
        System.out.println("==========PESANAN===========");
        System.out.println("Nama Pemesan    :   "+ this.namaPembeli);
        System.out.println("Nomor Telepon   :   "+this.telpPembeli);
    }
}
