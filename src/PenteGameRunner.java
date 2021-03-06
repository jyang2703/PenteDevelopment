import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class PenteGameRunner {
	
	public static void main(String[] args) {
		
		int gWidth = 19*38;
		int gHeight = 19*38;
		int sbWidth = (int)(gWidth * 0.50);
		
		JFrame theGame = new JFrame("Play Pente");
		
		theGame.setLayout(new BorderLayout());
		theGame.setResizable(false);
		
		theGame.setSize(gWidth+sbWidth, gHeight+20);
		theGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PenteScore sb = new PenteScore(sbWidth, gHeight);
		sb.setPreferredSize(new Dimension(sbWidth, gHeight));
		Border sbBorder = BorderFactory.createLineBorder(Color.BLACK, 4, false);
	    sb.setBorder(sbBorder);
		
	    
		PenteGameBoard gb = new PenteGameBoard(gWidth, gHeight, sb);
		gb.setPreferredSize(new Dimension(gWidth, gHeight));
		Border gbBorder = BorderFactory.createLineBorder(Color.BLACK, 4, false);
	    gb.setBorder(gbBorder);
	    
	    
	    sb.setGameBoard(gb);
		
	    
		theGame.add(gb, BorderLayout.CENTER);
		theGame.add(sb, BorderLayout.EAST);
		
		
		theGame.setVisible(true);
		gb.startNewGame(true);
		
		
	}

}
