package com.example.receptapp;

import android.app.LauncherActivity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class RecepieListAdapter extends RecyclerView.Adapter {

    public interface RecepieListListener{
        void onRecepieClick(CharSequence input);
    }

    private static List<Recept> recepieList;
    public static class RecepieViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView textView;
        public TextView textView2;
        public ImageView imageView;
        public ImageView favoriteButton;
       // public Button favoriteButton

        public RecepieViewHolder(@NonNull View itemView) {

            super(itemView);

            itemView.setOnClickListener(this);

            textView = itemView.findViewById(R.id.recepieSquareTitle);
            textView2 = itemView.findViewById(R.id.recepieSquareDesc);
            imageView = itemView.findViewById(R.id.recepieSquareImage);
            favoriteButton = itemView.findViewById(R.id.favoriteButtonID);
            //Button = itemView.findViewById((R.id.favoriteButton));

        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();

            Recept recepieItem = recepieList.get(position);


           // Toast.makeText(context , recepieItem.getTitle(), Toast.LENGTH_LONG).show();
            Log.d("Test", recepieItem.getTitle());



            favoriteButton.setImageResource(R.drawable.ic_favorite_color_24dp);


        }

    }

    public RecepieListAdapter(List<Recept> recepieList) {
        this.recepieList = recepieList;

    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = (View) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recepie_square, viewGroup, false);

        RecepieViewHolder recepieViewHolder = new RecepieViewHolder(view);
        return recepieViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        RecepieViewHolder vh = (RecepieViewHolder) viewHolder;
        vh.textView.setText(recepieList.get(i).getTitle());
        vh.textView2.setText(recepieList.get(i).getDescription());
        vh.imageView.setImageResource(recepieList.get(i).getImage());
        vh.favoriteButton.setImageResource(recepieList.get(i).getFavoriteImage());
        //vh.favoriteButton.setBackground(R.drawable.ic_favorite_border_black_24dp);



    }

    @Override
    public int getItemCount() {
        return recepieList.size();
    }
}
