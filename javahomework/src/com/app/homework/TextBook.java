package com.app.homework;

public class TextBook extends Book {
    private String grade;

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setpages(int pages){

        super.setPages(getPages()+pages);
    }
    public void setprice(double price){

        super.setPrice(getPrice()+price);
    }

}
