package com.jsoup.util;

/**
 * 字符串非空验证。
 * @author wangmin
 * @since 2017年4月11日-上午10:55:16
 * @version V1.0
 */
public class TextUtil {

	public static boolean isEmpty(String text)
	{
		if (text == null || text.length() == 0)
		{
			return true;
		}
		return false;
	}
}
