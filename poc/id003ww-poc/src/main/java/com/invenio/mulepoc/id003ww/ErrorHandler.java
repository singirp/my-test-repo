package com.invenio.mulepoc.id003ww;

import org.mule.api.MuleEventContext;


public class ErrorHandler implements org.mule.api.lifecycle.Callable {

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("ZFI Param Check failed");
	}

	

}
