package yyzh.graph.core.shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class AbstractPolygon<T extends AbstractPolygon<T>> extends BoundsShape<T> implements IPolygon {

	protected List<Point> points;
	
	public AbstractPolygon(Point... points) {
		this.points = new ArrayList<>(Arrays.asList(points));
	}
	
	public AbstractPolygon(List<Point> points) {
		this.points = new ArrayList<>(points);
	}
	
	@Override
	public void move(int dx, int dy) {
		((IPolygon) this).move(dx, dy);
	}

	@Override
	public List<Point> points() {
		return points;
	}
	
	@Override
	public Rectangle getBoundsBox() {
		// TODO
		return null;
	}
}
