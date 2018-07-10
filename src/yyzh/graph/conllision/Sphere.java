package yyzh.graph.conllision;

import yyzh.graph.shape.Point;
import yyzh.graph.shape.Round;

/**
 * 包围圆
 * */
public class Sphere extends Round implements ICollision {

	public Sphere(int x, int y, int radius) {
		super(x, y, radius);
	}

	public Sphere(Point center, int radius) {
		super(center, radius);
	}

	@Override
	public boolean contains(Point point) {
		return radius > Point.distance(center, point);
	}
}
