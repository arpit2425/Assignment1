package com.assignment.arpit.assignment;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MyAdaptor extends RecyclerView.Adapter<MyAdaptor.ViewHolder> {
    List<listItem> listItems;
    Context context;

    public MyAdaptor(List<listItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @NonNull
    @Override


    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v=LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.card,viewGroup,false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
listItem listItem=listItems.get(i);
viewHolder.name.setText(listItem.getName());
viewHolder.age.setText(Integer.toString(listItem.getAge()));
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name,age;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name);
            age=itemView.findViewById(R.id.age);

        }
    }
}
