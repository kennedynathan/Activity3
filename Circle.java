package base;

public class Circle extends ShapeBase {
	int radius;
	
	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;
	}
	@Override
	public int calculateArea() {
		return (int) (radius*radius*Math.PI);
	}

}
