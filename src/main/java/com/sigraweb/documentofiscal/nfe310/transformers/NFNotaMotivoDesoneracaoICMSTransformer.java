package com.sigraweb.documentofiscal.nfe310.transformers;

import com.sigraweb.documentofiscal.nfe310.classes.NFNotaMotivoDesoneracaoICMS;
import org.simpleframework.xml.transform.Transform;

public class NFNotaMotivoDesoneracaoICMSTransformer implements Transform<NFNotaMotivoDesoneracaoICMS> {

    @Override
    public NFNotaMotivoDesoneracaoICMS read(final String codigo) {
        return NFNotaMotivoDesoneracaoICMS.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFNotaMotivoDesoneracaoICMS desoneracaoICMS) {
        return desoneracaoICMS.getCodigo();
    }
}