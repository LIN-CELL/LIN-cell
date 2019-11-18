import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FORM extends JFrame {
    private JPanel userlogin;
    private JLabel userLabel;
    private JTextField userText;
    private JLabel passwordLabel;
    private JPasswordField passwordText;
    private JButton loginButton;
    private JButton register;


    public  FORM(){
        setTitle("Login");
        setSize(350,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        userlogin = new JPanel();
        userlogin.setLayout(null);
        userLabel = new JLabel("User");
        userLabel.setBounds(10,20,80,25);
        userlogin.add(userLabel);
        userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        userlogin.add(userText);

        passwordLabel = new JLabel("password");
        passwordLabel.setBounds(10,40,80,25);
        userlogin.add(passwordLabel);
        passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        userlogin.add(passwordText);

        loginButton = new JButton("login");
        loginButton.setBounds(20,100,80,25);
        userlogin.add(loginButton);

        register = new JButton("register");
        register.setBounds(240,100,80,25);
        userlogin.add(register);
         add(userlogin);
        loginButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    WeChatForm weChatForm = new WeChatForm();
                    weChatForm.setFrameWechatVisible(true);
                    dispose();
                }
        });


    }
    public void setFrameloginVisible(Boolean visible){
        setVisible(visible);
    }
}
