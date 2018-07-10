package yyzh.graph.shape;

import java.util.ArrayList;
import java.util.List;

public abstract class Shape {
	/**
	 * @param dx x轴偏移量
	 * @param dy y轴偏移量
	 * */
	public abstract void move(int dx, int dy);
	
	@Override
	public abstract Shape clone();
	
	public static<T extends Shape> List<T> copyExact(List<T> list, Class<T> clazz) {
		List<T> copied = new ArrayList<>(list.size());
		for(int i = 0; i < list.size(); i++) {
			copied.set(i, clazz.cast(list.get(i).clone()));
		}
		return copied;
	}
	
	public static List<Shape> copyGeneric(List<? extends Shape> list) {
		List<Shape> copied = new ArrayList<>(list.size());
		for(int i = 0; i < list.size(); i++) {
			copied.set(i, list.get(i).clone());
		}
		return copied;
	}
}
