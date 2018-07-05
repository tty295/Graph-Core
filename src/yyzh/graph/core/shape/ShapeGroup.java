package yyzh.graph.core.shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeGroup extends Shape<ShapeGroup> {

	private List<IShape<?>> shapes;
	
	public ShapeGroup() {
		shapes = new ArrayList<>();
	}
	
	public ShapeGroup(IShape<?>... shapes) {
		this.shapes = new ArrayList<>(Arrays.asList(shapes));
	}
	
	public ShapeGroup(List<IShape<?>> shapes) {
		this.shapes = new ArrayList<>(shapes);
	}
	
	@Override
	public ShapeGroup copy() {
		return new ShapeGroup(IShape.copyGeneric(shapes));
	}

	@Override
	public void move(int dx, int dy) {
		shapes.forEach(s -> s.move(dx, dy));
	}

	public void add(Shape<?> shape) {
		shapes.add(shape);
	}
	
	public boolean remove(Shape<?> shape) {
		return shapes.remove(shape);
	}
}
