import java.util.Scanner;
public class user {
    public static void main(String[] args){
        final String username = "lwh";

        final String password = "123456";

        System.out.println("请输入你的用户名");

        Scanner scanner = new Scanner (System.in);

        String usernameinput = scanner.next();

            if(username.equals(usernameinput)){
            System.out.println("请输入你的密码");

            String userpassword = scanner.next();

            if(password.equals(userpassword)){
                System.out.println("Welcome");
            }
            else{
                System.out.println("密码错误");
            }
        }
        else{
            System.out.println("没有该用户名");
        }

    }
}
