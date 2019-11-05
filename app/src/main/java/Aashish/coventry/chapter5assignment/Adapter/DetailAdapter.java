package Aashish.coventry.chapter5assignment.Adapter;

import android.content.Context;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import Aashish.coventry.chapter5assignment.Model.Details;


public class DetailAdapter extends RecyclerView.Adapter<DetailAdapter.DetailViewHolder> {

    Context context;
    List<Details> detailList;

    public DetailAdapter(Context context, List<Details> detailList) {
        this.context = context;
        this.detailList = detailList;
    }
}
