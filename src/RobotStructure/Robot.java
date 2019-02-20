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
		diametre = 1;
		r_posture = new Posture(0, 0, 0);
		r_move = new Move();
	}
	
	public Robot(double diametre) 
	{
		this.diametre = diametre;
		r_posture = new Posture(0, 0, 0);
		r_move = new Move();
	}

	public Robot(double diametre, Posture posture)
	{
		this.diametre = diametre;
		this.r_posture = posture;
		r_move = new Move();
		
		this.setGraphicPosition();
	}
	
	public Robot(double diametre, double x, double y, double theta)
	{
		this.diametre = diametre;
		this.r_posture= new Posture(x, y, theta);
		r_move = new Move();
	}
	
	public double getDiametre() {return diametre;}
	
		// The following return a copy, cannot be changed
	public Position getPosition(){
		
		return new Position(r_posture.getX(), r_posture.getY());
	}
	
	public Move getMoveObject()
	{
		return r_move;
		
	}
	
	public void moveRobot(double d_l, double d_r) // Bouge le robot à partir des roues !
	{
		r_posture.move(d_l, d_r, diametre);
	}
	
	public void setGraphicPosition() 
	{
		r_move.moveRobot((int)r_posture.getX(), (int)r_posture.getY());
	}

	public ArrayList<Capteur> getCapteursList() {
		return r_capteurs;
	}
}
