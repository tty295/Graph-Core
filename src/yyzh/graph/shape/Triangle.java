package yyzh.graph.shape;

import java.util.Arrays;

/**
 * 三角形
 * */
public class Triangle extends AbstractPolygon {

	protected Point a;
	protected Point b;
	protected Point c;
	
	public Triangle(Point a, Point b, Point c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		points = Arrays.asList(a, b, c);
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
	
	@Override
	public Triangle clone() {
		return new Triangle(a, b, c);
	}

}
