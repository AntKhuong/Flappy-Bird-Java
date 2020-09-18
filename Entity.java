import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;

abstract class Entity extends Canvas
{
	private int x, y, w, h;
	
	public Entity(int xpos, int ypos, int wd, int ht)
	{
		x = xpos;
		y = ypos;
		w = wd;
		h = ht;
	}
	
	public int getX() 				{ return x; }
	public void setX( int xpos ) 	{ x = xpos; }
	public int getY() 				{ return y; }
	public void setY( int ypos ) 	{ y = ypos; }
	public int getW() 				{ return w; }
	public int getH() 				{ return h; }
	
	public boolean intersects( Entity other )
	{	
		Rectangle test = new Rectangle(x,y,w,h);
		Rectangle test2 = new Rectangle(other.getX(),other.getY(),other.getW(),other.getH());
		
		if(test2.intersects(test))
			return true;
		return false;
	}
	
	public abstract void paint( Graphics window );
}