package esercizi;



class Point { 
	int x; int y; 
	Point (int x1, int y1) { 
		x = x1; y = y1; 
	} 
	int distanceToOrigin() { 
		return (int) Math.sqrt((x * x + y * y)); 
	} 
} 
