package com.example.userinterface;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

import static com.example.userinterface.R.id.*;

public class MainActivity extends AppCompatActivity {

    @Bindview(TBtv)
    public TextView ToggleTV;
    @BindView(SPtv)
    TextView SpinnerTV;
    @BindView(CBtv)
    TextView CheckBoxTV;
    @BindView(TPtv)
    TextView TimePickerTV;
    @BindView(DPtv)
    TextView DataPickerTV;
    @BindView(R.id.spinner)
    Spinner spinner;
    @BindView(R.id.checkBox)
    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.CreateFromResource(this,R.array.example_array android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource((android.R.layout.simple_spinner_dropdown_item));
        spinner.setAdapter(adapter);

    }
    @onCheckedChanged(toggleButton)
    public void onCheckedChanged(boolean isChecked){
     if(isChecked){
         ToggleTV.setText(R.string.the_button_is_on);
              }else{
         ToggleTV.setText(R.string.the_button_is_off);
     }
    }
    @onItemSelected(R.id.spinner)
    public void onItemSelected(int possition){
            spinner.setText(getString(R.string.item_selected,spinner.getItemIdAtPosition(possition)));
        }
    @onClick({button, button2, R.id.checkBox})
    public void onClick(View View){
        switch (view.getId()){
            case  button:
                showTimePicker();
                break;
            case  button2:
                showTimePicker();
                break;
            case R.id.checkBox:
                showTimePicker();
                break;
        }
    }
    private void checkCheckBox(){
        if (checkBox.isChecked())
            checkBoxTV.set.Text(R.String.checkbox_unbchecked);
    }
    private void showDatePicker() {
        Calender mcurrebntDate = Calendar.getInstance();
        int year = mcurrebntDate.get(Calendar.YEAR);
        int month = mcurrebntDate.get(Calendar.MONTH);
        int day = mcurrebntDate.get(Calendar.DAY_OF_MONTH);
        DatePickerDialog mDatePicker = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                String d, m, y;
                if (day < 9)
                    d = "0" + day;
                else
                    d = "" + day;
                if (month < 9)
                    m = "0" + month;
                else
                    m = "" + month;

                y = "" + year;
                DatePickerTV.setText(getString(R.string.selected_day, d, m, y));
            }
        }, year, month, day);
        mDatePicker.setTitle("select Date");
        mDatePicker.show();
    }
    private void showTimePicker(){
        Calendar mcurrentTime = Calendar.getInstance();
        int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
        int minute = mcurrentTime.get(Calendar.MINUTE);
        TimePickerDialog timePicker;
        mTimepicker =  new TimePickerDialog(MainActivity.this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinutes) {
                String h = selectedHour + "";
                String m = selectedMinutes + "";
                if ((h.length() == 1)) {
                    h = "0" + h;
                }
                if ((m.length() == 1)) {
                    m = "0" + m;
                }
                TimePickerTV.setText(getString(R.string.selected_time, h, m));
            }
        }, hour,minute, true);
        ActionBar mTimePicker = null;
        mTimePicker.setTitle("Select Time");
        mTimePicker.show();
        }


    }

