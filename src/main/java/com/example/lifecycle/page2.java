package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import  android.view.View;
import android.widget.Toast;
import  android.widget.TextView;


public class page2 extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        text=(TextView)findViewById(R.id.View);
    Intent saa= getIntent();
    String str =saa.getStringExtra("message");
    text.setText(str);

     /*  public void onbtn(View view) {
            Intent saa =new Intent(this,Page3.class);
            startActivity(saa);
        }*/
}
}
