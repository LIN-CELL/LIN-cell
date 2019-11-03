package com.app.homework;

public class Magazine extends Book {
    private String cycle;//出版周期


    public void setpages(int pages){

        super.setPages(getPages()+pages);
    }
    public void setprice(double price){

        super.setPrice(getPrice()+price);
    }

    public String getCycle() {

        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }
}
