package com.example.deskproject;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    Context context;
    ArrayList<ModeClass> list;


    public RecyclerViewAdapter(Context context, ArrayList list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.show,parent,false);

        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
          holder.details.setText(list.get(position).getDetails());
          holder.channel_name.setText(list.get(position).getChannel_name());
          holder.channelLogo.setImageResource(list.get(position).getChannelLogo());
          holder.description.setText(list.get(position).getDescription());
          holder.thumbNail.setImageResource(list.get(position).getThumbNail());

          holder.thumbNail.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  AlertDialog.Builder builder = new AlertDialog.Builder(context);

                  builder.setView(R.layout.dialog);
                  builder.setCancelable(true);
                  builder.show();

              }
          });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class ViewHolder  extends RecyclerView.ViewHolder {

        ImageView thumbNail,channelLogo;
        TextView description,channel_name,details;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            thumbNail = itemView.findViewById(R.id.thumbNail);
            channel_name = itemView.findViewById(R.id.channel_name);
            channelLogo = itemView.findViewById(R.id.chanel_img);
            description = itemView.findViewById(R.id.description);
            details = itemView.findViewById(R.id.details);

        }
    }
}
