package com.jsoup.bean;

/**
 * 对需要的数据对象封装，本类目前只封装需要的链接。
 * @author wangmin
 * @since 2017年4月11日-上午10:21:31
 * @version V1.0
 */
public class LinkTypeData {

	private int id;
	/**
	 * 链接的地址。
	 */
	private String linkHref;
	/**
	 * 链接的标题。
	 */
	private String linkText;
	/**
	 * 摘要。
	 */
	private String summary;
	/**
	 * 内容。
	 */
	private String content;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLinkHref() {
		return linkHref;
	}
	public void setLinkHref(String linkHref) {
		this.linkHref = linkHref;
	}
	public String getLinkText() {
		return linkText;
	}
	public void setLinkText(String linkText) {
		this.linkText = linkText;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "LinkTypeData [id=" + id + ", linkHref=" + linkHref
				+ ", linkText=" + linkText + ", summary=" + summary
				+ ", content=" + content + "]";
	}
}
