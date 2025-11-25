package com.sigraweb.documentofiscal.nfe310.classes.nota;

import org.simpleframework.xml.Element;

import com.sigraweb.documentofiscal.DFBase;
import com.sigraweb.documentofiscal.nfe310.classes.NFNotaInfoSituacaoTributariaIPI;

public class NFNotaInfoItemImpostoIPINT extends DFBase {
    private static final long serialVersionUID = -3247957187868898218L;

    @Element(name = "IPINT", required = true)
    private NFNotaInfoSituacaoTributariaIPI situacaoTributariaIPI;

    public NFNotaInfoSituacaoTributariaIPI getSituacaoTributariaIPI() {
        return this.situacaoTributariaIPI;
    }

    public void setSituacaoTributariaIPI(final NFNotaInfoSituacaoTributariaIPI situacaoTributariaIPI) {
        this.situacaoTributariaIPI = situacaoTributariaIPI;
    }
}