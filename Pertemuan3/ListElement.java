package Pertemuan3;

public class ListElement {
	
	private Node Head;
	
	public void displayElement () {
		
		Node curNode= Head;
		while (curNode != null) {
			System.out.print(curNode.getData() + " ");
			curNode = curNode.getNext();
		}
		
		}

}