package com.DIP;

public class Main {
    public static void main(String[] args) {
        Book books=new Book();
        Shelf shelfs=new Shelf();
        DVD dvds=new DVD();
        shelfs.SelfShelf();
        shelfs.addProduct();
        books.purchase();
        books.seeReviews();
        dvds.purchase();
        dvds.seeReviews();
    }
}
