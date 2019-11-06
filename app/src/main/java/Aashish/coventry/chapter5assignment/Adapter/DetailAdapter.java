package Aashish.coventry.chapter5assignment.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import Aashish.coventry.chapter5assignment.Model.Details;
import Aashish.coventry.chapter5assignment.R;


public class DetailAdapter extends RecyclerView.Adapter<DetailAdapter.DetailViewHolder> {

    View.OnClickListener context;
    List<Details> detailList;

    public DetailAdapter(View.OnClickListener context, List<Details> detailListz) {
        this.context = context;
        this.detailList = detailList;
    }

    @NonNull
    @Override
    public DetailViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.detailview,parent,false);
        return new DetailViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DetailViewHolder holder, int position) {
        final Details details = detailList.get(position);
        holder.imgProfile.setImageResource(details.getImageId());
        holder.tvName.setText(details.getName());
        holder.tvAge.setText(details.getAge());
        holder.tvGender.setText(details.getGender());
    }

    @Override
    public int getItemCount() {
        return detailList.size();
    }

    public class DetailViewHolder extends RecyclerView.ViewHolder {

        ImageView imgProfile;
        TextView tvName,tvAge,tvGender;
        public DetailViewHolder(@NonNull View itemView) {
            super(itemView);
            imgProfile = itemView.findViewById(R.id.imgProfile);
            tvName = itemView.findViewById(R.id.tvName);
            tvGender = itemView.findViewById(R.id.tvGender);
            tvAge = itemView.findViewById(R.id.tvAge);
        }
    }
}
