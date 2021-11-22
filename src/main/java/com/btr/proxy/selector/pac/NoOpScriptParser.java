package com.btr.proxy.selector.pac;

/*****************************************************************************
 * This is a dummy implementation that does not resolve any script 
 * @author Bernd Rosstauscher (proxyvole@rosstauscher.de) Copyright 2009
 ****************************************************************************/

public class NoOpScriptParser implements PacScriptParser {

	/*************************************************************************
	 * getScriptSource
	 * @see com.btr.proxy.selector.pac.PacScriptParser#getScriptSource()
	 ************************************************************************/
	
	@Override
	public PacScriptSource getScriptSource() {
		return null;
	}

	/*************************************************************************
	 * evaluate
	 * @see com.btr.proxy.selector.pac.PacScriptParser#evaluate(java.lang.String, java.lang.String)
	 ************************************************************************/
	
	@Override
	public String evaluate(String url, String host) throws ProxyEvaluationException {
		return null; // No proxy resolving -> DIRECT connection 
	}

}

