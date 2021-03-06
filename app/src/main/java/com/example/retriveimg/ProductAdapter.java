package com.example.retriveimg;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {
    private Context mCtx;
    private List<Product> productList;
    public ProductAdapter(Context mCtx, List<Product> productList) {
        this.mCtx = mCtx;
        this.productList = productList;
    }


    @NonNull
    @Override
    public ProductAdapter.ProductViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.product_list, null);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductAdapter.ProductViewHolder productViewHolder, int i) {

        Product product = productList.get(i);

        //loding image
        Glide.with(mCtx).asBitmap()
                .load(product.getImageurl())

                .into(productViewHolder.imageView);

        productViewHolder.textViewTitle.setText(product.getTitle());
        productViewHolder.textViewShortDesc.setText(product.getDescription());



    }

    @Override
    public int getItemCount() {
        return productList.size();

    }

    class ProductViewHolder extends RecyclerView.ViewHolder
    {
        TextView textViewTitle, textViewShortDesc;
        ImageView imageView;
        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewShortDesc = itemView.findViewById(R.id.textViewShortDesc);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}
