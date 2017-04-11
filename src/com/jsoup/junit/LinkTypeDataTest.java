package com.jsoup.junit;

import java.util.List;

import org.junit.Test;

import com.jsoup.bean.LinkTypeData;
import com.jsoup.rule.Rule;
import com.jsoup.service.ExtractService;
import com.jsoup.statics.StaticUtil;

/**
 * 测试类。
 * @author wangmin
 * @since 2017年4月11日-上午11:45:41
 * @version V1.0
 */
public class LinkTypeDataTest {

	@Test
	public void getDatasByCssQueryUserBaidu()  
	{  
	    Rule rule = new Rule("http://http://localhost:8080/ZLPJ/home.jsp",  
	            new String[] { "word" }, new String[] { "支付宝" },  
	            null, -1, StaticUtil.GET);  
	    List<LinkTypeData> extracts = ExtractService.extract(rule);  
	    System.out.println(extracts);  
	}  
}
