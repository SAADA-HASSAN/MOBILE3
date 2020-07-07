package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.Menu;
import android.view.MenuItem;






public class MainActivity extends AppCompatActivity {
    EditText edit;
    Button but;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit=(EditText)findViewById(R.id.edit1);
        but=(Button)findViewById(R.id.button);
    }


    public void onbtn(View view) {
        String str = edit.getText().toString();
            Intent saada =new Intent(this,page2.class);
         saada.putExtra("message", str);
        startActivity(saada);
        }
        @Override
        public void onStart() {
            super.onStart();
            Toast.makeText(getApplicationContext(), "thanks 4 ur opiion  onstart",Toast.LENGTH_LONG).show();
        }
        @Override
        protected void onResume() {
            super.onResume();
            Toast.makeText(getApplicationContext(),"thanks on resume",Toast.LENGTH_LONG).show();
        }
        @Override
        protected void onPause() {
            super.onPause();
            Toast.makeText(getApplicationContext(),"wait little..on pause  ",Toast.LENGTH_LONG).show();
        }
        @Override
        protected void onStop() {
            super.onStop();
            Toast.makeText(getApplicationContext(),"it is stopped  ..on stop   ",Toast.LENGTH_LONG).show();
        }

    protected void ondestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"it is kiled  ..on destroy   ",Toast.LENGTH_LONG).show();
    }



}