import java.awt.Image;

import javax.swing.ImageIcon;


public class Player {
private int y,x,tileX,tileY;
private Image start;
public Player ()
{

	tileX=1;
	tileY=1;
	ImageIcon img= new ImageIcon("D:\\!Scoala\\gitRep\\Tema6\\PaTema6\\PaTema6\\src\\start.jpg");
		start =img.getImage();
}
public Image getPlayer()
{
	return start;
}

public int getTileX()
{
	return tileX;
}
public int getTileY()
{
	return tileY;
}
public void move(int dx,int dy)
{
	
	tileX+=dx;
	tileY+=dy;
}

}
