package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class recyclerAdapter extends RecyclerView.Adapter<recyclerAdapter.MyViewHolder> {
        private ArrayList<Description> usersList;

        public recyclerAdapter(ArrayList<Description> usersList){
            this.usersList = usersList;
        }

public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView number;
        private TextView title;
        private TextView secondTitle;
        private TextView data;

        public MyViewHolder(final View view){
             super(view);
             number = view.findViewById(R.id.number);
             title = view.findViewById(R.id.main_text);
             secondTitle = view.findViewById(R.id.second_text);
             data = view.findViewById(R.id.data);
        }
}

    @NonNull
    @Override
    public recyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
          View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design,parent,false);
          return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull recyclerAdapter.MyViewHolder holder, int position) {
            String number = usersList.get(position).getNumber();
            holder.number.setText(number);
            String title = usersList.get(position).getTitle();
            holder.title.setText(title);
            String secondTitle = usersList.get(position).getSecondTitle();
            holder.secondTitle.setText(secondTitle);
            String data = usersList.get(position).getData();
            holder.data.setText(data);

    }

    @Override
    public int getItemCount() {
        return usersList.size();
    }
}
