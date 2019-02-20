package RobotStructure;
import Environnement.Position;

public abstract class AlgoDeplacement {
	
	protected MovingState state;
	
	protected Position direction;	// For linear translation
	protected Position center;		// For circle move
	
	protected double rSpeed;
	protected double lSpeed;
	
	public abstract void nextMove(Robot r, double dt);
	
	public void setLinearSpeed(double s) {this.lSpeed = s;}
	public void setRotationSpeed(double s) {this.rSpeed = s;}
	public void setDirection(double x, double y)
	{
		direction.setX(x);
		direction.setY(y);
	}
	
	public void setDirection(Position dir) {this.direction.copyFrom(dir);}
		// copie du contenu de direction, pas de la référence !
	
}
