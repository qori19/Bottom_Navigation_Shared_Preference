package com.example.bottom_navigation_shared_preference;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MarvelAdapter extends RecyclerView.Adapter<MarvelAdapter.ViewHolder> {
    Context context;
    List<MarvelModel> marvelModels = new ArrayList<>();

    public MarvelAdapter(Context context, List<MarvelModel> marvelModels) {
        this.context = context;
        this.marvelModels = marvelModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_rcv, viewGroup, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        viewHolder.tvName.setText(marvelModels.get(i).getName());
        viewHolder.imageView.setImageResource(marvelModels.get(i).getGambar());
        viewHolder.overview.setText(marvelModels.get(i).getOverview());
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // ketika recycler di click
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailMarvelActivity.class);
                intent.putExtra("name", marvelModels.get(i).getName());
                intent.putExtra("gambar", marvelModels.get(i).getGambar());
                intent.putExtra("overview", marvelModels.get(i).getOverview());
                context.startActivity(intent);
                Toast.makeText(context, marvelModels.get(i).getName(), Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    public int getItemCount() {
        return marvelModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        ImageView imageView;
        TextView overview;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_name);
            imageView = itemView.findViewById(R.id.iv_marvel);
            overview = itemView.findViewById(R.id.tv_overview);
        }

    }
}

