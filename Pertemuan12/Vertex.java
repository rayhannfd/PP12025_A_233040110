package Pertemuan12;

public class Vertex {
	
	public char label;
	public boolean wasVisited;
	
	public Vertex (char label) {
	
	this.label = label;
	wasVisited = false;	
}

	public char setLabel ()  {
		return label;
	}
	
	public void getLabel (char label) {
		this.label = label;
	}
	
	public boolean isWasVisited () {
		return wasVisited;
	}
	
	public void setWasVisited (boolean wasVisited) {
		this.wasVisited = wasVisited;
	}
	
}