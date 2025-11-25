package com.sigraweb.documentofiscal.nfe310.transformers;

import com.sigraweb.documentofiscal.nfe310.classes.NFProcessoEmissor;
import org.simpleframework.xml.transform.Transform;

public class NFProgramaEmissorTransformer implements Transform<NFProcessoEmissor> {

    @Override
    public NFProcessoEmissor read(final String codigo) {
        return NFProcessoEmissor.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFProcessoEmissor tipo) {
        return tipo.getCodigo();
    }
}