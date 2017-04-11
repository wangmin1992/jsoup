package com.jsoup.rule;

/**
 * 自定义异常类。
 * @author wangmin
 * @since 2017年4月11日-上午10:58:57
 * @version V1.0
 */
public class RuleException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public RuleException()
	{
		super();
		
	}
	
	public RuleException(String message, Throwable cause)
	{
		super(message, cause);
	}

	public RuleException(String message)
	{
		super(message);
	}

	public RuleException(Throwable cause) 
	{
		super(cause);
	}
}
