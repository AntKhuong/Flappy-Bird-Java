import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;


class JavaFlappyBird extends JPanel implements Runnable, KeyListener
{
	private boolean jumpKey;
	
	public JavaFlappyBird()
	{
		setBackground(Color.WHITE);

		jumpKey = false;
			
		addKeyListener( this );
		setFocusable( true );
		new Thread(this).start();
	}

	public void paint( Graphics window )
	{
		window.setColor(Color.WHITE); window.fillRect( 0,0, 720, 1280);
		window.setColor(Color.BLACK); window.drawRect( 0,0, 720, 1280);

		window.setColor(Color.BLUE);		
		
		if(jumpKey)
		{
			
		}					
	}

	public void keyPressed(KeyEvent e)
	{   
		if( e.getKeyCode()  == KeyEvent.VK_SPACE ) { jumpKey = true; }					
	}

	public void keyTyped(KeyEvent e)
	{
		keyPressed( e );			
	}		
	public void keyReleased(KeyEvent e)
	{
		
	}	
	
	public void run()
	{
		try
		{
			while( true )
			{	
			   Thread.sleep( 10 );
			   repaint();
			}
		}
		catch( Exception e )
		{			
		}
	}
}