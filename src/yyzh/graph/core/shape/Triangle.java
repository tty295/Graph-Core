package yyzh.graph.core.shape;

import java.util.Arrays;

public class Triangle extends AbstractPolygon<Triangle> implements IPolygon {

	private Point a;
	private Point b;
	private Point c;
	
	public Triangle(Point a, Point b, Point c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		points = Arrays.asList(a, b, c);
	}

	@Override
	public Triangle copy() {
		return new Triangle(a.copy(), b.copy(), c.copy());
	}

	public Point getA() {
		return a;
	}

	public Point getB() {
		return b;
	}

	public Point getC() {
		return c;
	}

}
