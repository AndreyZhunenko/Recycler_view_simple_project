package com.example.my_recyclerview_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import androidx.recyclerview.widget.RecyclerView;

public class JustDoItAdapter extends RecyclerView.Adapter<CreateValueOfElementOfListGoods> {
    private  static int viewHolderCount;
    private int numberItems;
    public JustDoItAdapter(int numberItems){
        this.numberItems = numberItems;
        viewHolderCount = 0;
    }


    @Override
    public CreateValueOfElementOfListGoods onCreateViewHolder( ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.item_of_recyclerview;

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(layoutIdForListItem, parent, false);
        CreateValueOfElementOfListGoods myViewHolder = new CreateValueOfElementOfListGoods(view);
        //JustDoItViewHolder myViewHolder = new JustDoItViewHolder(view);
        Product_structure myProductOne = new Product_structure("Амулет: Клык медведя", "7000");
        myViewHolder.WriteValues_into_product1(myProductOne);

        Product_structure myProductTwo = new Product_structure("Корабль", "23500");
        myViewHolder.WriteValues_into_product2(myProductTwo);
        viewHolderCount++;

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder( CreateValueOfElementOfListGoods holder, int position) {
    }

    @Override
    public int getItemCount() {
        return numberItems;
    }


}
