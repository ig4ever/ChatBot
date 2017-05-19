package com.example.ig4ever.chatbot.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ig4ever.chatbot.R;
import com.example.ig4ever.chatbot.model.DataSms;

import java.util.List;

/**
 * Created by ig4ever on 5/3/2017.
 */

public class AdapterViewPager extends RecyclerView.Adapter<AdapterViewPager.ViewHolder> {

    List<Integer> listViewType;
    List<DataSms> listDataSms;

    public AdapterViewPager(List<Integer> listViewType, List<DataSms> listDataSms) {
        this.listViewType = listViewType;
        this.listDataSms = listDataSms;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_fragment, null);
        return new ItemViewPager(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        int viewType = listViewType.get(position);
        DataSms dataSms = listDataSms.get(position);
        ItemViewPager itemViewPager = (ItemViewPager) holder;
        itemViewPager.textViewPesan.setText(dataSms.getPesan());
        itemViewPager.textViewWaktuPesan.setText(dataSms.getWaktu());
    }

    @Override
    public int getItemCount() {
        return listViewType.size();
    }

    @Override
    public int getItemViewType(int position) {
        return listViewType.get(position);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }

    public class ItemViewPager extends ViewHolder {

        private TextView textViewPesan;
        private TextView textViewWaktuPesan;

        public ItemViewPager(View itemView) {
            super(itemView);
            textViewPesan = (TextView) itemView.findViewById(R.id.contentCard);
            textViewWaktuPesan = (TextView) itemView.findViewById(R.id.timeCard);
        }
    }
}
