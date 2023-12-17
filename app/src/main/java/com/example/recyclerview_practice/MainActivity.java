package com.example.recyclerview_practice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerview_practice.Adapters.MyAdapter;
import com.example.recyclerview_practice.Model.Modelclass;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rec;
    MyAdapter adp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rec=findViewById(R.id.recycleView);

        rec.setLayoutManager(new LinearLayoutManager(this));
//        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this,2);
//        rec.setLayoutManager(gridLayoutManager);
        adp= new MyAdapter(data(),getApplicationContext());
        rec.setAdapter(adp);
        

    }
//this function is for show data
    private ArrayList<Modelclass> data() {

        ArrayList<Modelclass> list = new ArrayList<>();

        Modelclass m1=new Modelclass();

        m1.setHeader("T-Shirt");
        m1.setRec("Plain T-Shirt For Men's");
        m1.setSec("Price");
        m1.setImg(R.drawable.tshirt);
        list.add(m1);

        Modelclass m2=new Modelclass();

        m2.setHeader("Shirt");
        m2.setRec("Plain Shirt For Men's");
        m2.setSec("Price");
        m2.setImg(R.drawable.shirt);
        list.add(m2);

        Modelclass m3=new Modelclass();

        m3.setHeader("Jeans");
        m3.setRec("Denim Jeans For Men's");
        m3.setSec("Price");
        m3.setImg(R.drawable.jeans);
        list.add(m3);


        Modelclass m4=new Modelclass();

        m4.setHeader("Jackets");
        m4.setRec("Adidas Jackets For Men's");
        m4.setSec("Price");
        m4.setImg(R.drawable.jackets);
        list.add(m4);


        Modelclass m5=new Modelclass();

        m5.setHeader("Blazers");
        m5.setRec("Blazers For Men's");
        m5.setSec("Price");
        m5.setImg(R.drawable.blazers);
        list.add(m5);


        Modelclass m6=new Modelclass();

        m6.setHeader("Trousers");
        m6.setRec("Peter England Trousers For Men's");
        m6.setSec("Price");
        m6.setImg(R.drawable.trousers);
        list.add(m6);


        Modelclass m7=new Modelclass();

        m7.setHeader("Sherwani");
        m7.setRec("Blend Sherwani Set");
        m7.setSec("Price");
        m7.setImg(R.drawable.sherwani);
        list.add(m7);


        Modelclass m8=new Modelclass();

        m8.setHeader("Suits");
        m8.setRec("Suits For Men's");
        m8.setSec("Price");
        m8.setImg(R.drawable.suits);
        list.add(m8);


        Modelclass m9=new Modelclass();

        m9.setHeader("Kurta");
        m9.setRec("Cotton Kurta For Men's");
        m9.setSec("Price");
        m9.setImg(R.drawable.kurta);
        list.add(m9);


        Modelclass m10=new Modelclass();

        m10.setHeader("Chinos");
        m10.setRec("Formal Chinos For Men's");
        m10.setSec("Price");
        m10.setImg(R.drawable.chinos);
        list.add(m10);


        return list;


    }
}