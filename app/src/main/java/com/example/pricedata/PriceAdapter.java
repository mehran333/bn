package com.example.pricedata;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PriceAdapter extends RecyclerView.Adapter<PriceAdapter.PriceViewHolder> {
    @NonNull
    @Override
    public PriceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
return new PriceViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_save,parent,false));


    }

    @Override
    public void onBindViewHolder(@NonNull PriceViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 2;
    }

    public class PriceViewHolder extends RecyclerView.ViewHolder {
        public TextView myhogog_asli;
        public ImageView deldet;

        public PriceViewHolder(@NonNull View itemView) {
            super(itemView);
            myhogog_asli = itemView.findViewById(R.id.hogog_asli);
            deldet = itemView.findViewById(R.id.delet);
        }

        public void onbind(String hogog_asli) {
        }
    }
      public interface Item{
          void onItem(String fullname);
      }
  }



