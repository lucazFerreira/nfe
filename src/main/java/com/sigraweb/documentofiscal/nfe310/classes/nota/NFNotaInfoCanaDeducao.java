package com.sigraweb.documentofiscal.nfe310.classes.nota;

import java.math.BigDecimal;

import org.simpleframework.xml.Element;

import com.sigraweb.documentofiscal.DFBase;
import com.sigraweb.documentofiscal.validadores.BigDecimalParser;
import com.sigraweb.documentofiscal.validadores.StringValidador;

public class NFNotaInfoCanaDeducao extends DFBase {
    private static final long serialVersionUID = 5519359886554978924L;

    @Element(name = "xDed", required = true)
    private String descricaoDeducao;

    @Element(name = "vDed", required = true)
    private String valorDeducao;

    public void setDescricaoDeducao(final String descricaoDeducao) {
        StringValidador.tamanho60(descricaoDeducao, "Descricao Deducao");
        this.descricaoDeducao = descricaoDeducao;
    }

    public void setValorDeducao(final BigDecimal valorDeducao) {
        this.valorDeducao = BigDecimalParser.tamanho15Com2CasasDecimais(valorDeducao, "Valor Deducao");
    }

    public String getDescricaoDeducao() {
        return this.descricaoDeducao;
    }

    public String getValorDeducao() {
        return this.valorDeducao;
    }
}