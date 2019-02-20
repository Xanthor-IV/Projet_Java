package RobotStructure;

public class DeplacementAleatoire extends AlgoDeplacement{

	
	public void nextMove(Robot r, double dt) {
		
		if(state.equals(MovingState.LINEAR))
		{
			double dl = dt*lSpeed;
			double dr = dt*lSpeed;
			r.moveRobot(dl, dr);
		}
		else if(state.equals(MovingState.ROTATION))
		{
			double dr = dt*rSpeed*r.getDiametre();
			double dl = - dt*rSpeed*r.getDiametre();
			r.moveRobot(dl, dr);
		}
		else
		{
			//Nothing
		}
	}
	
}
