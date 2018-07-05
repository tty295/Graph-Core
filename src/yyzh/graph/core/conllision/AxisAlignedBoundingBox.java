package yyzh.graph.core.conllision;

import yyzh.graph.core.shape.Rectangle;

/**
 * AABB包围盒
 * */
public class AxisAlignedBoundingBox extends Rectangle implements ICollision {

	public AxisAlignedBoundingBox(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	
}
