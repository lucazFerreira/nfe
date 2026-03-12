package com.sigraweb.documentofiscal.nfe400.classes.nota;

import java.math.BigDecimal;

import org.simpleframework.xml.Element;

import com.sigraweb.documentofiscal.DFBase;
import com.sigraweb.documentofiscal.validadores.BigDecimalParser;

public class NFNotaInfoItemDespesas extends DFBase {
    private static final long serialVersionUID = 1L;

    @Element(name = "vAntidumping", required = false)
    private String valorAntidumping;

    @Element(name = "vAFRMM", required = false)
    private String valorAFRMM;

    @Element(name = "vSISCOMEX", required = false)
    private String valorSISCOMEX;

    public void setValorAntidumping(final BigDecimal valorAntidumping) {
        this.valorAntidumping = BigDecimalParser.tamanho15Com2CasasDecimais(valorAntidumping, "Valor Antidumping");
    }

    public void setValorAFRMM(final BigDecimal valorAFRMM) {
        this.valorAFRMM = BigDecimalParser.tamanho15Com2CasasDecimais(valorAFRMM, "Valor AFRMM");
    }

    public void setValorSISCOMEX(final BigDecimal valorSISCOMEX) {
        this.valorSISCOMEX = BigDecimalParser.tamanho15Com2CasasDecimais(valorSISCOMEX, "Valor SISCOMEX");
    }

    public String getValorAntidumping() {
        return this.valorAntidumping;
    }

    public String getValorAFRMM() {
        return this.valorAFRMM;
    }

    public String getValorSISCOMEX() {
        return this.valorSISCOMEX;
    }
}