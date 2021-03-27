package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView valueOfcentimetre, valueOffoot, valueOfinch, valueOffahrenheit, valueOfKelvin, valueOfgram, valueOfOunce, valueOfpound;
    ImageButton imageButton, imageButton1, imageButton2,selectedbtn;
    DecimalFormat dFormat;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valueOfcentimetre = findViewById(R.id.display1);
        valueOffoot = findViewById(R.id.display2);
        valueOfinch = findViewById(R.id.display3);
        valueOffahrenheit = this.<TextView>findViewById(R.id.display1);
        valueOfKelvin = this.<TextView>findViewById(R.id.display2);
        valueOfgram = this.<TextView>findViewById(R.id.display1);
        valueOfOunce = this.<TextView>findViewById(R.id.display2);
        valueOfpound = this.<TextView>findViewById(R.id.display3);
        editText = findViewById(R.id.editText);
        imageButton = findViewById(R.id.imageButton);
        imageButton1 = findViewById(R.id.imageButton1);
        imageButton2 = findViewById(R.id.imageButton2);
        dFormat = new DecimalFormat("0.00");

        String [] types= {"metre","temperature","kilogram"};

        spinner = findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,  android.R.layout.simple_spinner_item,types);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (spinner.getSelectedItemPosition()) {
                    case 0:
                        String valueEntered = editText.getText().toString();
                        double metre = Double.parseDouble(valueEntered);
                        double foot = metre * 3.28;
                        double inch = metre * 39.37;
                        double centimetre = metre * 100;

                        valueOfcentimetre.setText(" " + dFormat.format(centimetre) + " Centimetre ");
                        valueOffoot.setText(" " + dFormat.format(foot) + " foot");
                        valueOfinch.setText(" " + dFormat.format(inch) + " inch");
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this, "Please select the correct conversion icon.", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this, "Please select the correct conversion icon.", Toast.LENGTH_SHORT).show();
                        break;
                }


            }
        });
        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (spinner.getSelectedItemPosition()) {
                    case 0:
                        Toast.makeText(MainActivity.this, "Please select the correct conversion icon.", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        String valueEntered = editText.getText().toString();
                        double celsius = Double.parseDouble(valueEntered);
                        double fahrenheit = celsius * 32;
                        double kelvin = celsius * 273.15;


                        valueOffahrenheit.setText(" " + dFormat.format(fahrenheit) + " fahrenheit ");
                        valueOfKelvin.setText(" " + dFormat.format(kelvin) + " kelvin");
                        valueOfpound.setText("");
                        valueOfinch.setText("");
                        break;


                    case 2:
                        Toast.makeText(MainActivity.this, "Please select the correct conversion icon.", Toast.LENGTH_SHORT).show();

                        break;
                }
            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (spinner.getSelectedItemPosition()) {
                    case 0:
                        Toast.makeText(MainActivity.this, "Please select the correct conversion icon.", Toast.LENGTH_SHORT).show();
                        break;

                    case 1:
                        Toast.makeText(MainActivity.this, "Please select the correct conversion icon.", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        String valueEntered = editText.getText().toString();
                        double kg = Double.parseDouble(valueEntered);
                        double gram = kg * 1000;
                        double Ounce = kg * 35.27;
                        double Pound = kg * 2.20;


                        valueOfgram.setText(" " + dFormat.format(gram) + " Gram");
                        valueOfOunce.setText(" " + dFormat.format(Ounce) + " Ounce(Oz)");
                        valueOfpound.setText(" " + dFormat.format(Pound) + " Pound(lb)");
                        break;
                }
            }
        });


    }

//    private void ConvertFrommetre() {
//        String valueEntered = editText.getText().toString();
//        double metre = Double.parseDouble(valueEntered);
//        double foot = metre * 3.28;
//        double inch = metre * 39.37;
//        double centimetre = metre * 100;
//
//        valueOfcentimetre.setText(" " + dFormat.format(centimetre) + " Centimetre ");
//        valueOffoot.setText(" " + dFormat.format(foot) + " foot");
//        valueOfinch.setText(" " + dFormat.format(inch) + " inch");
//    }
//
//    private void ConvertFromcelsius() {
//        String valueEntered = editText.getText().toString();
//        double celsius = Double.parseDouble(valueEntered);
//        double fahrenheit = celsius * 32;
//        double kelvin = celsius * 273.15;
//
//
//        valueOffahrenheit.setText(" " + dFormat.format(fahrenheit) + " fahrenheit ");
//        valueOfKelvin.setText(" " + dFormat.format(kelvin) + " kelvin");
//        valueOfpound.setText("");
//        valueOfinch.setText("");
//
//    }
//
//
//    private void ConvertFromkg() {
//        String valueEntered = editText.getText().toString();
//        double kg = Double.parseDouble(valueEntered);
//        double gram = kg * 1000;
//        double Ounce = kg * 35.27;
//        double Pound = kg * 2.20;
//
//
//        valueOfgram.setText(" " + dFormat.format(gram) + " Gram");
//        valueOfOunce.setText(" " + dFormat.format(Ounce) + " Ounce(Oz)");
//        valueOfpound.setText(" " + dFormat.format(Pound) + " Pound(lb)");
//    }


}