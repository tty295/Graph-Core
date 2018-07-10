package yyzh.graph.shape;

/**
 * 正方形
 * */
public class Square extends Rectangle {

	public Square(int x, int y, int length) {
		super(x, y, length, length);
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

	@Override
	public Square clone() {
		return new Square(x, y, height);
	}
	
}
