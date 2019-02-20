package RobotStructure;
import java.util.*;

import Environnement.*;

import Environnement.Position;

public class Robot {
	
	private double diametre;
	
	private Posture r_posture;
	private Move r_move;
	private Position r_position;
	
	private ArrayList<Capteur> r_capteurs = new ArrayList<Capteur>();
	
	private AlgoDeplacement r_deplacement;
	
	public Robot() {
		
	}
	
	public Robot(double diametre) {
		this.diametre = diametre;
	}
	
		// The following return a copy, cannot be changed
	public Position getPosition(){
		
		return new Position(r_posture.getX(), r_posture.getY());
	}
	
	public void moveRobot(double dx, double dy)
	{
		this.r_position.add(new Position(dx, dy));
	}

	public ArrayList<Capteur> getCapteursList() {
		return r_capteurs;
	}
}
