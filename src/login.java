import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login implements ActionListener {
    JFrame frame =new JFrame();
    JLabel lable=new JLabel();
    JTextField userIDField =new JTextField();
    JButton button= new JButton("click me");
    public login(){
        userIDField.setBounds(100,10,200,20);
        button.setBounds(100,40,200,20);
        button.addActionListener(this);
        lable.setBounds(100,50,200,50);
        frame.add(lable);
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text;
        if (e.getSource()==button){
            text=userIDField.getText();
                    lable.setText(text);
                    int data=Integer.parseInt(text);
            System.out.println(data*data);
            new login();
        }
    }
}
