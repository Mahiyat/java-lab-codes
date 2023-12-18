import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.GridLayout;

class gui7
{
    public static void main(String[] args)
    {
	JFrame frame=new JFrame("Layout");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	JButton jb1=new JButton("North");
	JButton jb2=new JButton("South");
	JButton jb3=new JButton("West");
	JButton jb4=new JButton("East");
	JButton jb5=new JButton("Center");

	JPanel panel=new JPanel();
	panel.setLayout(new BorderLayout());
	panel.add(jb1,BorderLayout.NORTH);
	panel.add(jb2,BorderLayout.SOUTH);
	panel.add(jb3,BorderLayout.WEST);
	panel.add(jb4,BorderLayout.EAST);
	panel.add(jb5,BorderLayout.CENTER);

	frame.add(panel);
	frame.pack();
	frame.setVisible(true);
    }
}