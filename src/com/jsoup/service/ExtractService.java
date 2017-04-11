package com.jsoup.service;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import com.jsoup.bean.LinkTypeData;
import com.jsoup.rule.Rule;
import com.jsoup.rule.RuleException;
import com.jsoup.statics.StaticUtil;
import com.jsoup.util.TextUtil;

/**
 * 
 * @author wangmin
 * @since 2017年4月11日-上午10:45:04
 * @version V1.0
 */
public class ExtractService {

	/**
	 * 
	 * @param rule
	 * @return
	 */
	public static List<LinkTypeData> extract(Rule rule)
	{
		List<LinkTypeData> datas = new ArrayList<LinkTypeData>();
		validateRule(rule);
		LinkTypeData data = null;
		try 
		{
			/**
			 * 解析URL
			 */
			String url = rule.getUrl();
			String[] params = rule.getParams();
			String[] values = rule.getValues();
			String resultTagName = rule.getResultTagName();
			int type = rule.getType();
			int requestType = rule.getRequestMethod();
			//创建链接
			Connection conn = Jsoup.connect(url);
			//设置查询参数
			if (params != null)
			{
				for (int i = 0 ; i < params.length ; i++)
				{
					conn.data(params[i], values[i]);
				}
			}
			//设置请求类型
			Document doc = null;
			switch (requestType) 
			{
			case StaticUtil.GET:
				doc = conn.timeout(100000).get();
				break;

			case StaticUtil.POST:
				doc = conn.timeout(100000).post();
				break;
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return datas;
	}
	
	/**
	 * 参数进行必要的校验。
	 * @param rule
	 */
	public static void validateRule(Rule rule)
	{
		String url = rule.getUrl();
		if (TextUtil.isEmpty(url))
		{
			throw new RuleException("url不能为空！");
		}
		
		if (!url.startsWith("http://"))
		{
			throw new RuleException("url的格式不正确！");
		}
		if (rule.getParams() != null && rule.getValues() != null)  
        {  
            if (rule.getParams().length != rule.getValues().length)  
            {  
                throw new RuleException("参数的键值对个数不匹配！");  
            }  
        }
	}
}
