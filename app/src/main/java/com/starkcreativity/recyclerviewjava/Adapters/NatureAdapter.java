package com.starkcreativity.recyclerviewjava.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.starkcreativity.recyclerviewjava.Models.NatureModel;
import com.starkcreativity.recyclerviewjava.R;

import java.util.ArrayList;

// step 2 extends
public class NatureAdapter extends RecyclerView.Adapter<NatureAdapter.viewHolder>{

    // step 4
    ArrayList<NatureModel> list;
    Context context;


    // step 5 create constructor
    public NatureAdapter(ArrayList<NatureModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    // step 3 implement unimplemented methods
    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {  // step 7
        View view = LayoutInflater.from(context).inflate(R.layout.sample_recyclerview, parent, false); // we can use null instead of parent and false but that will create error of size of image
        return new viewHolder(view);   // step 8
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) { // step 9
        NatureModel model = list.get(position);
        holder.imageView.setImageResource(model.getPic());
        holder.textView.setText(model.getText());



        // from here adding on click functionality
        // for all pictures
//        switch (position){
//            case 0:
//                holder.imageView.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        Toast.makeText(context, "Image one is clicked", Toast.LENGTH_SHORT).show();
//                    }
//                });
//                holder.textView.setOnClickListener(view -> {
//                    Toast.makeText(context, "Add your own feature", Toast.LENGTH_SHORT).show();
//                });
//                break;
//            case 1:
//                holder.imageView.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        Toast.makeText(context, "Image two is clicked", Toast.LENGTH_SHORT).show();
//                    }
//                });
//                holder.textView.setOnClickListener(view -> {
//                    Toast.makeText(context, "Add your own feature 2", Toast.LENGTH_SHORT).show();
//                });
//                break;
//            case 2:
//                holder.imageView.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        Toast.makeText(context, "Image third is clicked", Toast.LENGTH_SHORT).show();
//                    }
//                });
//                holder.textView.setOnClickListener(view -> {
//                    Toast.makeText(context, "Add your own feature", Toast.LENGTH_SHORT).show();
//                });
//                break;
//            case 3:
//                holder.imageView.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        Toast.makeText(context, "Image forth is clicked", Toast.LENGTH_SHORT).show();
//                    }
//                });
//                holder.textView.setOnClickListener(view -> {
//                    Toast.makeText(context, "Add your own feature", Toast.LENGTH_SHORT).show();
//                });
//                break;
//            default:
//        }


    }

    @Override
    public int getItemCount() {
        return list.size();     // list size step 6
    }


    //step 1
    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
            imageView = itemView.findViewById(R.id.imageView);

        }
    }
}
