package Environnement;
import java.util.*;

public class Map {
	
	private ArrayList<EnvObject> m_objects = new ArrayList<EnvObject>();
	private ArrayList<Obstacle> m_murs = new  ArrayList<Obstacle>();
	
	private int h;
	private int w;
	
	public Map() {
		
	}
	
	public Map(int h, int w){
		
		this.h = h;
		this.w = w;
		
		
	}
}
