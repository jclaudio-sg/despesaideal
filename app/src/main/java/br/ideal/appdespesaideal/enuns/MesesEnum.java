package br.ideal.appdespesaideal.enuns;

/**
 *      Classe Enum que representa os meses do ano.
 *
 *      Criado por Claudio Gonçalves em 06/01/2018.
 */

public enum MesesEnum {

    JANEIRO("01", "Janeiro"),
    FEVEREIRO("02", "Fevereiro"),
    MARCO("03", "Março"),
    ABRIL("04", "Abril"),
    MAIO("05", "Maio"),
    JUNHO("06", "Junho"),
    JULHO("07", "Julho"),
    AGOSTO("08", "Agosto"),
    SETEMBRO("09", "Setembro"),
    OUTUBRO("10", "Outubro"),
    NOVEMBRO("11", "Novembro"),
    DEZEMBRO("12", "Dezembro");

    private String codigo;
    private String descricao;

    MesesEnum(String codigo, String descricao) {
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
