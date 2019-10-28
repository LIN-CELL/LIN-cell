package com.app.user;

import java.io.*;

public class UserServiceImpl implements UserService {
    @Override

    public int login(UserLnfo userLnfo) {
        //根据用户名寻找相关用户文件
        //1.寻找文件
        String filepath = "./users/";
        File file = new File(filepath + userLnfo.getUsername());
        //UserLnfo FindPassword = FindPassword(userLnfo.getUsername());
        int  result = 0;
        if(file.exists()) {
              result = 1;
         /*   if ((FindPassword.equals(userLnfo.getPassword()))) {
                System.out.println(" 登录成功");
                System.out.println("欢迎你" + userLnfo.getUsername());
            }*/
        }
        else {
            System.out.println("用户名不存在");
        }
        return result;
    }

    @Override
    public  Boolean register (UserLnfo userLnfo) {
        Boolean result = false;
        //新建文件
        String filepath = "./users/";
        String filename = filepath + userLnfo.getUsername();
        try {
            File file = new File(filename);
            if (!file.exists()) {
                file.createNewFile();
                //写入用户信息
                BufferedWriter out = new BufferedWriter(new FileWriter(file));
                out.write(userLnfo.getUsername());
                out.write(userLnfo.getPassword());
                out.close();
                result = true;
            }

        }catch (IOException e){
            e.printStackTrace();
        }
        //写入文件，保存文件
        return result;
    }

    @Override
    public String FindPassword(String name) {
        UserLnfo userLnfo = new UserLnfo();
        String filepath = "./users/";
        File file = new File(filepath + name);
        String r = "123456";
        if(file.exists()){
            try{
                BufferedReader in = new BufferedReader(new FileReader(file));
               String findPassword = in.readLine();
              // System.out.println(findPassword);
               in.close();
              userLnfo.setPassword(findPassword);
               r = userLnfo.getPassword();
              // System.out.println(r);
            }catch (IOException e){
                e.printStackTrace(); }
        }
        return r;
    }
}
