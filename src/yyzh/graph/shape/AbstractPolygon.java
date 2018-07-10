package yyzh.graph.shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import yyzh.graph.conllision.AxisAlignedBoundingBox;

public abstract class AbstractPolygon extends BoundsShape implements IPolygon {
	
	@Override
	public abstract AbstractPolygon clone();
	

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
	public AxisAlignedBoundingBox getBoundsBox() {
		int left = Integer.MAX_VALUE;
		int right = Integer.MIN_VALUE;
		int top = Integer.MIN_VALUE;
		int bottom = Integer.MAX_VALUE;
		for(Point p : points()) {
			int x = p.getX();
			int y = p.getY();
			
			left = Math.min(left, x);
			right = Math.max(right, x);
			bottom = Math.min(bottom, y);
			top = Math.max(top, y);
		}
		
		int x = left;
		int y = top;
		int width = right - left;
		int height = bottom - top;
		return new AxisAlignedBoundingBox(x, y, width, height);
	}
}
