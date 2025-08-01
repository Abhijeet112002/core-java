package com.tutorsdude.methodTask;

public class Attendence {

    private String checkIn;
    private String checkout;
    private int total;

    public Attendence(String checkIn, String checkout, int total) {
        this.checkIn = checkIn;
        this.checkout = checkout;
        this.total = total;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
