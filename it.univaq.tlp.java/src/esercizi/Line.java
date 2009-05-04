package esercizi;

class Line { 
	Point pt1; 
	Point pt2;
	
	int deltaX() {
	    return pt1.x - pt2.x;
	  }
	  int deltaY() {
	    return pt1.y - pt2.y;
	  }
	  
	Line (Point p, Point q){ 
		pt1 = p; 
		pt2 = q; } 

	boolean parallel(Line l) {
	    return (deltaX()* l.deltaY()) == (deltaY()* l.deltaX());
	}

} 

