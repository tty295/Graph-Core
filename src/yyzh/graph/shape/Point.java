package yyzh.graph.shape;

/**
 * 点
 * */
public class Point extends Shape {
	protected int x;
	protected int y;

	public Point() {}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public void move(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}
	
	public void relocate(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	@Override
	public Point clone() {
		return new Point(x, y);
	}
	
	/**
	 * 计算两点间距离
	 * */
	public static double distance(Point a, Point b) {
		if(a.x == b.x) return Math.abs(a.y - b.y);
		if(a.y == b.y) return Math.abs(a.x - b.x);
		
		int x = Math.abs(a.x - b.x);
		int y = Math.abs(a.y - b.y);
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}

	public static int xDistance(Point a, Point b) {
		return Math.abs(a.x - b.x);
	}
	
	public static int yDistance(Point a, Point b) {
		return Math.abs(a.y - b.y);
	}
	
}
