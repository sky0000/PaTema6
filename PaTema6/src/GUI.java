import java.io.IOException;
import java.util.Scanner;

import javax.swing.*;

///
public class GUI {
	public static void main(String [] args) throws IOException
	{
		new GUI();

	}

	public GUI()
	{
		JFrame f =new JFrame();
		f.setTitle("Maze Runner ");
		f.add(new Board());
		f.setSize(500, 500);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
