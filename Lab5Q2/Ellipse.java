public class Ellipse extends Shape {

	public Ellipse(double dim1, double dim2) {
		super(dim1, dim2);
		this.dim1 = dim1;
		this.dim2 = dim2;
	}

@Override
	public double area() {
		return PI * this.dim1 * this.dim2;
	}
	
}
