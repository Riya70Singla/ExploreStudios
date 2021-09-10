package com.example.explorestudios;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{
    private List<String> studioname= Arrays.asList("Delhi Studio","Delhi Studio","Delhi Studio");
    private List<String> type= Arrays.asList("Video Studio","Video Studio","Video Studio");
    private List<String> price= Arrays.asList("Starting from ₹1000/hr","Starting from ₹1000/hr","Starting from ₹1000/hr");
    private List<Integer> image= Arrays.asList(R.drawable.studio,R.drawable.studio,R.drawable.studio);
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.studio,parent,false));
    }



    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
      holder.studio_type.setText(type.get(position));
      holder.studio_price.setText(price.get(position));
      holder.studio_name.setText(studioname.get(position));
      holder.studio_image.setImageResource(image.get(position));
    }

    @Override
    public int getItemCount() {
        return studioname.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView studio_image;
        TextView studio_name,studio_type,studio_price;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            studio_image=itemView.findViewById(R.id.images);
            studio_name=itemView.findViewById(R.id.studio);
            studio_price=itemView.findViewById(R.id.price);
            studio_type=itemView.findViewById(R.id.videostudio);
        }
    }

}
