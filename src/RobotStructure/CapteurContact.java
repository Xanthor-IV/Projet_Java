package RobotStructure;

//import Environnement.EnvObject;

public class CapteurContact extends Capteur {

	protected double angle;
	protected double angle_ouverture;
	
	public CapteurContact() {
		this.activated = true;
	}
	
	public double getAngle() {
		return angle;
	}
	
	public double getAngleOuverture() {
		return angle_ouverture;
	}
	
}
