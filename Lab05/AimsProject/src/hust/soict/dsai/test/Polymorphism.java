package hust.soict.dsai.test;

import java.util.List;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Track;

import java.util.ArrayList;

public class Polymorphism {

    public static void main(String[] args) {
        List<Media> media = new ArrayList<Media>();
        CompactDisc cd = new CompactDisc("DVD book","John","Williams",6.00f);
        DigitalVideoDisc dvd = new DigitalVideoDisc("Casas","Rap","Traevis",7,8.52f);
        Book book = new Book("Life of Pi","Adventure",5.32f);
        media.add(cd);
        media.add(dvd);
        media.add(book);

        for(Media m: media) {
            System.out.println(m.toString());
        }
    }

}