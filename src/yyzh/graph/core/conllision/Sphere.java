package yyzh.graph.core.conllision;

import yyzh.graph.core.shape.Point;
import yyzh.graph.core.shape.Round;

/**
 * 包围球
 * */
public class Sphere extends Round implements ICollision {

	public Sphere(int x, int y, int radius) {
		super(x, y, radius);
	}

	public Sphere(Point center, int radius) {
		super(center, radius);
	}
}
