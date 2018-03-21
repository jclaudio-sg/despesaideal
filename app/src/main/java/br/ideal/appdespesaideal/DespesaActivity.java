package br.ideal.appdespesaideal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.List;

import br.ideal.appdespesaideal.util.Util;

public class DespesaActivity extends AppCompatActivity {

    private Spinner spinnerTipoDespesa;
    private EditText editTextDescricao, editTextValor, editTextDia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_despesa);
        init();
    }

    private void init() {
        List<String> listaTipoDespesa = Util.getListaTipoDespesa();
        this.spinnerTipoDespesa = (Spinner) findViewById(R.id.spinner_tipo_despesa);
        ArrayAdapter<String> adapterSpinner = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, listaTipoDespesa);
        adapterSpinner.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item );
        this.spinnerTipoDespesa.setAdapter( adapterSpinner );
        this.editTextDescricao = (EditText) findViewById(R.id.edittext_descricao);
        this.editTextValor = (EditText) findViewById(R.id.edittext_valor);
        this.editTextDia = (EditText) findViewById(R.id.edittext_dia);
    }
}
