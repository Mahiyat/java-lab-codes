import java.awt.*;

import javax.swing.*;

public class BanglaFont extends JFrame

{

    JTextField text2;

    public BanglaFont()

    {

        Font displayFont1=new Font("SutonnyMJ", Font.BOLD,15);

        setSize(300,200);

        setTitle("JTextField Font");

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel=new JPanel();

        getContentPane().add(panel);

        panel.setLayout(null);                

        text2=new JTextField("Kw¤úDUvi");

        text2.setFont(displayFont1);

        text2.setBounds(100,40,100,30);

        panel.add(text2,BorderLayout.WEST);

    }

    public static void main(String args[])

    {

        BanglaFont x=new BanglaFont();

        x.setVisible(true);

    }

}