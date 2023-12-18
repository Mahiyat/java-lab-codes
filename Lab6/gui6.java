import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.FlowLayout;

public class gui6
{
    public static void main(String[] args)
    {
	JFrame frame=new JFrame("Layout");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	JButton jb1=new JButton("Buttone 1");
	JButton jb2=new JButton("Buttone 2");
	JButton jb3=new JButton("Buttone 3");

	JPanel panel=new JPanel();
	panel.setLayout(new FlowLayout());
	panel.add(jb1);
	panel.add(jb2);
	panel.add(jb3);

	frame.add(panel);
	frame.pack();
	frame.setVisible(true);
    }
}