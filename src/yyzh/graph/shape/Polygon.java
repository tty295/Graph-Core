package yyzh.graph.shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * 任意多边形
 * */
public class Polygon extends AbstractPolygon {

	public Polygon() { points = new ArrayList<>(); }
	
	public Polygon(Point... points) {
		super(points);
	}
	
	public Polygon(List<Point> points) {
		super(points);
	}
	
	public void addPoint(Point point) {
		this.points.add(point);
	}
	
	public void addPoints(Point... points) {
		this.points.addAll(Arrays.asList(points));
	}
	
	public void addPoints(Collection<Point> points) {
		this.points.addAll(points);
	}
	
	public boolean removePoint(Point point) {
		return this.points.remove(point);
	}
	
	public boolean removePoints(Point... points) {
		return this.points.removeAll(Arrays.asList(points));
	}
	
	public boolean removePoints(Collection<Point> points) {
		return this.points.removeAll(points);
	}
	
	@Override
	public Polygon clone() {
		return new Polygon(Shape.copyExact(points, Point.class));
	}

}
