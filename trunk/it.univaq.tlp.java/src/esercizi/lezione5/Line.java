package esercizi.lezione5;

class Line { 
	Point pt1; 
	Point pt2; 
	
	Line (Point p, Point q){ 
		pt1 = p; 
		pt2 = q; 
	} 
	public boolean equals(Line l1){
		
		if ( ((l1.pt1.equals(this.pt1)) && (l1.pt2.equals(this.pt2)) )) 
			return true;
		
		if ( ((l1.pt1.equals(this.pt2)) && (l1.pt2.equals(this.pt1)) )) 
				return true;
			
		return false;
		
	}
	
}