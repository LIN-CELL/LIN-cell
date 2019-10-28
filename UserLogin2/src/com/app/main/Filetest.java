package com.app.main;

import java.io.File;
import java.io.IOException;

public class Filetest {
    public static void main(String[] args) {
        try {
            File file = new File("./users/test1.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

