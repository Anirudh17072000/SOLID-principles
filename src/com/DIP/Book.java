package com.DIP;

public class Book implements Product{
    @Override

    public void seeReviews() {
        System.out.println("This is the most selling book of the year!");
    }

    @Override
    public void purchase() {
        System.out.println("Do yoy want to  purchase this book? Please visit our store");
    }
}
