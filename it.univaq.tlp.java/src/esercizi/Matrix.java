package esercizi;

class Matrix{
	
	  private int[][] val;
	
	  Matrix(int n, int m)  {
	    val = new int[n][m];
	  }
	  
	  int getHeight() {
	    return val.length;
	  }
	  
	  int getWidth(){
	    return val[0].length;
	  }

	  int getVal(int i, int j) {
	    return val[i - 1][j - 1];
	  }

	  void setVal(int i, int j, int v) {
	    val[i - 1][j - 1] = v;
	  }

	  Matrix plus(Matrix b) {
	    Matrix res = new Matrix(getHeight(), getWidth());
	    for (int i = 1; i<= getHeight(); i++) {
	      for (int j = 1; j<= getWidth(); j++) {
	        res.setVal(i, j, getVal(i, j) + b.getVal(i, j));
	      }
	    }
	    return res;
	  }
	  
	  Matrix mult(Matrix b) {
	    Matrix res = new Matrix(getHeight(), b.getWidth());
	    for (int i = 1; i<= getHeight(); i++) {
	      for (int j = 1; j<= b.getWidth(); j++) {
	        res.setVal(i, j, 0);
	        for (int k = 1; k<= getWidth(); k++) {
	          res.setVal(i, j, res.getVal(i, j) + getVal(i, k)* b.getVal(k, j));
	        }
	      }
	    }
	    return res;
	  }
	}
