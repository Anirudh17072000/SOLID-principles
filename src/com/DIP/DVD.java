package com.DIP;

public class DVD implements Product{
    @Override
    public void seeReviews() {
        System.out.println("See reviews of book.");
    }

    @Override
    public void purchase() {
        System.out.println("Get a free Purchased book from here.");
    }
}
