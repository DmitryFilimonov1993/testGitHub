package com.example.myapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.PersonViewHolder> {

    List<Person> personList;


    public MyAdapter(List<Person> personList) {
        this.personList = personList;
    }


    public static class PersonViewHolder extends RecyclerView.ViewHolder {

        AppCompatTextView name;
        AppCompatTextView age;
        AppCompatImageView photo;

        public PersonViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            age = itemView.findViewById(R.id.age);
            photo = itemView.findViewById(R.id.photo);
        }
    }

    @Override
    public int getItemCount() {
        return personList.size();
    }

    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_view, parent, false);
        PersonViewHolder personViewHolder = new PersonViewHolder(view);
        return personViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {
        holder.name.setText(personList.get(position).getName());
        holder.age.setText(personList.get(position).getAge());
        holder.photo.setImageResource(personList.get(position).getPhotoId());
    }



    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }


}
