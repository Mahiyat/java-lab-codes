import java.awt.event.*;
import javax.swing.*;

public class gui5
{
    public gui5()
    {
	JFrame f=new JFrame("test frame");

	JButton b=new JButton("click");
	b.setBounds(50,100,95,30);
	b.addActionListener(new ActionListener()
	{
	    @Override
	    public void actionPerformed(ActionEvent ae)
    	    {
		JOptionPane.showMessageDialog(null,"Hello.....");
        	ImageIcon icon=new ImageIcon("C:/Users/jucse/Desktop/Mahiyat/CSE-212/turtle.png");
		JOptionPane.showMessageDialog(null,"I like Turtles.","Customized Dialog",JOptionPane.INFORMATION_MESSAGE,icon);
    	    }
	});

	f.add(b);

	f.setSize(320,320);
	f.setLayout(null);
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {
	new gui5();
    }
}