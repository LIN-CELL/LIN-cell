import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WeChatForm extends JFrame {
    private JPanel welecome;
    private JTextArea textArea;
    private JButton button;
    public WeChatForm(){
        setTitle("向你喜欢的人表白");
        setSize(350,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        welecome = new JPanel();
        welecome.setLayout(null);
        textArea = new JTextArea(5, 10);
        textArea.setBounds(50,25,100,120);
        textArea.setLineWrap(true);
        welecome.add(textArea);
         button = new JButton("表白");
         button.setBounds( 175,100,60,20);
        welecome.add(button);
        add(welecome);
        button.addActionListener(e -> System.out.println("我喜欢你"+textArea.getText()));
    }
    public void setFrameWechatVisible(Boolean visible){
        setVisible(visible);
    }
}
