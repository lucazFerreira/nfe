package com.sigraweb.documentofiscal.cte200.classes.cte;

import org.simpleframework.xml.Element;

import com.sigraweb.documentofiscal.DFBase;
import com.sigraweb.documentofiscal.nfe310.classes.NFNotaInfoImpostoTributacaoICMS;

public class CTInfoImpostoICMS45 extends DFBase {
    private static final long serialVersionUID = 5790409052194264441L;

    @Element(name = "CST")
    private NFNotaInfoImpostoTributacaoICMS situacaoTributaria;

    public NFNotaInfoImpostoTributacaoICMS getSituacaoTributaria() {
        return this.situacaoTributaria;
    }

    public void setSituacaoTributaria(final NFNotaInfoImpostoTributacaoICMS situacaoTributaria) {
        this.situacaoTributaria = situacaoTributaria;
    }

}
