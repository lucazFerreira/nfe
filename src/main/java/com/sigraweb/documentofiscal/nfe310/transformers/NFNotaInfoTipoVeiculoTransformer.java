package com.sigraweb.documentofiscal.nfe310.transformers;

import com.sigraweb.documentofiscal.nfe310.classes.NFNotaInfoTipoVeiculo;
import org.simpleframework.xml.transform.Transform;

public class NFNotaInfoTipoVeiculoTransformer implements Transform<NFNotaInfoTipoVeiculo> {

    @Override
    public NFNotaInfoTipoVeiculo read(final String codigoTipoVeiculo) {
        return NFNotaInfoTipoVeiculo.valueOfCodigo(codigoTipoVeiculo);
    }

    @Override
    public String write(final NFNotaInfoTipoVeiculo tipoVeiculo) {
        return tipoVeiculo.getCodigo();
    }
}