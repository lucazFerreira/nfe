package com.fincatto.documentofiscal.cte300.classes.nota;

import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.validadores.ListValidador;
import com.fincatto.documentofiscal.validadores.StringValidador;

/**
 * @author Caio
 * @info Dados complementares do CT-e para fins operacionais ou comerciais
 */

@Root(name = "compl")
@Namespace(reference = "http://www.portalfiscal.inf.br/cte")
public class CTeNotaInfoDadosComplementares extends DFBase {
    private static final long serialVersionUID = -5163885421677876369L;

    @Element(name = "xCaracAd", required = false)
    private String caracteristicasTransporte;

    @Element(name = "xCaracSer", required = false)
    private String caracteristicasServico;

    @Element(name = "xEmi", required = false)
    private String funcionarioEmissor;

    @Element(name = "fluxo", required = false)
    private CTeNotaInfoDadosComplementaresFluxo fluxo;

    @Element(name = "Entrega", required = false)
    private CTeNotaInfoDadosComplementaresEntrega entrega;

    @Element(name = "origCalc", required = false)
    private String municipioOrigem;

    @Element(name = "destCalc", required = false)
    private String municipioDestino;

    @Element(name = "xObs", required = false)
    private String observacaoGeral;

    @ElementList(name = "ObsCont", inline = true, required = false)
    private List<CTeNotaInfoDadosComplementaresObservacaoContribuinte> observacaoContribuinte;

    @ElementList(name = "ObsFisco", inline = true, required = false)
    private List<CTeNotaInfoDadosComplementaresObservacaoFisco> observacaoFisco;

    public CTeNotaInfoDadosComplementares() {
        this.caracteristicasTransporte = null;
        this.caracteristicasServico = null;
        this.funcionarioEmissor = null;
        this.fluxo = null;
        this.entrega = null;
        this.municipioOrigem = null;
        this.municipioDestino = null;
        this.observacaoGeral = null;
        this.observacaoContribuinte = null;
        this.observacaoFisco = null;
    }

    public String getCaracteristicasTransporte() {
        return this.caracteristicasTransporte;
    }

    /**
     * Caracter??stica adicional do transporte<br>
     * Texto livre: REENTREGA; DEVOLU????O; REFATURAMENTO; etc
     */
    public void setCaracteristicasTransporte(final String caracteristicasTransporte) {
        StringValidador.tamanho15(caracteristicasTransporte, "Caracter??stica adicional do transporte");
        this.caracteristicasTransporte = caracteristicasTransporte;
    }

    public String getCaracteristicasServico() {
        return this.caracteristicasServico;
    }

    /**
     * Caracter??stica adicional do servi??o<br>
     * Texto livre: ENTREGA EXPRESSA; LOG??STICA REVERSA; CONVENCIONAL; EMERGENCIAL; etc
     */
    public void setCaracteristicasServico(final String caracteristicasServico) {
        StringValidador.tamanho30(caracteristicasServico, "Caracter??stica adicional do servi??o");
        this.caracteristicasServico = caracteristicasServico;
    }

    public String getFuncionarioEmissor() {
        return this.funcionarioEmissor;
    }

    /**
     * Funcion??rio emissor do CTe
     */
    public void setFuncionarioEmissor(final String funcionarioEmissor) {
        StringValidador.tamanho20(funcionarioEmissor, "Funcion??rio emissor do CTe");
        this.funcionarioEmissor = funcionarioEmissor;
    }

    public CTeNotaInfoDadosComplementaresFluxo getFluxo() {
        return this.fluxo;
    }

    /**
     * Previs??o do fluxo da carga<br>
     * Preenchimento obrigat??rio para o modal a??reo.
     */
    public void setFluxo(final CTeNotaInfoDadosComplementaresFluxo fluxo) {
        this.fluxo = fluxo;
    }

    public CTeNotaInfoDadosComplementaresEntrega getEntrega() {
        return this.entrega;
    }

    /**
     * Informa????es ref. a previs??o de entrega
     */
    public void setEntrega(final CTeNotaInfoDadosComplementaresEntrega entrega) {
        this.entrega = entrega;
    }

    public String getMunicipioOrigem() {
        return this.municipioOrigem;
    }

    /**
     * Munic??pio de origem para efeito de c??lculo do frete
     */
    public void setMunicipioOrigem(final String municipioOrigem) {
        StringValidador.tamanho2ate40(municipioOrigem, "Munic??pio de origem para efeito de c??lculo do frete");
        this.municipioOrigem = municipioOrigem;
    }

    public String getMunicipioDestino() {
        return this.municipioDestino;
    }

    /**
     * Munic??pio de destino para efeito de c??lculo do frete
     */
    public void setMunicipioDestino(final String municipioDestino) {
        StringValidador.tamanho2ate40(municipioDestino, "Munic??pio de destino para efeito de c??lculo do frete");
        this.municipioDestino = municipioDestino;
    }

    public String getObservacaoGeral() {
        return this.observacaoGeral;
    }

    /**
     * Observa????es Gerais
     */
    public void setObservacaoGeral(final String observacaoGeral) {
        StringValidador.tamanho2000(observacaoGeral, "Observa????es Gerais");
        this.observacaoGeral = observacaoGeral;
    }

    public List<CTeNotaInfoDadosComplementaresObservacaoContribuinte> getObservacaoContribuinte() {
        return this.observacaoContribuinte;
    }

    /**
     * Campo de uso livre do contribuinte
     */
    public void setObservacaoContribuinte(final List<CTeNotaInfoDadosComplementaresObservacaoContribuinte> observacaoContribuinte) {
        ListValidador.tamanho10(observacaoContribuinte, "Observa????o de interesse do contribuinte");
        this.observacaoContribuinte = observacaoContribuinte;
    }

    public List<CTeNotaInfoDadosComplementaresObservacaoFisco> getObservacaoFisco() {
        return this.observacaoFisco;
    }

    /**
     * Campo de uso livre do contribuinte
     */
    public void setObservacaoFisco(final List<CTeNotaInfoDadosComplementaresObservacaoFisco> observacaoFisco) {
        ListValidador.tamanho10(observacaoFisco, "Observa????o de interesse do fisco");
        this.observacaoFisco = observacaoFisco;
    }

}
