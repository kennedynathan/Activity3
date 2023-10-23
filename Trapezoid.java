package base;

public class Trapezoid extends ShapeBase {
	int base1;
	int base2;
	int height;
	
	public Trapezoid(String name, int base1, int base2, int height) {
		super(name);
		this.height = height;
		this.base1 = base1;
		this.base2 = base2;
	}
	@Override
	public int calculateArea() {
		return ((base1+base2)/2*height);
	}
}
