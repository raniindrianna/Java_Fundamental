package javaCollection;
import java.util.*;

public class Niece implements Comparable<Niece> {
	private String name;
	private int birthDay;
	private int birthMonth;
	Map<Uncle, String> presents = new HashMap<Uncle, String>();
	
	public void setName(String name) {
		this.name= name;
	}
	
	public String getName() {
		return name;
	}

	public int getBirthDay() {
		return birthDay;
	}
	
	public void setbirthDay(int birthDay) {
		this.birthDay = birthDay;
	}

	public int getBirthMonth() {
		return birthMonth;
	}

	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}
	
	public Map<Uncle, String> getPresents(){
		return this.presents;
	}
	public int clearPresents() {
		int countPresent = presents.size();
		presents.clear();
		return countPresent ;
	}
	 public void listPresents() {
	        System.out.println("=========================================");
	        System.out.println("List of presents for " + this.name + ":");
	        for (Map.Entry<Uncle, String> entry : presents.entrySet()) {
	            System.out.print("- ");
	            System.out.print(entry.getKey().getName());
	            System.out.println((entry.getValue()==null ? " hasn't given present" : " give " + entry.getValue()));
	        }
	    }
	public String toString() {
		return "Name: " + name + " | BirthDay: " + birthDay + "-" + birthMonth;	
	}
	public boolean equals(Object other) {
		if(other == this)return true;
		if(other == null) return false;
		if(getClass() != other.getClass()) return false;
		return name.equals(((Niece)other).name);
	}
	public int hashCode() {
		return name.hashCode();
	}
	public int compareTo(Niece other) {
		if(this.birthMonth > other.birthMonth) return 1;
		if(this.birthMonth == other.birthMonth) {
			return (this.birthDay > other.birthDay ? 1 : -1);
		}
		return -1;
	}	
}
