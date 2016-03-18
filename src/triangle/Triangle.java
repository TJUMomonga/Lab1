package triangle;

public class Triangle {
	public String whichTriangle(int x1, int x2, int x3){
		if((x1+x2)<=x3 || (x2+x3)<=x1 || (x1+x3)<=x2)
			return "Not a triangle";
		if(x1==x2 && x2==x3)
			return "equilateral";
		if(x1==x2 || x2==x3 || x1==x3)
			return "isosceles";
		return "scalene";
	}
}
