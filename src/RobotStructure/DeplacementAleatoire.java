package RobotStructure;
import java.util.Random;

public class DeplacementAleatoire extends AlgoDeplacement{

	private double finalAngle;
	
	public DeplacementAleatoire(Robot parent){
		this.rob = parent;
		this.state = MovingState.NOMOVE;
	}
	
	public DeplacementAleatoire(Robot parent, double _lspeed, double _rspeed){
		this.rob = parent;
		this.state = MovingState.NOMOVE;
		this.lSpeed = _lspeed;
		this.rSpeed = _rspeed;
	}
	
	public DeplacementAleatoire(Robot parent, double _lspeed, double _rspeed, MovingState _state){
		this.rob = parent;
		this.state = _state;
		this.lSpeed = _lspeed;
		this.rSpeed = _rspeed;
	}
	
	public DeplacementAleatoire(Robot parent, MovingState _state){
		this.rob = parent;
		this.state = _state;
	}
	
	public void nextMove(double dt) 
	{
		
		if(state.equals(MovingState.LINEAR))
		{
			double dl = dt*lSpeed;
			double dr = dt*lSpeed;
			rob.moveRobot(dl, dr);
		}
		else if(state.equals(MovingState.ROTATION))
		{
			if( Math.abs(finalAngle - rob.getAngle()) > 2 * dt * rSpeed  )
			{
				double dr = dt*rSpeed*rob.getDiametre();
				double dl = - dt*rSpeed*rob.getDiametre();
				rob.moveRobot(dl, dr);
			}
			else
				setMoveType(MovingState.LINEAR);
		}
		else // NOMOVE
		{
			// Nothing
		}
	}
	
	public void obstacleDetected(double angle)
	{
		Random r = new Random();
		finalAngle = 0 + (Math.PI - 0) * r.nextDouble() + rob.getAngle();
		setMoveType(MovingState.ROTATION);
	}
}
