package hust.soict.dsai.aims.store;
import java.util.ArrayList;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
	  private ArrayList<DigitalVideoDisc> itemsInStore;

	  public Store() {
	    itemsInStore = new ArrayList<>();
	  }
	  
	  private boolean checkDVD(DigitalVideoDisc disc) {
	        for (DigitalVideoDisc digitalVideoDisc : itemsInStore) {
	            if (digitalVideoDisc.equals(disc)) {
	                return true;
	            }
	        }
	        return false;
	  }
	  
	  public void addDVD(DigitalVideoDisc dvd) {
		  if(!itemsInStore.contains(dvd)) {
		    itemsInStore.add(dvd);
		   	System.out.println( dvd.getTitle() + " 've been added to the store !");
		  } 
		  else 
			  System.out.println(dvd.getTitle() + " 'already exists in the store !");
	  }

	  public void removeDVD(DigitalVideoDisc dvd) {
	    if(itemsInStore.contains(dvd)) {
	    	itemsInStore.remove(dvd);
	    	System.out.println( dvd.getTitle() + " 've been deleted from the store !");
	    }
	    else 
	      System.out.println("DVD not found!");
	  }
	}
