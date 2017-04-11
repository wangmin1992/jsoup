package com.jsoup.enums;

/**
 * 静态常量。
 * @author wangmin
 * @since 2017年4月11日-上午10:36:28
 * @version V1.0
 */
public enum Enum {

	GET(0),POST(1),CLASS(0),ID(1),SELECTION(2);
	
	private int index;
	
	private Enum( int index) {
		this.index = index;
	}
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	
}
