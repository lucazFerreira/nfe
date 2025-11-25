package com.sigraweb.documentofiscal.cte300.classes.nota;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import com.sigraweb.documentofiscal.DFBase;
import com.sigraweb.documentofiscal.validadores.StringValidador;

/**
 * @author Caio
 * @info Documentos de transporte anterior eletrônicos
 */

@Root(name = "idDocAntEle")
@Namespace(reference = "http://www.portalfiscal.inf.br/cte")
public class CTeNotaInfoCTeNormalDocumentosAnterioresEmissorDocumentosAnterioresIdentificacaoEletronico extends DFBase {
    private static final long serialVersionUID = 2213593985843451157L;

    @Element(name = "chCTe", required = true)
    private String chaveCTe;

    public CTeNotaInfoCTeNormalDocumentosAnterioresEmissorDocumentosAnterioresIdentificacaoEletronico() {
        this.chaveCTe = null;
    }

    public String getChaveCTe() {
        return this.chaveCTe;
    }

    /**
     * Chave de acesso do CT-e
     */
    public void setChaveCTe(final String chaveCTe) {
        StringValidador.exatamente44N(chaveCTe, "Chave de acesso do CT-e");
        this.chaveCTe = chaveCTe;
    }
}
