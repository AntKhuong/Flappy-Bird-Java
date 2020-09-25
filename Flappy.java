import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;

class Flappy extends Entity
{
	private int yspeed;
	
	public Flappy(int xpos, int ypos, int wd, int ht, int ymov)
	{
		super(xpos, ypos, wd, ht);
		yspeed = ymov;
	}
	
	public int getYSpeed() { return yspeed; }
	public void setYSpeed(int ymov) { yspeed = ymov; }
	
	public void jump() { 
		setY( getY() - yspeed );
	}
	public void fall() { setY( getY() + yspeed/50); }
	
	public void paint( Graphics window ) {
		Graphics2D g2 = (Graphics2D) window;
		Image img1 = Toolkit.getDefaultToolkit().getImage("flappy.png");
		g2.drawImage(img1, getX(), getY(), getW(), getH(), this);
	}
}