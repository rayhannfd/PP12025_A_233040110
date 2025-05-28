package Pertemuan2;

public class NodeMain {
	
	public static void main(String[] args) {
		
		//NODE N1 dan N2
		Node n1 = new Node (5);
		Node n2 = new Node (7);
		
		
		//RELASI NODE N1 dan N2
		n1.setNext(n2);
		
		//MENAMPILKAN N1 dan N2 DENGAN POINTER P
		Node p = n1;
		while(p != null)
		
		{ 
			System.out.println( p.getNilai());
			p = p.getNext();
			
			
			
			
			
		}
		
		
	}

}
