package yyzh.graph.core.conllision;

import yyzh.graph.core.exception.TypeException;

public class Collision {

	public static boolean collisionDetect(ICollision a, ICollision b) {
		checkSupportType(a);
		checkSupportType(b);
		// TODO
		return false;
	}
	
	private static void checkSupportType(ICollision c) {
		if(!AxisAlignedBoundingBox.class.isInstance(c)
				&& !Sphere.class.isInstance(c)) {
			throw new TypeException("不支持的类型: " + c.getClass().getName());
		}
	}
	
}
