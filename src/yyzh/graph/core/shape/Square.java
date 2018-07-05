package yyzh.graph.core.shape;

public class Square extends Rectangle {

	public Square(int x, int y, int length) {
		super(x, y, length, length);
	}

	@Override
	public Square copy() {
		return new Square(x, y, height);
	}

	public void resize(int length) {
		super.resize(length, length);
	}

	/**
	 * {@link Square#resize(int)}
	 * 正方形调用此方法,按照width设置边长
	 * */
	@Deprecated
	@Override
	public void resize(int width, int height) {
		resize(width);
	}
}
