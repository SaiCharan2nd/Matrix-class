class Matrix
{
	int[][] data;
	Matrix(int rows,int columns){
		data = new int[rows][columns];
	}
	Matrix(Matrix a){
		data = new int[a.length()][a.width()];
		for(int i=0;i<data.length;i++){
			for(int j=0;j<data[0].length;j++){
				data[i][j] = a.get(i,j);
			}
		}
	}
	public int length(){
		return data.length;
	}
	public int width(){
		return data[0].length;
	}
	public void put(int row,int column,int val){
		data[row][column] = val;
	}
	public int get(int row,int column){
		return data[row][column];
	}
	/*
	public int determinant(){
		
	}
	*/
}

