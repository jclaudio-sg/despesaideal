package br.ideal.appdespesaideal.enuns;

/**
 *      Criado por Claudio Gonçalves em 06/01/2018.
 */

public enum  TipoDespesaEnum {

    ALIMENTACAO("01", "Alimentação"),
    MORADIA("02", "Moradia"),
    MERCADO("03", "Mercado"),
    CONTA("04", "Divida"),
    ROUPA("05", "Roupa"),
    EDUCACAO("06", "Educação"),
    LAZER("07", "Lazer"),
    SAUDE("08", "Saúde"),
    TRANSPORTE("09", "Transporte"),
    OUTROS("10", "Outros");

    private String codigo;
    private String descricao;

    TipoDespesaEnum(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
}