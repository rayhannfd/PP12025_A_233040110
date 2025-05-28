package Pertemuan4.Latihan;

public class Node {
	
	private int data;
	private Node next;
	
	//INISIALISASI ATRIBUT NODE
	
	public Node (int data) {
		this.data = data;
	}
	
	//SETTER 
	
	public void setNext (Node next) {
		this.next = next;
	}
	
	public void setData (int data) {
		this.data = data;
	}
	
	//GETTER 
	
	public Node getNext () {
		return this.next = next;
	}
	
	public int getData () {
		return this.data;
	}
	
	
	
}