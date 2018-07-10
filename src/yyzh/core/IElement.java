package yyzh.core;

import yyzh.graph.conllision.ICollision;

public interface IElement {

	/**
	 * 元素所在图层,绘制时按照从低到高绘制,图层低的内容可能会被覆盖
	 * */
	public int getLayer();
	
	/**
	 * 得到该元素的默认碰撞体
	 * */
	public ICollision getCollision();
	
}
