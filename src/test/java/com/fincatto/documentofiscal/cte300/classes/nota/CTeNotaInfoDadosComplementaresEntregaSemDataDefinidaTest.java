package com.fincatto.documentofiscal.cte300.classes.nota;

import org.junit.Assert;
import org.junit.Test;

import com.fincatto.documentofiscal.cte300.classes.CTTipoPrazoDataEntrega;

public class CTeNotaInfoDadosComplementaresEntregaSemDataDefinidaTest {

    @Test
    public void deveSerTipoPrazoEntregaSemDataDefinida() {
        final CTeNotaInfoDadosComplementaresEntregaSemDataDefinida entregaSemDataDefinida = new CTeNotaInfoDadosComplementaresEntregaSemDataDefinida();
        entregaSemDataDefinida.setTipoPrazoDataEntrega(CTTipoPrazoDataEntrega.SEM_DATA_DEFINIDA);
        Assert.assertEquals("0", entregaSemDataDefinida.getTipoPrazoDataEntrega().getCodigo());
    }

    @Test
    public void deveGerarXmlCorreto() {
        final CTeNotaInfoDadosComplementaresEntregaSemDataDefinida entregaSemDataDefinida = new CTeNotaInfoDadosComplementaresEntregaSemDataDefinida();
        entregaSemDataDefinida.setTipoPrazoDataEntrega(CTTipoPrazoDataEntrega.SEM_DATA_DEFINIDA);
        Assert.assertEquals("<semData><tpPer>0</tpPer></semData>", entregaSemDataDefinida.toString());
    }

}
