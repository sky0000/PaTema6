import java.awt.Image;

import javax.swing.ImageIcon;


public class Player {
private int y,x,tileX,tileY;
private Image start;
public Player ()
{
	x=32;
	y=32;
	tileX=1;
	tileY=1;
	ImageIcon img= new ImageIcon("D:\\!Scoala\\gitRep\\Tema6\\PaTema6\\PaTema6\\src\\start.jpg");
		start =img.getImage();
}
public Image getPlayer()
{
	return start;
}
public int getX()
{
	return x;
}
public int getY()
{
	return y;
}
public int getTileX()
{
	return tileX;
}
public int getTileY()
{
	return tileY;
}
public void move(int dx,int dy,int tx,int ty)
{
	x+=dx;
	y+=dy;
	tileX+=tx;
	tileY+=ty;
}

}
