package com.example.harsh.currencyconverterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText et, et1, et2, et3, et4, et5, et6, et7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = (EditText) findViewById(R.id.editText);
        et1 = (EditText) findViewById(R.id.editText1);
        et2 = (EditText) findViewById(R.id.editText2);
        et3 = (EditText) findViewById(R.id.editText3);
        et4 = (EditText) findViewById(R.id.editText4);
        et5 = (EditText) findViewById(R.id.editText5);
        et6 = (EditText) findViewById(R.id.editText6);
        et7 = (EditText) findViewById(R.id.editText7);
    }





        public void click (View v) {
            try {
                double rupee, dollar, M, Rs, J, H, S, B;
                B = Double.parseDouble(et.getText().toString());
                rupee = (Double) B * 170.895;
                dollar = (Double) B * 2.6595;
                M = (Double) B * 10.4095;
                Rs = (Double) B * 152.6186;
                H = (Double) B * 666.9613;
                J = (Double) B * 289.5963;
                S = (Double) B * 2.4839;
                et1.setText(rupee + "");
                et2.setText(dollar + "");
                et3.setText(M + "");
                et4.setText(Rs + "");
                et5.setText(H + "");
                et6.setText(J + "");
                et7.setText(S + "");

            } catch(Exception e) {
                Toast.makeText(MainActivity.this, "Please enter valid input", 1000).show();
            }
        }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.file, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();


        if (id == R.id.action_delete) {
            et.setText("");
            et1.setText("");
            et2.setText("");
            et3.setText("");
            et4.setText("");
            et5.setText("");
            et6.setText("");
            et7.setText("");

            return true;
        }
        return super.onOptionsItemSelected(item);

    }
}









