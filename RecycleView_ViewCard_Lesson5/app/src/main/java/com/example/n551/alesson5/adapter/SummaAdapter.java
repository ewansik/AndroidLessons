package com.example.n551.alesson5.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.n551.alesson5.R;
import com.example.n551.alesson5.model.Summa;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by N551 on 18.11.2015.
 */
public class SummaAdapter extends RecyclerView.Adapter<SummaAdapter.SummaHolder> {

    private List<Summa> mList;
    private ItemOnClickListener itemOnClickListener;

    public void setItemOnClickListener(ItemOnClickListener itemOnClickListener) {
        this.itemOnClickListener = itemOnClickListener;
    }

    public  SummaAdapter(List<Summa> list)
    {
        mList = list;
    }

    public void addItems(List<Summa> list)
    {
        mList = list;
        notifyDataSetChanged();
    }

    @Override
    public SummaHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_list_view, parent, false);
        SummaHolder summaHolder = new SummaHolder(view);

        return summaHolder;
    }

    @Override
    public void onBindViewHolder(SummaHolder holder, int position) {
        final Summa summa = mList.get(position);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

        holder.summa.setText(String.valueOf(summa.getSumma()));
        holder.date.setText(simpleDateFormat.format(summa.getDate()).toString());
        holder.name.setText(String.valueOf(summa.getName()));

        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemOnClickListener.onClick(summa);
            }
        });

    }


    @Override
    public int getItemCount() {
        return mList == null ? 0 : mList.size();
    }

    public static class SummaHolder extends RecyclerView.ViewHolder
    {
        public TextView summa;
        public TextView date;
        public TextView name;
        public View view;

        public SummaHolder(View itemView) {
            super(itemView);

            view = itemView;
            summa = (TextView)itemView.findViewById(R.id.myText1);
            date = (TextView) itemView.findViewById(R.id.myText2);
            name = (TextView)itemView.findViewById(R.id.myText3);
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }

    public interface ItemOnClickListener{
        void onClick(Summa summa);
    }
}
