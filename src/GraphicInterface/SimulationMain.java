package GraphicInterface;
import java.awt.Dimension;

import javax.swing.JFrame;

import Environnement.*;
import RobotStructure.*;

public class SimulationMain {

	public static void main(String[] args)
	{

	    JFrame ma_fenetre = new JFrame("Cercle rouge"); // Nouvelle fenetre
	    
	    Robot myRobot = new Robot(10, 50, 50, 0);
	    
	    ma_fenetre.setPreferredSize(new Dimension(400, 400)); // Taille de la fenetre
	    ma_fenetre.setContentPane(myRobot.getMoveObject()); // Le contenu est l'objet Move
	    ma_fenetre.pack();
	    ma_fenetre.setVisible(true);
	    
	    int x = 0;
	    boolean sens = true;

	    /*
	    while (true)
	      {
			m.moveRobot(x, 0); // On deplace le robot a la coordonnee (x,0)
			if (sens)
				x += 1; // Augmenter la vitesse
			else
				x -= 1; // Diminuer la vitesse
			if (x == 0 || x == 100)
				sens = !sens; // Changement de sens quand la coordonnee x atteint 0 ou 100
				// attend 0.01 sec
			
			try  { Thread.sleep(10); }
			
			catch (Exception e) {}
				// Redessine la fenetre (appelle automatiquement entre autres m.paint())
			
			m.repaint();
	      }*/
	}

}
