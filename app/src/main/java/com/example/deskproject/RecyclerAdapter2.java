package com.example.deskproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter2 extends RecyclerView.Adapter<RecyclerAdapter2.ViewHolder> {

    ArrayList<ModeClass2> list2;
    Context context;


    public RecyclerAdapter2(ArrayList<ModeClass2> list2, Context context) {
        this.context = context;
        this.list2 = list2;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.down,parent,false);

        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.thumbNail_image.setImageResource(list2.get(position).getThumbNail_image());
        holder.channel_name.setText(list2.get(position).getChannel_name());
        holder.title_text.setText(list2.get(position).getTitle_text());

    }

    @Override
    public int getItemCount() {
        return list2.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView thumbNail_image;
        TextView title_text,channel_name;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            thumbNail_image = itemView.findViewById(R.id.thumbNail_image);
            title_text = itemView.findViewById(R.id.title_text);
            channel_name = itemView.findViewById(R.id.channel_name);

        }
    }
}
