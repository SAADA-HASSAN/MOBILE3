package com.example.contactlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView ctname = findViewById(R.id.cname);
        TextView stname = findViewById(R.id.lastname);
        TextView mail = findViewById(R.id.email);
        TextView ph2 = findViewById(R.id.phnno);

        Bundle b = new Bundle();
        b = getIntent().getExtras();
        String nm3 = b.getString("name");
        String nm4 = b.getString("laname");
        String em3 = b.getString("email");
        int phn3 = b.getInt("phone");

        ctname.setText(nm3);
        stname.setText(nm4);
        mail.setText(em3);
        ph2.setText(phn3+" ");

    }
}