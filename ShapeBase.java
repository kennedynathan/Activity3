package base;

public class ShapeBase implements ShapeInterface{
	protected int width;
	protected int height;
	protected String name;

	
	public ShapeBase(String name, int width, int height) {
		this.height = height;
		this.width = width;
		this.name = name;
	}
	public ShapeBase(String name) {
		this.name = name;
	}
	public String getName() {
		return  this.name;
	}
	@Override
	public int calculateArea() {
		return -1;
	}
}
