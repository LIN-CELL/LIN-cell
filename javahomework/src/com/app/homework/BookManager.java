package com.app.homework;

public class BookManager {
    public static  void main(String[] args){
        BookServiceImpl bookService = new BookServiceImpl();
       // bookService.makebooks();
        bookService.showbooks();
    }
}
