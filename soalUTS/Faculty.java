package soalUTS;

public class Faculty {
    private int id;
    private String name;
    private String description;
    
    //constructor
    public Faculty() {
        this.id=id;
        this.name=name;
        this.description=description;
}
    
    public int getID() {
        return id;
    }
    
    public void setID(int id) {
        this.id=id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String Name) {
        this.name=name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description=description;
    }
    }
    
    Faculty Akuntansi = new Faculty(1, "Akuntansi,","Jurusan Akuntansi");
    Faculty JTK = new Faculty(2, "JTK","Jurusan  Teknik Komputer");
    
    

}
