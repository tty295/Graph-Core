package yyzh.graph.core.shape;

import java.util.ArrayList;
import java.util.List;

public interface IShape<T extends IShape<T>> {
	
	public T copy();
	
	/**
	 * @param dx x轴偏移量
	 * @param dy y轴偏移量
	 * */
	public void move(int dx, int dy);
	
	public static<S extends IShape<S>> List<S> copyExact(List<S> list) {
		List<S> copied = new ArrayList<>(list.size());
		for(int i = 0; i < list.size(); i++) {
			copied.set(i, list.get(i).copy());
		}
		return copied;
	}

	public static List<IShape<?>> copyGeneric(List<IShape<?>> list) {
		List<IShape<?>> copied = new ArrayList<>(list.size());
		for(int i = 0; i < list.size(); i++) {
			copied.set(i, list.get(i).copy());
		}
		return copied;
	}
	
}
