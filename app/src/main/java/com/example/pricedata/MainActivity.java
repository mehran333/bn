package com.example.pricedata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText mizan_kar,mizan_hogog;
    TextView resu;
    ImageView img_zarb,imz_mosavi;
    ImageView add;
    int res;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mizan_kar=findViewById(R.id.mizan_kar);
        mizan_hogog=findViewById(R.id.mizin_hogog);
        img_zarb=findViewById(R.id.img_zarb);
        imz_mosavi=findViewById(R.id.img_mosavi);
        resu=findViewById(R.id.hogog_kol);
        add=findViewById(R.id.img_mosavi);
        recyclerView=findViewById(R.id.rv_main);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
        recyclerView.setAdapter(new PriceAdapter());

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mynum1 = mizan_kar.getText().toString();
                String mynum2 = mizan_hogog.getText().toString();
                res = Integer.parseInt(mynum1) * Integer.parseInt(mynum2);
            }
        });
    }
}