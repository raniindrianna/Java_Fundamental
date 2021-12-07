package javaCollection;

public class Main {
	public static void main(String[] args) {
		Family family = new Family();
		
		//add niece
		family.addNiece("Rani", 30, 03);
		family.addNiece("Marcel", 5, 03);
		
		//checking if add same niece
		if(!family.addNiece("Rani", 30, 03)) {
			System.out.println("You add double value");
		}
		
		//add uncle 
		family.addUncle("Diamond");
		family.addUncle("Shinchan");
		
		//find uncle
		Uncle uncle = family.findUncle("Diamond");
		Uncle uncle1 = family.findUncle("Shinchan");
		if(family.findUncle("paman") == null) {
			System.out.println("Uncle not found!");
		}
		
		//add present
		uncle.addPresent(family.findNiece("Rani"), "Makeup");
		family.addNiece("Alex", 29, 06);
		
		//checking uncle give same present to niece
		uncle.addPresent(family.findNiece("Alex"), "Jacket");
		uncle.addPresent(family.findNiece("Marcel"),"Jacket");
		
		//check that two uncles give the same gift to one niece
		uncle1.addPresent(family.findNiece("Alex"), "Jacket");
		//family.findNiece("Alex").listPresents();
		
		
		//checking list nieces, uncle and presents
		family.listNieces();
		family.listUncles();
		uncle.listPresents();
		family.findNiece("Rani").listPresents();
		family.findNiece("Alex").listPresents();
	}
}
