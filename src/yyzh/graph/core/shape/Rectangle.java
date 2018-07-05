package yyzh.graph.core.shape;

import java.util.Arrays;

/**
 * 无旋转矩形
 */
public class Rectangle extends AbstractPolygon<Rectangle> implements IPolygon {

	// x, y为左上角的点
	protected int x;
	protected int y;
	protected int width;
	protected int height;

	protected Point leftTop;
	protected Point leftBottom;
	protected Point rightTop;
	protected Point rightBottom;

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
		points = Arrays.asList(leftTop, leftBottom, rightTop, rightBottom);
	}
	protected void resetPoints() {
		leftTop.relocate(x, y);
		leftBottom.relocate(x, y + height);
		rightTop.relocate(x + width, y);
		rightBottom.relocate(x + width, y + height);
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
	public Rectangle copy() {
		return new Rectangle(x, y, width, height);
	}
	
	@Override
	public Rectangle getBoundsBox() {
		return copy();
	}
}
