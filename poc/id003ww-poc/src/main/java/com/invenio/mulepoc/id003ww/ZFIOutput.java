package com.invenio.mulepoc.id003ww;

import java.util.List;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;
import org.mule.transformer.types.DataTypeFactory;

import com.invenio.mulepoc.EaiParam;


public class ZFIOutput extends AbstractMessageTransformer {

	public ZFIOutput() {
		super();
		this.registerSourceType(DataTypeFactory.create(List.class));
		this.setReturnDataType(DataTypeFactory.STRING);
	}

	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding)
			throws TransformerException {
		// TODO Auto-generated method stub
		String result = "";
		//System.out.println("Reached ZFIOutput transformation");
		@SuppressWarnings("unchecked")
		List<EaiParam> l=  (List<EaiParam>) message.getPayload();
		for (int i = 0; i < l.size(); i++) {
            EaiParam tmpParam = l.get( i );
            if (tmpParam.getParaName().contains( "EXTENDED_VERSION_Y_N" )) {
                result = tmpParam.getParaParam().trim().toUpperCase();
            }
        }
		return result;
	}

}
