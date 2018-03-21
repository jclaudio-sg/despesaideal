package br.ideal.appdespesaideal.model;

import java.io.Serializable;

import br.ideal.appdespesaideal.enuns.TipoDespesaEnum;

/**
 *      Criado por Claudio Gonçalves em 06/01/2018.
 */

public class Despesa implements Serializable {

    private Integer codigo;

    private String decricao;

    private TipoDespesaEnum tipoDespesaEnum;

    private String valor;

    private String data;

    public Despesa() {  }

    public Despesa(Integer codigo, String descricao, TipoDespesaEnum tipoDespesaEnum,
                   String valor, String data) {
        this.codigo = codigo;
        this.decricao = descricao;
        this.tipoDespesaEnum = tipoDespesaEnum;
        this.valor = valor;
        this.data = data;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDecricao() {
        return decricao;
    }

    public void setDecricao(String decricao) {
        this.decricao = decricao;
    }

    public TipoDespesaEnum getTipoDespesaEnum() {
        return tipoDespesaEnum;
    }

    public void setTipoDespesaEnum(TipoDespesaEnum tipoDespesaEnum) {
        this.tipoDespesaEnum = tipoDespesaEnum;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Despesa despesa = (Despesa) o;

        return codigo.equals(despesa.codigo);

    }

    @Override
    public int hashCode() {
        return codigo.hashCode();
    }
}
