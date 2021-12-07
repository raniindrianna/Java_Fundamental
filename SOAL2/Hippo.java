package SOAL2;

public class Hippo extends Animal implements HabbitAnimal {
    
    public Hippo(String name, int JmlKaki) {
        super(name,JmlKaki);
    }
    
    public String toString() {
        return super.toString()+"and I can make sound MEONG";
    }
    
    public void eat() {
        System.out.println("I eat fish");
        
    }
    
    public void run() {
        System.out.println("RUNNN");
    }
}
