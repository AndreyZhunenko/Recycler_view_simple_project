package com.example.my_recyclerview_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class JustDoItAdapter extends RecyclerView.Adapter<JustDoItAdapter.JustDoItViewHolder> {
    private  static int viewHolderCount;
    private int numberItems;
    public JustDoItAdapter(int numberItems){
        this.numberItems = numberItems;
        viewHolderCount = 0;
    }
    @Override
    public JustDoItViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.item_of_recyclerview;

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(layoutIdForListItem, parent, false);
        JustDoItViewHolder myViewHolder = new JustDoItViewHolder(view);
        myViewHolder.ViewHolderIndex.setText("Элемент списка Recycler " + viewHolderCount);
        viewHolderCount++;

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder( JustDoItViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return numberItems;
    }

    class JustDoItViewHolder extends RecyclerView.ViewHolder{
        //TextView BodyItemList;
        TextView ViewHolderIndex;

        public JustDoItViewHolder(View itemView) {
            super(itemView);

           // BodyItemList = itemView.findViewById(R.id.BodyItemOfList_id);
            ViewHolderIndex = itemView.findViewById(R.id.tv_view_holder_number);
        }
        void bind(int listIndex){
           // BodyItemList.setText(String.valueOf(listIndex));
        }
    }
}
