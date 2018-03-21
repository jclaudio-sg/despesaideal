package br.ideal.appdespesaideal.model;

import java.io.Serializable;

/**
 *      Created by Claudio Gonçalves on 19/03/2018.
 */

public class ResumoGeralItem implements Serializable {

    private Integer codigo;
    private String mes;
    private Integer ano;
    private String valor;

    public ResumoGeralItem() {  }

    public ResumoGeralItem(Integer codigo, String mes, Integer ano, String valor) {
        this.codigo = codigo;
        this.mes = mes;
        this.ano = ano;
        this.valor = valor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
