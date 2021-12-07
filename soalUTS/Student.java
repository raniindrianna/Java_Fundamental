package soalUTS;

public class Student {
    private int npm;
    private String name;
    private String address;
    private double ipk;
    private Faculty faculty;
    
    //constructor
    public Student() {
        this.npm=npm;
        this.name=name;
        this.address=address;
        this.ipk=ipk;
        this.faculty=faculty;
    }
    
    //method agar masing" variabel dpt di akses
    public int getNPM() {
        return npm;
    }
    
    public void setNPM(int npm) {
        this.npm=npm;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String Name) {
        this.name=name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address=address;
    }
    
  public double getIPK() {
        return ipk;
    }
    
    public void setIPK(double ipk) {
        this.ipk=ipk;
    }
    
    public Faculty getFaculty() {
        return faculty;
    }
    
    public void setFaculty(Faculty faculty) {
        this.faculty=faculty;
    }
    
    Student Wahyu = new Student (3490136, "Wahyu Hidayat", "Cimahi", 3.5,"JTK");
    Student Susi = new Student (3490212, "Susi Susilowati","Bandung",3.2, "Akuntansi");
    
    
}


