package SOAL2;

public class Animal {
    private String name;
    private int JmlKaki;
    
    public Animal() {
        name="cat";
        JmlKaki=4;
    }
    
    
    public Animal(String name) {
        this.name=name;
        JmlKaki=4;
    }
    
    public Animal(String name, int Jmlkaki) {
        this.name=name;
        this.JmlKaki=Jmlkaki;
    }
    
    public String toString() {
        return "animal : " +name+"have " +JmlKaki; 
    }
   
    
}
