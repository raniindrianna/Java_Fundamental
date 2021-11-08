package depedency;

public class Pemesan {
    private String namaPemesan;
    private Integer noAntrian;
    
    public String getNamaPemesan() {
        return namaPemesan;
    }
    
    public void setNamaPemesan(String namaPemesan) {
        this.namaPemesan = namaPemesan;
    }
    public int getnoAntrian() {
        return noAntrian;
    }
    
    public void setnoAntrian(int noAntrian){
        this.noAntrian = noAntrian;
    }
    
    public void InfoPemesan() {
        System.out.println("======== PESANAN ========");
        System.out.println("Nama Pemesan    : " +this.namaPemesan);
        System.out.println("Nomor Antrian   : " +this.noAntrian);
        
    }
}
