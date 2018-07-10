package yyzh.graph.shape;

import java.util.Arrays;

import yyzh.graph.conllision.AxisAlignedBoundingBox;

/**
 * 无旋转矩形
 */
public class Rectangle extends AbstractPolygon {

	// x, y为左上角的点
	protected int x;
	protected int y;
	protected int width;
	protected int height;

	protected Point leftTop;
	protected Point leftBottom;
	protected Point rightTop;
	protected Point rightBottom;
	protected Point center;
	
	public Rectangle(int x, int y, int width, int height) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		leftTop = new Point(x, y);
		leftBottom = new Point(x, y + height);
		rightTop = new Point(x + width, y);
		rightBottom = new Point(x + width, y + height);
		center = new Point((x + width) / 2, (y + height) / 2);
		points = Arrays.asList(leftTop, leftBottom, rightTop, rightBottom);
	}
	
	protected void resetPoints() {
		leftTop.relocate(x, y);
		leftBottom.relocate(x, y + height);
		rightTop.relocate(x + width, y);
		rightBottom.relocate(x + width, y + height);
		center.relocate((x + width) / 2, (y + height) / 2);
	}

	@Override
	public void move(int dx, int dy) {
		x += dx;
		y += dy;
		resetPoints();
	}
	
	public void relocate(int x, int y) {
		this.x = x;
		this.y = y;
		resetPoints();
	}
	
	public void resize(int width, int height) {
		this.width = width;
		this.height = height;
		resetPoints();
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public Point getLeftTop() {
		return leftTop;
	}

	public Point getLeftBottom() {
		return leftBottom;
	}

	public Point getRightTop() {
		return rightTop;
	}

	public Point getRightBottom() {
		return rightBottom;
	}
	
	@Override
	public Rectangle clone() {
		return new Rectangle(x, y, width, height);
	}
	
	@Override
	public AxisAlignedBoundingBox getBoundsBox() {
		return new AxisAlignedBoundingBox(this);
	}
	
	public long size() {
		return width * height;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + height;
		result = prime * result + width;
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
		Rectangle other = (Rectangle) obj;
		if (height != other.height)
			return false;
		if (width != other.width)
			return false;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	public Point getCenter() {
		return center;
	}

	public int left() {
		return x;
	}
	
	public int right() {
		return x + width;
	}
	
	public int top() {
		return y;
	}

	public int bottom() {
		return y + height;
	}
}
