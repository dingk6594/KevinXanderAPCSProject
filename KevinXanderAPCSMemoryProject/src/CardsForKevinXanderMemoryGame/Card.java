package CardsForKevinXanderMemoryGame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;

public class Card extends JLabel implements MouseListener{
	
	private Color faceColor = Color.GREEN;
	private final static Dimension size = new Dimension(50,50);
	
	public Card()
	{
		setMinimumSize(size);
		setMaximumSize(size);
		setPreferredSize(size);
		setOpaque(true);
		setBackground(Color.BLACK);
		addMouseListener(this);
	}
	
	public void showFace()
	{
		setBackground(faceColor);
	}
	
	public void hideFace()
	{
		setBackground(Color.BLACK);
	}
	
	public void setFaceColor(Color c)
	{
		this.faceColor = c;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		showFace();
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
