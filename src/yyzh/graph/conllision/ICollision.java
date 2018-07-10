package yyzh.graph.conllision;

import java.util.List;

import yyzh.graph.shape.Point;

public interface ICollision {
	
	public boolean contains(Point point);
	
	public default boolean contains(List<Point> points) {
		for(Point point : points) {
			if(contains(point)) return true;
		}
		return false;
	}
	
	public default boolean contains(Point... points) {
		for(Point point : points) {
			if(contains(point)) return true;
		}
		return false;
	}
}
