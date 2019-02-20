package Environnement;

import RobotStructure.*;

public abstract class EnvObject {
	
	protected Position position;
	
	public abstract void interact(Robot r);
	public abstract double distanceFrom(Robot r);

}