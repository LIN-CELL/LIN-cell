package com.app.homework;

public class novel extends Book {
    private String type;

    public void setpages(int pages){

        super.setPages(getPages()+pages);
    }
    public void setprice(double price){

        super.setPrice(getPrice()+price);
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
