package yyzh.graph.core.shape;

public class Round extends BoundsShape<Round>{
	
	public Round(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}
	
	public Round(int x, int y, int radius) {
		this.center = new Point(x, y);
		this.radius = radius;
	}
	
	private Point center;
	private int radius;
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "Round [center=" + center + ", radius=" + radius + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((center == null) ? 0 : center.hashCode());
		result = prime * result + radius;
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
		Round other = (Round) obj;
		if (center == null) {
			if (other.center != null)
				return false;
		} else if (!center.equals(other.center))
			return false;
		if (radius != other.radius)
			return false;
		return true;
	}

	@Override
	public Round copy() {
		return new Round(center.copy(), radius);
	}

	@Override
	public void move(int dx, int dy) {
		center.move(dx, dy);
	}
	
	public void resize(int radius) {
		this.radius = radius;
	}

	@Override
	public Rectangle getBoundsBox() {
		int x = center.getX() - radius / 2;
		int y = center.getY() - radius / 2;
		return new Rectangle(x, y, radius, radius);
	}
}
