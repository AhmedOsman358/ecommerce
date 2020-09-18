package com.example.finalproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {
    private List<ProductModel>productsList;
    private Context context;

    public ProductAdapter(List<ProductModel> productsList, Context context) {
        this.productsList = productsList;
        this.context = context;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.product_rv_item,parent,false);

        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {


        ProductModel productModel=productsList.get(position);
        holder.productTitleTv.setText(productModel.getTitle());
        holder.productDetailsTv.setText(productModel.getDetails());
        holder.productPriceTv.setText(productModel.getPrice());



    }

    @Override
    public int getItemCount() {
        return productsList.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {

        ImageView productIv;
        TextView productTitleTv;
        TextView productDetailsTv;
        TextView productPriceTv;
        ImageButton addProductIb;
        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            productIv = itemView.findViewById(R.id.product_iv);
           productDetailsTv = itemView.findViewById(R.id.product_detail_tv);
           productTitleTv = itemView.findViewById(R.id.product_title_tv);
            productPriceTv = itemView.findViewById(R.id.price_tv);
            addProductIb = itemView.findViewById(R.id.add_product_ib);

        }
    }

}
