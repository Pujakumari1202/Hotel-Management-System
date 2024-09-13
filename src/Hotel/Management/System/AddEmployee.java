package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;

public class AddEmployee  extends JFrame {
    JTextField nameText,ageText;

    JRadioButton radioButton,radioButtonF;
    public AddEmployee(){

        JPanel panel=new JPanel();
        panel.setBounds(5,5,890,490);
        panel.setLayout(null);
        panel.setBackground(new Color(3,45,48));
        add(panel);

        JLabel name=new JLabel("NAME");
        name.setBounds(60,30,150,27);
        name.setFont(new Font("serif",Font.BOLD,17));
        name.setForeground(Color.WHITE);
        panel.add(name);
        nameText=new JTextField();
        nameText.setBounds(200,30,150,27);
        nameText.setBackground(new Color(16,108,115));
        nameText.setFont(new Font("Tahoma",Font.BOLD,14));
        nameText.setForeground(Color.WHITE);
        panel.add(nameText);

        JLabel Age=new JLabel("AGE");
        Age.setBounds(60,80,150,27);
        Age.setFont(new Font("serif",Font.BOLD,17));
        Age.setForeground(Color.WHITE);
        panel.add(Age);
        ageText=new JTextField();
        ageText.setBounds(200,80,150,27);
        ageText.setBackground(new Color(16,108,115));
        ageText.setFont(new Font("Tahoma",Font.BOLD,14));
        ageText.setForeground(Color.WHITE);
        panel.add(ageText);

        JLabel gender=new JLabel("GENDER");
        gender.setBounds(60,120,150,27);
        gender.setFont(new Font("serif",Font.BOLD,17));
        gender.setForeground(Color.WHITE);
        panel.add(gender);

        radioButton=new JRadioButton("MALE");
        radioButton.setBounds(200,120,70,27);
        radioButton.setBackground(new Color(3,45,48));
        radioButton.setFont(new Font("Tahoma",Font.BOLD,14));
        radioButton.setForeground(Color.WHITE);
        panel.add(radioButton);

        radioButtonF=new JRadioButton("FEMALE");
        radioButtonF.setBounds(280,120,100,27);
        radioButtonF.setBackground(new Color(3,45,48));
        radioButtonF.setFont(new Font("Tahoma",Font.BOLD,14));
        radioButtonF.setForeground(Color.WHITE);
        panel.add(radioButtonF);

        JLabel job=new JLabel("JOB");
        job.setBounds(60,170,150,27);
        job.setFont(new Font("serif",Font.BOLD,17));
        job.setForeground(Color.WHITE);
        panel.add(job);

        //we take combobox to store the string in an array






        setLocation(60,160);
        setLayout(null);
        setSize(900,500);
        setVisible(true);


    }

    public static void main(String[] args) {
        new AddEmployee();

    }
}
