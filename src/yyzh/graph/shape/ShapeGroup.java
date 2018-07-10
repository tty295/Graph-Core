package yyzh.graph.shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ShapeGroup extends Shape {

	private List<Shape> shapes;
	
	public ShapeGroup() {
		shapes = new ArrayList<>();
	}
	
	public ShapeGroup(Shape... shapes) {
		this.shapes = new ArrayList<>(Arrays.asList(shapes));
	}
	
	public ShapeGroup(List<Shape> shapes) {
		this.shapes = new ArrayList<>(shapes);
	}
	
	@Override
	public ShapeGroup clone() {
		return new ShapeGroup(Shape.copyGeneric(shapes));
	}

	@Override
	public void move(int dx, int dy) {
		shapes.forEach(s -> s.move(dx, dy));
	}

	public void add(Shape shape) {
		shapes.add(shape);
	}
	
	public boolean remove(Shape shape) {
		return shapes.remove(shape);
	}
}
