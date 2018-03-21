package br.ideal.appdespesaideal.util;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.ideal.appdespesaideal.enuns.TipoDespesaEnum;

/**
 *      Criado por Claudio Gonçalves em 06/01/2018.
 */

public class Util {

    /**
     * Recupera o ano atual do sistema.
     * @return Integer
     */
    public static Integer getAnoAtual() {
        Calendar cal = Calendar.getInstance();
        return cal.get( Calendar.YEAR );
    }

    /**
     * Método utilizado para formatar apenas o dia acrescentando o zero a esquerda do número
     * se for menor do que 10.
     * @param dia Integer
     * @return String
     */
    public static String adicionaZeroEsquerda(Integer dia) {
        return ( dia < 10 ? "0" + dia : String.valueOf(dia) );
    }

    /**
     * Método utilizado para concatenar uma data completa no seguinte formato dd/MM/yyyy.
     * @param dia Integer
     * @param mes String
     * @param ano Integer
     * @return String
     */
    public static String formataDataCompleta(Integer dia, Integer mes, Integer ano) {
        return adicionaZeroEsquerda(dia) + "/" + adicionaZeroEsquerda(mes) + "/" + ano;
    }

    public static List<String> getListaTipoDespesa() {
        List<String> lista = new ArrayList<>();
        for( TipoDespesaEnum item : TipoDespesaEnum.values()) {
            lista.add( item.getDescricao() );
        }
        return lista;
    }
}
