package com.app.homework;

public class BookServiceImpl implements BookService {
    /*@Override
    public void makebooks() {


    }*/

    @Override
    public void showbooks() {
        int i = (int)(Math.random() * 2);
        for(int j=0;j<=i+1;j++){
            int r = (int)(Math.random() * 3);
          //int r=0;
            switch (r){
                case 0:
                    Magazine magazine = new Magazine();
                    magazine.setpages(20);
                    magazine.setprice(10);
                    magazine.setCycle("出版周期：一月一本");
                    System.out.println("杂志：");
                    System.out.println("页数："+magazine.getPages());
                    System.out.println("价格:"+magazine.getPrice());
                    System.out.println("出版周期:"+magazine.getCycle());
                    break;
                case 1:
                    novel faction = new novel();
                    int a = (int)(Math.random() * 10)*10+200;
                    faction.setpages(a);
                    faction.setprice(30);
                    faction.setType("悬疑小说");
                    System.out.println("小说:");
                    System.out.println("页数："+faction.getPages());
                    System.out.println("价格："+faction.getPrice());
                    System.out.println("类型:"+faction.getType());
                    break;
                case 2:
                    TextBook textbook = new TextBook();
                    textbook.setpages(200);
                    textbook.setprice(20);
                    textbook.setGrade("九年级");
                    System.out.println("课本");
                    System.out.println("页数："+textbook.getPages());
                    System.out.println("价格："+textbook.getPrice());
                    System.out.println("年级："+textbook.getGrade());
                    break;
            }
       }

    }
}



