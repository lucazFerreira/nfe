package com.sigraweb.documentofiscal.nfe400.transformers;

import com.sigraweb.documentofiscal.nfe400.classes.NFNotaInfoEspecieVeiculo;
import org.simpleframework.xml.transform.Transform;

public class NFNotaInfoEspecieVeiculoTransformer implements Transform<NFNotaInfoEspecieVeiculo> {

    @Override
    public NFNotaInfoEspecieVeiculo read(final String codigoEspecieVeiculo) {
        return NFNotaInfoEspecieVeiculo.valueOfCodigo(codigoEspecieVeiculo);
    }

    @Override
    public String write(final NFNotaInfoEspecieVeiculo especieVeiculo) {
        return especieVeiculo.getCodigo();
    }
}