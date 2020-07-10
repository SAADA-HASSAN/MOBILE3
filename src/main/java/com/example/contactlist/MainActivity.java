package com.example.contactlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private EditText nmed1;
    private EditText nmed2;
    private EditText em;
    private EditText phn;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nmed1 = findViewById(R.id.name1);
        nmed2 = findViewById(R.id.name2);
        em = findViewById(R.id.email1);
        phn = findViewById(R.id.phone1);
        btn = findViewById(R.id.button4);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = nmed1.getText().toString();
                String laname = nmed2.getText().toString();
                String email = em.getText().toString();
                String phone = phn.getText().toString();

              /*  Integer PhoneInt = parsePhone(phone, phone);
                Object phoneInt = null;
                if(phoneInt != null) {
                    createNewContct(name, laname, email, phoneInt);*/
                }

        });
    }



    public void creteNewContact(String name, String Lname, String email, Integer phone, String  laname){
    Contact contact = new Contact(name, laname, email,phone);
    Log.d(TAG, "New contact created:" + contact.toString);
        clearEditText();
            Intent sada  = new Intent(this,Detail.class);
            sada.putExtra("name", name);
            sada.putExtra("laname", laname);
            sada.putExtra("email", email);
            sada.putExtra("phone", phone);
            startActivity(sada);
        }

            private void clearEditText() {
                nmed1.setText(" ");
                nmed2.setText(" ");
                em.setText(" ");
                phn.setText(" ");
            }
                public static Integer
                parsePhone(String Phone, String phone){
                    try {
                        Integer interger = null;
                        return Integer.parseInt(phone);
                    }catch (NumberFormatException e){
                        return null;

                    }
                }



            }









