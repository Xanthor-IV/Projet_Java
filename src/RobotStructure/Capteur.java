package RobotStructure;

import Environnement.*;

public abstract class Capteur {
	
	protected boolean activated;
	protected Robot parent;
	
	public void activate() {
		activated = true;
	}
	
	public void unactivate() {
		activated = false;
	}
	
	public boolean isActivated() {
		return activated;
	}
	
}
