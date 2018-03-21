package br.ideal.appdespesaideal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import br.ideal.appdespesaideal.adapter.IRecyclerViewAction;
import br.ideal.appdespesaideal.constants.Parametros;
import br.ideal.appdespesaideal.model.Despesa;
import br.ideal.appdespesaideal.model.ResumoGeralItem;

public class ListaDespesaActivity extends AppCompatActivity implements IRecyclerViewAction {

    private RecyclerView recyclerView;

    private List<Despesa> despesaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_despesa);

        init();
        recuperaParametros();
        initListaDespesas();
    }

    private void init() {
        this.despesaList = new ArrayList<>();
    }

    private void recuperaParametros() {
        if( getIntent().getExtras() != null ) {
            Bundle bundle = getIntent().getExtras();
            ResumoGeralItem item = (ResumoGeralItem) bundle.get(Parametros.PARAM_DESPESA_ITEM);

        }
    }

    private void initListaDespesas() {

    }

    @Override
    public void onClickListener(Object obj) {

    }
}
