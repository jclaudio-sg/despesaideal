package br.ideal.appdespesaideal.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import br.ideal.appdespesaideal.R;
import br.ideal.appdespesaideal.model.ResumoGeralItem;

/**
 *      Criado por Claudio Gonçalves em 07/01/2018.
 */

public class ResumoGeralAdapter extends RecyclerView.Adapter<ResumoGeralAdapter.ResumoGeralHolder> {

    private List<ResumoGeralItem> lista;
    private IRecyclerViewAction iRecyclerViewAction;

    public ResumoGeralAdapter(List<ResumoGeralItem> lista, IRecyclerViewAction iRecyclerViewAction) {
        this.lista = lista;
        this.iRecyclerViewAction = iRecyclerViewAction;
    }

    @Override
    public ResumoGeralHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( parent.getContext() ).inflate(R.layout.item_resumo_geral, parent, false);
        return new ResumoGeralHolder(view);
    }

    @Override
    public void onBindViewHolder(ResumoGeralHolder holder, int position) {
        ResumoGeralItem item = lista.get( position );
        holder.textViewResumoGeralMes.setText( item.getMes() );
        holder.getTextViewResumoGeralValor.setText( item.getValor() );
    }

    @Override
    public int getItemCount() {
        return lista == null ? 0 : lista.size();
    }

    public class ResumoGeralHolder extends RecyclerView.ViewHolder {

        public TextView textViewResumoGeralMes;
        public TextView getTextViewResumoGeralValor;

        public ResumoGeralHolder(View itemView) {
            super(itemView);
            this.textViewResumoGeralMes = (TextView) itemView.findViewById(R.id.textview_resumo_geral_mes);
            this.getTextViewResumoGeralValor = (TextView) itemView.findViewById(R.id.textview_resumo_geral_valor);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ResumoGeralItem item = lista.get( getAdapterPosition() );
                    iRecyclerViewAction.onClickListener( item );
                }
            });
        }
    }
}
