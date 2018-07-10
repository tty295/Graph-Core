package yyzh.animate;

import java.awt.Color;

import yyzh.graph.shape.Square;

/**
 * 图像点
 * */
public class Pixel extends Square {

	protected Color color; 
	
	public static final int PIXEL_POINT_SIZE = 5;
	
	public Pixel(int x, int y) {
		super(x * PIXEL_POINT_SIZE, y * PIXEL_POINT_SIZE, PIXEL_POINT_SIZE);
		setColor(new Color(0, 0, 0));
	}

	public Pixel(int x, int y, Color color) {
		super(x * PIXEL_POINT_SIZE, y * PIXEL_POINT_SIZE, PIXEL_POINT_SIZE);
		this.setColor(color);
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	@Override
	public Pixel clone() {
		return new Pixel(x, y, new Color(color.getRed(), color.getGreen(), color.getGreen(), color.getAlpha()));
	}
}
