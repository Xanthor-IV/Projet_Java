package Environnement;

import java.lang.Math;

public class Position {

	private double x;
	private double y;
	
	public Position() {
		x=0;
		y=0;
	}
	
	public Position(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setX(double _x) {x = _x;}
	public void setY(double _y) {y = _y;}
	
	public void copyFrom(Position p)
	{
		this.x = p.x;
		this.y = p.y;
	}
	
	public void add(Position o)
	{
		this.x += o.x;
		this.y += o.y;
	}
	
	public void add(double dx, double dy)
	{
		this.x += dx;
		this.y += dy;
	}

	public double distanceFrom(Position position) {
		
		double dx = position.getX() - this.x;
		double dy = position.getY() - this.y;
		
		
		return Math.sqrt(dx*dx + dy*dy);
	}
	
}
