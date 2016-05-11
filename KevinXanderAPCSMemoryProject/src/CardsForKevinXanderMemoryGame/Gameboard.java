package CardsForKevinXanderMemoryGame;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import CardsForKevinXanderMemoryGame.*;

public class Gameboard extends JFrame
{
	public static Gameboard CurrentWindow = null;
	private String title = "Memory Game";
	private Card ChosenCard = null;
	private int points = 0;
	
	public Gameboard()
	{
		setSize(800,400);
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUpGame();
		setVisible(true);
	}
	private void setUpGame()
	{
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(new BlueCard());
		getContentPane().add(new YellowCard());
		getContentPane().add(new PinkCard());
		getContentPane().add(new RedCard());
		getContentPane().add(new YellowCard());
		getContentPane().add(new PinkCard());
		getContentPane().add(new RedCard());
		getContentPane().add(new BlueCard());
	}
	private void AddPoint()
	{
		points += 1;
		setTitle(title = " - " + points + " Point(s)");
	}
	public void CardPicked(Card card)
	{
		if(ChosenCard == null)
		{
			card.showFace();
			ChosenCard = card;
			return;
		}
		if(ChosenCard == card)
		{
			card.hideFace();
			ChosenCard = null;
			return;
		}
		if (ChosenCard.getFaceColor() == card.getFaceColor())
		{
			AddPoint();
			getContentPane().remove(ChosenCard);
			getContentPane().remove(card);
			ChosenCard = null;
			getContentPane().invalidate();
			return;
		}
		ChosenCard.hideFace();
		ChosenCard = null;
	}
	public static void main (String[] args)
	{
		CurrentWindow = new Gameboard();
	}
}
