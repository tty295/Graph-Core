package yyzh.graph.conllision;

import yyzh.graph.shape.Point;

/**
 * 碰撞检测工具类
 * */
public class Collisions {
	
	public static boolean collisionDetect(AxisAlignedBoundingBox a, AxisAlignedBoundingBox b) {
//		// 完全相等的矩形
//		if(a.equals(b)) return true;
//		// 考虑包含的情况
//		if(a.size() > b.size()) {
//			return a.contains(b.points());
//		} else {
//			return b.contains(a.points());
//		}

//		boolean x = Math.abs(a.getCenter().getX() - b.getCenter().getX()) < (a.getWidth() + b.getWidth()) / 2;
//		boolean y = Math.abs(a.getCenter().getY() - b.getCenter().getY()) < (a.getHeight() + b.getHeight()) / 2;
		
		// 两个矩形中心的横(纵)向距离小于宽度(高度)之和除以2, 说明矩形相交
		return Point.xDistance(a.getCenter(), b.getCenter()) < (a.getWidth() + b.getWidth()) / 2
				&& Point.yDistance(a.getCenter(), b.getCenter()) < (a.getHeight() + b.getHeight()) / 2;
	}
	
	public static boolean collisionDetect(Sphere a, Sphere b) {
		// 圆心距小于
		return Point.distance(a.getCenter(), b.getCenter()) < a.getRadius() + b.getRadius();
	}
	
	public static boolean collisionDetect(AxisAlignedBoundingBox a, Sphere b) {
		// 1 2 3
		// 4 5 6
		// 7 8 9
		// 5为矩形所在位置 
		Point c = b.getCenter();
		// 圆心在5中, 相交
		if(a.contains(c)) return true;
		int cx = c.getX();
		int cy = c.getY();
		if(cx >= a.left() && cx <= a.right()) {
			// 圆心在2, 8中, 圆心到上下边的最短距离小于半径,说明相交
			int distance = Math.min(Math.abs(cy - a.top()), Math.abs(cy - a.bottom()));
			if(distance < b.getRadius()) return true;
		}
		if(cy >= a.top() && cy <= a.bottom()) {
			// 圆心在4, 6中, 圆心到左右边的最短距离小于半径,说明相交
			int distance = Math.min(Math.abs(cx - a.left()), Math.abs(cx - a.right()));
			if(distance < b.getRadius()) return true;
		}
		// 此时圆心不在2, 4, 5, 6, 8区域中, 离圆心最近的点到圆心的距离小于半径, 说明相交
		Point nearest;
		if(cx < a.left()) {
			if(cy < a.top()) {
				nearest = a.getLeftTop();
			} else {
				nearest = a.getLeftBottom();
			}
		} else {
			if(cy < a.top()) {
				nearest = a.getRightTop();
			} else {
				nearest = a.getRightBottom();
			}
		}
		return Point.distance(c, nearest) < b.getRadius();
	}
	
	public static boolean collisionDetect(Sphere b, AxisAlignedBoundingBox a) {
		return collisionDetect(a, b);
	}
	
}
