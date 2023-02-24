class Matrices{
	public static Matrix multiply(Matrix a,Matrix b){
		if(a.width()!=b.length()){
			System.out.println("Invalid request");
			return null;
		}
		Matrix res = new Matrix(a.length(),b.length());
		for(int i=0;i<a.length();i++){
			for(int j=0;j<b.width();j++){
				int t = 0;
				for(int k=0;k<a.width();k++){
					t += a.get(i,k)*b.get(k,j);
				}
				res.put(i,j,t);
			}
		}
		return res;
	}
	//public static Matrix add(Matrix a,Matrix b)
}
