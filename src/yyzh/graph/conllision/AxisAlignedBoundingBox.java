package yyzh.graph.conllision;

import yyzh.graph.shape.Point;
import yyzh.graph.shape.Rectangle;

/**
 * AABB包围盒
 */
public class AxisAlignedBoundingBox extends Rectangle implements ICollision {

	public AxisAlignedBoundingBox(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	public AxisAlignedBoundingBox(Rectangle r) {
		super(r.getX(), r.getY(), r.getWidth(), r.getHeight());
	}
	
	@Override
	public boolean contains(Point point) {
		return point.getX() > x && point.getY() > y && point.getX() < x + width && point.getY() < y + height;
	}

}
