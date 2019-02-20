package Environnement;
import RobotStructure.*;

public class ObstacleCercle extends Obstacle {
	
	private double diametre;

	public void interact(Robot r) {
		
		if(distanceFrom(r) < diametre / 2)
		{
			for(Capteur c: r.getCapteursList()) 
			{
				if(c instanceof CapteurContact) {
					//if(((CapteurContact) c).getAngle() - ((CapteurContact) c).getAngleOuverture()/2)
				
					/**
					 * Il faut prendre en compte :
					 * 	- L'angle d'orientation du robot
					 * 	- L'angle entre le robot et l'obstacle
					 *  - L'angle du capteur dans le robot
					 *  - L'angle d'ouverture du capteur
					 *  
					 *  Pour savoir si le capteur est bien en contact avec l'objet
					 */
				
					//TODO
				}
			}
		}
	}
	
	public double distanceFrom(Robot r) {
		return r.getPosition().distanceFrom(this.position);
		
	}
}