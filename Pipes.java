import java.awt.*;

class Pipes extends Entity {
	
	public Pipes(int xpos, int ypos, int wd, int ht) {
		super(xpos, ypos, wd, ht);
		
	}

	
	public void position() {
		
	}
	
	public void paint(Graphics window) {
		Graphics2D g2 = (Graphics2D) window;
		Image img1 = Toolkit.getDefaultToolkit().getImage("pipes.png");
		g2.drawImage(img1, getX(), getY(), getW(), getH(), this);
	}
}
