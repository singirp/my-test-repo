package com.invenio.mulepoc.id003ww;


import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;
import org.mule.transformer.types.DataTypeFactory;


import com.invenio.mulepoc.ParamInput;

public class ZFIInput extends AbstractMessageTransformer {

	public ZFIInput() {
		super();		
		this.registerSourceType(DataTypeFactory.STRING);
		this.setReturnDataType(DataTypeFactory.create(ParamInput.class));
	}

	
	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding)
			throws TransformerException {
		// TODO Auto-generated method stub
		ParamInput ip = new ParamInput();
		ip.setClient("900");
		ip.setKey1("ID003WW");
		ip.setKey2(message.getInvocationProperty("country").toString());
		ip.setValidFrom("20131113");
		return ip;
	}

}
