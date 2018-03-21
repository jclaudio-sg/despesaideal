package br.ideal.appdespesaideal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import br.ideal.appdespesaideal.adapter.IRecyclerViewAction;
import br.ideal.appdespesaideal.adapter.ResumoGeralAdapter;
import br.ideal.appdespesaideal.constants.Parametros;
import br.ideal.appdespesaideal.model.ResumoGeralItem;
import br.ideal.appdespesaideal.service.DespesaService;
import br.ideal.appdespesaideal.util.App;

public class ResumoGeralActivity extends AppCompatActivity implements IRecyclerViewAction {

    private TextView textViewAno;
    private ImageButton imageButtonEsquerdo, imageButtonDireito;
    private RecyclerView recyclerView;

    private List<ResumoGeralItem> resumoGeralItemList;

    private DespesaService despesaService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumo_geral);
        this.despesaService = new DespesaService(this);
        init();
    }

    private void init() {
        this.textViewAno = (TextView) findViewById(R.id.textview_ano);
        this.textViewAno.setText("2018");
        this.imageButtonDireito = (ImageButton) findViewById(R.id.imagebutton_icone_direito);
        aumentarAno();
        this.imageButtonEsquerdo = (ImageButton) findViewById(R.id.imagebutton_icone_esquerdo);
        diminuirAno();
        initListaResumoGeral();
    }

    private void aumentarAno() {
        this.imageButtonDireito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer ano = Integer.parseInt( textViewAno.getText().toString() );
                textViewAno.setText( String.valueOf( ano + 1 ) );
            }
        });
    }

    private void diminuirAno() {
        this.imageButtonEsquerdo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer ano = Integer.parseInt( textViewAno.getText().toString() );
                textViewAno.setText( String.valueOf( ano - 1 ) );
                if( ano == 1 ) {
                    textViewAno.setText( String.valueOf( 1 ) );
                }
            }
        });
    }

    private void initListaResumoGeral() {
        this.resumoGeralItemList = new ArrayList<>();
        addItem();
        ResumoGeralAdapter adapter = new ResumoGeralAdapter(this.resumoGeralItemList, this);
        this.recyclerView = (RecyclerView) findViewById(R.id.recyclerview_resumo_geral);
        this.recyclerView.setLayoutManager( new LinearLayoutManager(this));
        this.recyclerView.setHasFixedSize(Boolean.TRUE);
        this.recyclerView.setAdapter( adapter );
    }

    private void addItem() {
        this.resumoGeralItemList.add( new ResumoGeralItem(1, "Janeiro", 2018, "R$ 0,00") );
        this.resumoGeralItemList.add( new ResumoGeralItem(2, "Fevereiro", 2018, "R$ 0,00") );
        this.resumoGeralItemList.add( new ResumoGeralItem(3, "Março", 2018, "R$ 0,00") );
        this.resumoGeralItemList.add( new ResumoGeralItem(4, "Abril", 2018, "R$ 0,00") );
        this.resumoGeralItemList.add( new ResumoGeralItem(5, "Maio", 2018, "R$ 0,00") );
        this.resumoGeralItemList.add( new ResumoGeralItem(6, "Junho", 2018, "R$ 0,00") );
        this.resumoGeralItemList.add( new ResumoGeralItem(7, "Julho", 2018, "R$ 0,00") );
        this.resumoGeralItemList.add( new ResumoGeralItem(8, "Agosto", 2018, "R$ 0,00") );
        this.resumoGeralItemList.add( new ResumoGeralItem(9, "Setembro", 2018, "R$ 0,00") );
        this.resumoGeralItemList.add( new ResumoGeralItem(10, "Outubro", 2018, "R$ 0,00") );
        this.resumoGeralItemList.add( new ResumoGeralItem(11, "Novembro", 2018, "R$ 0,00") );
        this.resumoGeralItemList.add( new ResumoGeralItem(12, "Dezembro", 2018, "R$ 0,00") );
    }

    @Override
    public void onClickListener(Object obj) {
        ResumoGeralItem item = (ResumoGeralItem) obj;
        Intent intent = new Intent(this, ListaDespesaActivity.class);
        intent.putExtra(Parametros.PARAM_DESPESA_ITEM, item);
        startActivity(intent);
        this.finish();
    }
}
