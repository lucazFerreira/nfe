package com.sigraweb.documentofiscal.cte200.transformers;

import com.sigraweb.documentofiscal.cte200.classes.CTUnidadeMedida;
import org.simpleframework.xml.transform.Transform;

public class CTUnidadeMedidaTransformer implements Transform<CTUnidadeMedida> {

    @Override
    public CTUnidadeMedida read(final String codigo) {
        return CTUnidadeMedida.valueOfCodigo(codigo);
    }

    @Override
    public String write(final CTUnidadeMedida tipo) {
        return tipo.getCodigo();
    }
}