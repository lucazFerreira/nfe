package com.fincatto.documentofiscal.nfe400.classes.nota;

import java.math.BigDecimal;

import org.simpleframework.xml.Element;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.validadores.BigDecimalParser;

public class NFNotaInfoItemImpostoCOFINS extends DFBase {
    private static final long serialVersionUID = -2776137091542174644L;

    @Element(name = "COFINSAliq", required = false)
    private NFNotaInfoItemImpostoCOFINSAliquota aliquota;

    @Element(name = "COFINSQtde", required = false)
    private NFNotaInfoItemImpostoCOFINSQuantidade quantidade;

    @Element(name = "COFINSNT", required = false)
    private NFNotaInfoItemImpostoCOFINSNaoTributavel naoTributavel;

    @Element(name = "COFINSOutr", required = false)
    private NFNotaInfoItemImpostoCOFINSOutrasOperacoes outrasOperacoes;
    
    @Element(name = "vBC", required = false)
    private String valorBaseCalculo;

    public void setAliquota(final NFNotaInfoItemImpostoCOFINSAliquota aliquota) {
        if (this.quantidade != null || this.naoTributavel != null || this.outrasOperacoes != null) {
            throw new IllegalStateException("Aliquota, quantidade, nao tributavel e outras operacoes sao mutuamente exclusivos");
        }
        this.aliquota = aliquota;
    }

    public void setQuantidade(final NFNotaInfoItemImpostoCOFINSQuantidade quantidade) {
        if (this.aliquota != null || this.naoTributavel != null || this.outrasOperacoes != null) {
            throw new IllegalStateException("Aliquota, quantidade, nao tributavel e outras operacoes sao mutuamente exclusivos");
        }
        this.quantidade = quantidade;
    }

    public void setNaoTributavel(final NFNotaInfoItemImpostoCOFINSNaoTributavel naoTributavel) {
        if (this.quantidade != null || this.aliquota != null || this.outrasOperacoes != null) {
            throw new IllegalStateException("Aliquota, quantidade, nao tributavel e outras operacoes sao mutuamente exclusivos");
        }
        this.naoTributavel = naoTributavel;
    }

    public void setOutrasOperacoes(final NFNotaInfoItemImpostoCOFINSOutrasOperacoes outrasOperacoes) {
        if (this.quantidade != null || this.naoTributavel != null || this.aliquota != null) {
            throw new IllegalStateException("Aliquota, quantidade, nao tributavel e outras operacoes sao mutuamente exclusivos");
        }
        this.outrasOperacoes = outrasOperacoes;
    }
    
	public void setValorBaseCalculo(final BigDecimal valorBaseCalculo) {
        this.valorBaseCalculo = BigDecimalParser.tamanho15Com2CasasDecimais(valorBaseCalculo, "Valor BC Importacao Item");
	}
    
    public NFNotaInfoItemImpostoCOFINSAliquota getAliquota() {
        return this.aliquota;
    }

    public NFNotaInfoItemImpostoCOFINSQuantidade getQuantidade() {
        return this.quantidade;
    }

    public NFNotaInfoItemImpostoCOFINSNaoTributavel getNaoTributavel() {
        return this.naoTributavel;
    }

    public NFNotaInfoItemImpostoCOFINSOutrasOperacoes getOutrasOperacoes() {
        return this.outrasOperacoes;
    }
    
	public String getValorBaseCalculo() {
		return this.valorBaseCalculo;
	}
}