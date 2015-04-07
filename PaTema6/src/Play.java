/*
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class  Play extends KeyAdapter
{
	
	public void keyPressed(KeyEvent e)
	{
		
	
	int ok=1;
	int [] start=this.
			getStartCell();
	int [] finish=m.getFinishCell();
	int [] pozitieCurenta=start;
	System.out.println("start"+pozitieCurenta[0]+" "+pozitieCurenta[1]+" finish"+ finish[0]+" "+finish[1]);

	while(ok==1)
	{  
		int keycode=e.getKeyCode();
		if(keycode == KeyEvent.VK_W){ 
					if(m.moveUp(start[0], start[1])==1&&m.isFreeAt(start[0]-1, start[1])==1)
						if(m.map1[start[0]-1][start[1]]==2) 
							{
							
							ok=0;
							break;
							}			 
						else	

							{
								m.muta(start[0], start[1]);
								
								start[0]=start[0]-1;
								m.map1[start[0]][start[1]]=3;
								System.out.println(m.toString(""));
								
	                	
						}
		}
		          
		if(keycode == KeyEvent.VK_S) 
		{
					if(m.moveDown(start[0], start[1])==1&&m.isFreeAt(start[0]+1, start[1])==1)
						if(m.map1[start[0]+1][start[1]]==2)
						{  
							ok=0;
						
						}

						else
						{
						  m.muta(start[0], start[1]);
						  
						  start[0]=start[0]+1;
						  m.map1[start[0]][start[1]]=3;
						  
						 
						}
		}
		if(keycode == KeyEvent.VK_A)
		{
					if(m.moveLeft(start[0], start[1])==1&&m.isFreeAt(start[0],start[1]-1)==1)
						if(m.map1[start[0]][start[1]-1]==2)
							{
							
							ok=0;
							break;
							}

							else
							{
								m.muta(start[0], start[1]);
								
							 start[1]=start[1]-1;
							 m.map1[start[0]][start[1]]=3;
							 System.out.println(m.toString(""));
							
	                	} 
		}
		if(keycode == KeyEvent.VK_D)	
		{
					if(m.moveRight(start[0], start[1])==1&&m.isFreeAt(start[0], start[1]+1)==1)
						if(m.map1[start[0]][start[1]+1]==2) 
							{  
								ok=0;
								break;
							}

							else
							{
							 m.muta(start[0], start[1]);
							
							 start[1]=start[1]+1;
							 m.map1[start[0]][start[1]]=3;
							 System.out.println(m.toString(""));
							
						 	} 
		}
	
		
	}
	}()*/