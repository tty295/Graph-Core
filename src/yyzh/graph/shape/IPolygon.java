package yyzh.graph.shape;

import java.util.List;

public interface IPolygon {
	public List<Point> points();
	
	public default void move(int dx, int dy) {
		points().forEach(p -> p.move(dx, dy));
	}
	
	public default boolean equals(IPolygon obj) {
		if(obj == null) return false;
		if(obj == this) return true;
		List<Point> thisPoints = points();
		List<Point> otherPoints = obj.points();
		if(thisPoints.size() != otherPoints.size()) return false;
		return this.points().containsAll(otherPoints);
	}
}
