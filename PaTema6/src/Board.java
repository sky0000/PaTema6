import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;


public class Board extends JPanel implements ActionListener{
 
	
	Player p;
	private Timer timer;
	public Maze m;
	
	public  Board()
	{
	m=new Maze();
	p =new Player();
	timer =new Timer(25,this);
	timer.start();
	addKeyListener(new Play());
	setFocusable(true);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		repaint();
		
	}

	public void paint(Graphics g)
	{
		super.paint(g);
for (int i =0 ;i<m.getRow();i++)
	for(int j =0 ; j<m.getColumn() ;j ++)
	{
		if(m.getPozitie(i, j)==0) g.drawImage(m.getLiber(), j*32, i*32, null);
		if(m.getPozitie(i, j)==1) g.drawImage(m.getOcupat(), j*32, i*32, null);
		//if(m.getPozitie(i, j)==-1) g.drawImage(m.getStart(), i*32, j*32, null);
		if(m.getPozitie(i, j)==2) g.drawImage(m.getFinish(), j*32, i*32, null);
	}
		
g.drawImage(p.getPlayer(),p.getTileX()*32,p.getTileY()*32,null);
	}


public class  Play extends KeyAdapter
{
	int [] start={1,1};
	public void keyPressed(KeyEvent e)
	{
		
	
	int ok=1;
	
			//m.getStartCell();
	int [] finish=m.getFinishCell();
	int [] pozitieCurenta=start;
	System.out.println("start"+pozitieCurenta[0]+" "+pozitieCurenta[1]+" finish"+ finish[0]+" "+finish[1]);

 
		int keycode=e.getKeyCode();
		if(keycode == KeyEvent.VK_W){ 
					if(m.moveUp(start[0], start[1])==1&&m.isFreeAt(start[0]-1, start[1])==1)
						if(m.map1[start[0]-1][start[1]]==2) 
							{
							p.move( 0, -1);
							start[0]=start[0]-1;
							JOptionPane.showMessageDialog(null, "FElicitari ,ai un os ");
							
							}			 
						else	
//
							{
								p.move( 0, -1);
								
								start[0]=start[0]-1;
								m.map1[start[0]][start[1]]=3;
								System.out.println(m.toString(""));
								m.map1[start[0]][start[1]]=0;
	                	
						}
		}
		          
		if(keycode == KeyEvent.VK_S) 
		{
					if(m.moveDown(start[0], start[1])==1&&m.isFreeAt(start[0]+1, start[1])==1)
						if(m.map1[start[0]+1][start[1]]==2)
						{  
							p.move( 0, 1);
							 start[0]=start[0]+1;
							JOptionPane.showMessageDialog(null, "FElicitari ,ai un os ");
						}

						else
						{
							p.move( 0, 1);
						  
						  start[0]=start[0]+1;
						  m.map1[start[0]][start[1]]=3;

						 System.out.println(m.toString(""));
						 m.map1[start[0]][start[1]]=0;
						}
						  
						  
						 
						}
		
		if(keycode == KeyEvent.VK_A)
		{
					if(m.moveLeft(start[0], start[1])==1&&m.isFreeAt(start[0],start[1]-1)==1)
						if(m.map1[start[0]][start[1]-1]==2)
							{
							p.move( -1,0);
							start[1]=start[1]-1;
							JOptionPane.showMessageDialog(null, "FElicitari ,ai un os ");
						
							}

							else
							{
								p.move(  -1, 0);
								
							 start[1]=start[1]-1;
							 m.map1[start[0]][start[1]]=3;
							 System.out.println(m.toString(""));
							 m.map1[start[0]][start[1]]=0;
							
	                	} 
		}
		if(keycode == KeyEvent.VK_D)	
		{
					if(m.moveRight(start[0], start[1])==1&&m.isFreeAt(start[0], start[1]+1)==1)
						if(m.map1[start[0]][start[1]+1]==2) 
							{  
							p.move( 1, 0);
							start[1]=start[1]+1;
							JOptionPane.showMessageDialog(null, "FElicitari ,ai un os ");
							}

							else
							{
								p.move(1,0);
							
							 start[1]=start[1]+1;
							 m.map1[start[0]][start[1]]=3;
							 System.out.println(m.toString(""));
							 m.map1[start[0]][start[1]]=0;
							
						 	} 
		}
	
		
	}
	}
}

