package com.example.recyclerview_practice.Adapters;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview_practice.Model.Modelclass;
import com.example.recyclerview_practice.R;
import com.example.recyclerview_practice.RecyclersecondActivity;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.Myviewholder> {
    ArrayList<Modelclass> ary;
    Context context;
    public MyAdapter(ArrayList<Modelclass> demo,Context ctx){
        this.ary=demo;
        this.context = ctx;
    }


    @NonNull
    @Override
    public Myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.recyclerview,parent,false);
        return new Myviewholder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull Myviewholder holder, int position) {
    holder.txt1.setText(ary.get(position).getHeader());
    holder.txt2.setText(ary.get(position).getRec());
    holder.txt3.setText(ary.get(position).getSec());
    holder.img.setImageResource(ary.get(position).getImg());

    Modelclass data = ary.get(position);

    holder.itemView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(context, RecyclersecondActivity.class);
            intent.putExtra("imG",data.getImg());
            intent.putExtra("txT",data.getHeader());
            intent.putExtra("txTT",data.getRec());
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);

        }
    });
    }

    @Override
    public int getItemCount() {
        return ary.size();
    }

    public class Myviewholder extends RecyclerView.ViewHolder{

        ImageView img;
        TextView txt1;
        TextView txt2;
        TextView txt3;


        public Myviewholder(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.Image);
            txt1=itemView.findViewById(R.id.textView1);
            txt2=itemView.findViewById(R.id.textView2);
            txt3=itemView.findViewById(R.id.textView3);
        }
    }
}
