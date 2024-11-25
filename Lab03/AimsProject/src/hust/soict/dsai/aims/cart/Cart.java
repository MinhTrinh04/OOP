package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered =0;

 

    public int addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full. Can't add more díc");
            return 0;
        } else {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered ++;
            System.out.println("The DVD " + '\"' +disc.getTitle() + '\"' + " have been added!");
            return 1;
        }
    }
    //Ham them dia vào gio hang theo List 
//    public int addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
//        int addCount = 0;
//        for (DigitalVideoDisc disc : dvdList) {
//            if (qtyOrdered == MAX_NUMBERS_ORDERED) {
//                System.out.println("The cart is almost full. Can't add more discs");
//                break;
//            } else {
//                itemsOrdered[qtyOrdered] = disc;
//                qtyOrdered++;
//                System.out.println("The DVD " + '\"' + disc.getTitle() + '\"' + " has been added!");
//                addCount++;
//            }
//        }
//        return addCount;
//    }
    
    //Ham them dia vào gio hang theo List voi so luong tuy y
    public int addDigitalVideoDisc(DigitalVideoDisc... dvdArray) {
        int addCount = 0;
        for (DigitalVideoDisc disc : dvdArray) {
            if (qtyOrdered == MAX_NUMBERS_ORDERED) {
                System.out.println("The cart is almost full. Can't add more discs");
                break;
            } else {
                itemsOrdered[qtyOrdered] = disc;
                qtyOrdered++;
                System.out.println("The DVD " + '\"' + disc.getTitle() + '\"' + " has been added!");
                addCount++;
            }
        }
        return addCount;
    }
    //Ham them 2 dia DVD
    public int addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (qtyOrdered + 1 >= MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full. Can't add more discs");
            return 0;
        } else {
            itemsOrdered[qtyOrdered] = dvd1;
            qtyOrdered++;
            System.out.println("The DVD " + '\"' + dvd1.getTitle() + '\"' + " has been added!");

            itemsOrdered[qtyOrdered] = dvd2;
            qtyOrdered++;
            System.out.println("The DVD " + '\"' + dvd2.getTitle() + '\"' + " has been added!");

            return 2; //Tra ve so dia DVD da them duoc
        }
    }


    //Hàm xoá đĩa (Khi cấu trúc dữ liệu của đĩa DVD là 1 mảng cấu trúc)
    public int removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if(itemsOrdered[0] ==  null) {
            System.out.println("Your cart is empty!");
            return 0;
        }
        for(int i =0; i < qtyOrdered;i++) {
            if(itemsOrdered[i].equals(disc)) {
                for(int j = i;i<qtyOrdered-1;i++) {
                    itemsOrdered[i] = itemsOrdered[i+1];
                }
                itemsOrdered[qtyOrdered-1] = null;
                qtyOrdered--;
                System.out.println("Remove DVD " + '\"'+ disc.getTitle() + '\"' + " successfully!");
                return 1;
            }
        }
        System.out.println("No DVD match!");
        return 0;
        
    }

    //Hàm tính tổng giá tiền đĩa
    public float totalCost() {
        float sum = 0.00f;
        for(int i =0;i< qtyOrdered;i++) {
            sum += itemsOrdered[i].getCost();
        }
        return sum;
    }
    
    
  //Section 6
    public void printCart() {
      System.out.println("***********************CART***********************");
      System.out.println("Ordered Items:");
      for (int i = 0; i < qtyOrdered;i++) {
    	  System.out.println(i+1 + ".[" + itemsOrdered[i].getTitle() + "] - [" + itemsOrdered[i].getCategory() + "] - ["
                  + itemsOrdered[i].getDirector() + "] - [" + itemsOrdered[i].getLength() + "]: "
                  + itemsOrdered[i].getCost() + " $\n");
      }
      System.out.println("total: "+ this.totalCost() +" $\n");
      System.out.println("**************************************************");
    }
    
    //SearchByID
    public void searchById(int id) { 
        boolean found = false;
        for (DigitalVideoDisc dvd : itemsOrdered) {
            if (dvd != null && dvd.getId() == id) {
                System.out.println("DVD found by ID: "+ "[" + dvd.getTitle() + "] - ["+ dvd.getCategory() + "] - ["+ dvd.getDirector() + "] - ["+ dvd.getCost() +"]" );
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No DVD found with ID: " + id);
        }
    }

    //SearchByTitle
    public void searchByTitle(String title) {
        boolean found = false;
        for (DigitalVideoDisc dvd : itemsOrdered) {
            if (dvd != null && dvd.getTitle().equalsIgnoreCase(title)) {
                System.out.println("DVD found by Title: " + "[" + dvd.getTitle() + "] - ["+ dvd.getCategory() + "] - ["+ dvd.getDirector() + "] - ["+ dvd.getCost() +"]" );
                found = true;
            }
        }
        if (!found) {
            System.out.println("No DVD found with Title: " + title);
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
