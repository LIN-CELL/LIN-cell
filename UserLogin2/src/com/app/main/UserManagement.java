package com.app.main;
import java.util.Scanner;
import com.app.user.UserLnfo;
import com.app.user.UserServiceImpl;
public class UserManagement {

    public  static void main (String[] args) {
        System.out.println("请输入你的选择 ");
        System.out.println("1 登录 2 注册");
        int choose;
        Scanner scanner = new Scanner(System.in);
        choose = scanner.nextInt();
        UserLnfo userLnfo = new UserLnfo();
        UserServiceImpl userService = new UserServiceImpl();
        switch(choose) {
            case 1:
                System.out.println("请输入你的用户名");
                userLnfo.setUsername(scanner.next());
                int result = userService.login(userLnfo);
                if(result==1) {
                    String r = userService.FindPassword(userLnfo.getUsername());
                    System.out.println("请输入你的密码");
                    userLnfo.setPassword(scanner.next());
                    if((r.equals(userLnfo.getUsername()+userLnfo.getPassword()))){
                    System.out.println("登录成功,欢迎你" + userLnfo.getUsername());
                    }else{
                        System.out.println("密码错误");
                    }
                }
                break;
            case 2:
                System.out.println("请输入你要注册的用户名");
                userLnfo.setUsername(scanner.next());
                System.out.println("请输入你的密码");
                userLnfo.setPassword(scanner.next());
                boolean r = userService.register(userLnfo);
                if(r){
                    System.out.println("注册成功");
                }
                else {
                    System.out.println("该用户已存在");
                }
                break;
        }
    }
}
