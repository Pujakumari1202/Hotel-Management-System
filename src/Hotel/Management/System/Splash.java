package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame {
    public Splash()
    {
        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icons/splash.gif"));
        Image i22 = imageIcon.getImage().getScaledInstance(1100,680, Image.SCALE_DEFAULT);
        ImageIcon imageIcon111 = new ImageIcon(i22);
        JLabel label=new JLabel(imageIcon111);
        label.setBounds(0,0,858,680);
//        label.setBackground(Color.BLACK);
//        label.setForeground(Color.WHITE);
        add(label);


        setLayout(null);
        setLocation(300,80);
        setSize(858,680);
        setVisible(true);

        try{
            Thread.sleep(5000);//showing for 5 sec then closed
            new Login();
            setVisible(false);//using this
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Splash();
    }
}
