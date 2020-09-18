import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;

class JavaFlappyBirdRunner extends JFrame
{
	private static final int WIDTH = 720;
	private static final int HEIGHT = 1280;

	public JavaFlappyBirdRunner()
	{
		super("Flappy Bird");

		setSize(WIDTH,HEIGHT);

		//This line loads the BreakOut game
		getContentPane().add( new JavaFlappyBird() );
				
		setVisible(true);
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main( String args[] )
	{
		JavaFlappyBirdRunner run = new JavaFlappyBirdRunner();
	}
}