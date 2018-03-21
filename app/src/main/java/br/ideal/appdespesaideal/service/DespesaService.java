package br.ideal.appdespesaideal.service;

import android.content.Context;

import java.util.List;

import br.ideal.appdespesaideal.dao.DespesaDAO;
import br.ideal.appdespesaideal.model.Despesa;

/**
 *      Criado por Claudio Gonçalves em 06/01/2018.
 */

public class DespesaService {

    private Context contexto;
    private DespesaDAO despesaDAO;

    public DespesaService(Context contexto) {
        this.contexto = contexto;
        this.despesaDAO = new DespesaDAO(this.contexto);
    }

}
