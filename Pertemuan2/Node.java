package Pertemuan2;

public class Node {
	
	private int nilai;
	private Node next;
	
	//INISIALISASI NODE
	public Node (int nilai) {
		this.nilai = nilai;
	}
	
	//SETTER
	public void setNext (Node next) {
		this.next = next; 
	} 
	
	public void setNilai (Node n) {
		this.nilai = nilai;
	}
	
	
	//GETTER
	
	public Node getNext () {
		return this.next = next;
	}
	
	public int getNilai () {
		return this.nilai;
	}
	
	
	
	
	

}
