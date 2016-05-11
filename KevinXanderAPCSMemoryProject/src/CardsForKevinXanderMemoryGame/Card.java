package CardsForKevinXanderMemoryGame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

public abstract class Card extends JLabel implements MouseListener
{	
	private Color cardFaceColor = Color.GREEN;
	private final static Dimension CARD_SIZE = new Dimension(50,100);
	
	public Card()
	{
		setSize(CARD_SIZE);
		setPreferredSize(CARD_SIZE);
		setOpaque(true);
		setBackground(Color.BLACK);
		addMouseListener(this);
	}

	public void showFace()
	{
		setBackground(cardFaceColor);
	}
	public void hideFace()
	{
		setBackground(Color.BLACK);
	}
	public void setFaceColor(Color c)
	{
		this.cardFaceColor = c;
	}
	public Color getFaceColor()
	{
		return this.cardFaceColor;
	}
	@Override
	public void mouseClicked(MouseEvent e) 
	{
		CardsForKevinXanderMemoryGame.Gameboard.CurrentWindow.CardPicked(this);
	}
	@Override
	public void mouseEntered(MouseEvent e) 
	{
	}
	@Override
	public void mouseExited(MouseEvent e)
	{
	}
	@Override
	public void mousePressed(MouseEvent e) 
	{
	}
	@Override
	public void mouseReleased(MouseEvent e)
	{
	}
}
