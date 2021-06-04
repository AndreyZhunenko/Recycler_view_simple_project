package com.example.my_recyclerview_app;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class CreateValueOfElementOfListGoods extends RecyclerView.ViewHolder {
    ImageView ImageProduct;
    TextView NameProduct;
    TextView PriceProduct;

    ImageView ImageProduct2;
    TextView NameProduct2;
    TextView PriceProduct2;

    public CreateValueOfElementOfListGoods(View itemView){
        super(itemView);

        ImageProduct = itemView.findViewById(R.id.ImageProduct_id);
        NameProduct = itemView.findViewById(R.id.NameProduct_id);
        PriceProduct = itemView.findViewById(R.id.PriceProduct_id);

        ImageProduct2 = itemView.findViewById(R.id.ImageProduct2_id);
        NameProduct2 = itemView.findViewById(R.id.NameProduct2_id);
        PriceProduct2 = itemView.findViewById(R.id.PriceProduct2_id);
    }


    public void WriteValues_into_product1(Product_structure my_product1){
        ImageProduct.setImageResource(R.drawable.image_product1);
        NameProduct.setText(my_product1.productName);
        PriceProduct.setText(String.valueOf(my_product1.productPrice));

    }
    public void WriteValues_into_product2(Product_structure my_product2){
        ImageProduct2.setImageResource(R.drawable.image_product2);
        NameProduct2.setText(my_product2.productName);
        PriceProduct2.setText(String.valueOf(my_product2.productPrice));
    }



}
