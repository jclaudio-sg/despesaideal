package br.ideal.appdespesaideal.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import br.ideal.appdespesaideal.R;
import br.ideal.appdespesaideal.model.Despesa;

/**
 *      Criado por Claudio Gonçalves em 07/01/2018.
 */

public class DespesaAdapter extends RecyclerView.Adapter<DespesaAdapter.DespesaHolder> {

    private List<Despesa> lista;
    private IRecyclerViewAction iRecyclerViewAction;

    public DespesaAdapter(List<Despesa> lista, IRecyclerViewAction iRecyclerViewAction) {
        this.lista = lista;
        this.iRecyclerViewAction = iRecyclerViewAction;
    }

    @Override
    public DespesaHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( parent.getContext() ).inflate(R.layout.item_despesa, parent, false);
        return new DespesaHolder(view);
    }

    @Override
    public void onBindViewHolder(DespesaHolder holder, int position) {
        Despesa despesa = lista.get(position);
        holder.textViewDespesaData.setText( despesa.getData() );
        holder.textViewDespesaDescricao.setText( despesa.getDecricao() );
        holder.textViewDespesaTipo.setText( despesa.getTipoDespesaEnum().getDescricao() );
        holder.textViewDespesaValor.setText( despesa.getValor() );
    }

    @Override
    public int getItemCount() {
        return lista == null ? 0 : lista.size();
    }

    public class DespesaHolder extends RecyclerView.ViewHolder {

        private TextView textViewDespesaData;
        private TextView textViewDespesaDescricao;
        private TextView textViewDespesaTipo;
        private TextView textViewDespesaValor;

        public DespesaHolder(View itemView) {
            super(itemView);
            this.textViewDespesaData = (TextView) itemView.findViewById(R.id.textview_despesa_data);
            this.textViewDespesaDescricao = (TextView) itemView.findViewById(R.id.textview_despesa_desricao);
            this.textViewDespesaTipo = (TextView) itemView.findViewById(R.id.textview_despesa_tipo);
            this.textViewDespesaValor = (TextView) itemView.findViewById(R.id.textview_despesa_valor);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Despesa item = lista.get(getAdapterPosition());
                    iRecyclerViewAction.onClickListener( item );
                }
            });
        }
    }
}
