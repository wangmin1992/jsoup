package com.jsoup.rule;

import com.jsoup.statics.StaticUtil;

/**
 * 用于指定查询url,method,params等。
 * 定义了我们查询过程中需要的所有信息，方便代码的重用。
 * @author wangmin
 * @since 2017年4月11日-上午10:05:36
 * @version V1.0
 */
public class Rule {

	/**
	 * 链接。
	 */
	private String url;
	
	/**
	 * 参数集合。
	 */
	private String[] params;
	
	/**
	 * 参数对应的值。
	 */
	private String[] values;
	
	/**
	 * 对返回的HTML，第一次过滤所用的标签，请先设置type。
	 */
	private String resultTagName;
	
	/**
	 * CLASS / ID / SELECTION 
	 * 设置resultTagName的类型，默认为ID 
	 */
	private int type = StaticUtil.ID;
	
	/**
	 * GET / POST 
	 * 请求的类型，默认GET 
	 */
	private int requestMethod = StaticUtil.GET;
	
	public Rule() {
		super();
	}
	
	public Rule(String url, String[] params, String[] values,
			String resultTagName, int type, int requestMethod) {
		super();
		this.url = url;
		this.params = params;
		this.values = values;
		this.resultTagName = resultTagName;
		this.type = type;
		this.requestMethod = requestMethod;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String[] getParams() {
		return params;
	}
	public void setParams(String[] params) {
		this.params = params;
	}
	public String[] getValues() {
		return values;
	}
	public void setValues(String[] values) {
		this.values = values;
	}
	public String getResultTagName() {
		return resultTagName;
	}
	public void setResultTagName(String resultTagName) {
		this.resultTagName = resultTagName;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getRequestMethod() {
		return requestMethod;
	}
	public void setRequestMethod(int requestMethod) {
		this.requestMethod = requestMethod;
	}
}
