public class Bicycle {
   private int gear;
   public int s;
   
   
   public Bicycle(int gear,int s) {
       this.gear=gear;
       this.s=s;
   } 
   
   
   public void applyBrake(int decrement) {
       s -= decrement;
   }
   
   public void speedUp(int increment ) {
       s += increment;
   }
   
   public String toString() {
       return("No of gears are"+gear+"\n" 
               +"speed of bycle is "+s);
               
   }
    
}