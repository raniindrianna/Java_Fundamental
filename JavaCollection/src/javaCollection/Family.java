package javaCollection;

import java.util.*;

public class Family {
    private Set<Niece> nieces;
    private Set<Uncle> uncles;

    public Family() {
        this.nieces = new HashSet<Niece>();
        this.uncles = new HashSet<Uncle>();
    }

    public boolean addNiece(String name, int day, int month) {
        Niece temp = new Niece();
        temp.setName(name);
        temp.setbirthDay(day);
        temp.setBirthMonth(month);
        if(nieces.add(temp)) {
            this.updatePresentList();
            return true;
        }
        return false;
    }

    public boolean addUncle(String name) {
        Uncle temp = new Uncle();
        temp.setName(name);
        if(uncles.add(temp)) {
            this.updatePresentList();
            return true;
        }
        return false;
    }

    public Niece findNiece(String name) {
        for(Iterator<Niece> it = nieces.iterator(); it.hasNext(); ) {
            Niece n = it.next();
            if(n.getName().equals(name)) return n;
        }
        return null;
    }

    public Uncle findUncle(String name) {
        for(Iterator<Uncle> it = uncles.iterator(); it.hasNext(); ) {
            Uncle u = it.next();
            if(u.getName().equals(name)) return u;
        }
        return null;
    }

    public void listNieces() {
        TreeSet<Niece> sortedNieces = new TreeSet<Niece>(nieces);
        System.out.println(sortedNieces);
    }

    public void listUncles() {
        TreeSet<Uncle> sortedUncles = new TreeSet<Uncle>(uncles);
        System.out.println(sortedUncles);
    }

    private void updatePresentList() {
        for (Uncle uncle : uncles)  {
            for (Niece niece : nieces)   {
                if(!uncle.getPresents().containsKey(niece)) {
                    uncle.addPresent(niece, null);
                }
            }
        }
    }
}
