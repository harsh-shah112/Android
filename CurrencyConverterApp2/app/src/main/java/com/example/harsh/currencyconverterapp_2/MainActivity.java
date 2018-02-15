package com.example.harsh.currencyconverterapp_2;

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
    public void click1 (View v) {
        try {
            double rupee, dollar, M, Rs, J, H, S, B;

            rupee = Double.parseDouble(et1.getText().toString());
            dollar = (Double) rupee * 0.0155;
            M = (Double) rupee * 0.0608;
            B=(Double)rupee * 0.0058;
            Rs = (Double) rupee * 0.8941;
            H = (Double) rupee * 3.9019;
            J = (Double) rupee * 1.6932;
            S = (Double) rupee * 0.0145;
            et.setText(B + "");
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
    public void click2 (View v) {
        try {
            double rupee, dollar, M, Rs, J, H, S, B;

            dollar = Double.parseDouble(et2.getText().toString());
            rupee = (Double) dollar * 64.2903;
            M = (Double) dollar * 3.9126;
            B=(Double)dollar * 0.376;
            Rs = (Double) dollar * 57.4481;
            H = (Double) dollar * 250.8708;
            J = (Double) dollar * 108.9071;
            S = (Double) dollar * 0.9339;
            et.setText(B + "");
            et1.setText(rupee + "");
            et3.setText(M + "");
            et4.setText(Rs + "");
            et5.setText(H + "");
            et6.setText(J + "");
            et7.setText(S + "");

        } catch(Exception e) {
            Toast.makeText(MainActivity.this, "Please enter valid input", 1000).show();
        }
    }
    public void click3 (View v) {
        try {
            double rupee, dollar, M, Rs, J, H, S, B;

            M = Double.parseDouble(et3.getText().toString());
            rupee = (Double) M * 16.4344;
            dollar = (Double) M * 0.2555;
            B=(Double)M * 0.0961;
            Rs = (Double) M * 14.6633;
            H = (Double) M * 64.1226;
            J = (Double) M * 27.8328;
            S = (Double) M * 0.2388;
            et.setText(B + "");
            et1.setText(rupee + "");
            et2.setText(dollar + "");
            et4.setText(Rs + "");
            et5.setText(H + "");
            et6.setText(J + "");
            et7.setText(S + "");

        } catch(Exception e) {
            Toast.makeText(MainActivity.this, "Please enter valid input", 1000).show();
        }
    }
    public void click4 (View v) {
        try {
            double rupee, dollar, M, Rs, J, H, S, B;

            Rs = Double.parseDouble(et4.getText().toString());
            rupee = (Double) Rs * 1.1197;
            dollar = (Double) Rs * 0.01742;
            M = (Double) Rs * 0.0682;
            B=(Double) Rs * 0.0065;
            H = (Double)Rs * 4.3702;
            J = (Double) Rs * 1.8977;
            S = (Double) Rs * 0.0163;
            et.setText(B + "");
            et1.setText(rupee + "");
            et2.setText(dollar + "");
            et3.setText(M + "");
            et5.setText(H + "");
            et6.setText(J + "");
            et7.setText(S + "");

        } catch(Exception e) {
            Toast.makeText(MainActivity.this, "Please enter valid input", 1000).show();
        }
    }
    public void click5 (View v) {
        try {
            double rupee, dollar, M, Rs, J, H, S, B;

            H = Double.parseDouble(et5.getText().toString());
            rupee = (Double)  H * 0.2561;
            dollar = (Double)  H * 0.0032;
            M = (Double)  H * 0.0156;
            B=(Double)  H * 0.0014;
            Rs = (Double) H * 0.2288;
            J = (Double)  H * 0.4344;
            S = (Double)  H * 0.0037;
            et.setText(B + "");
            et1.setText(rupee + "");
            et2.setText(dollar + "");
            et3.setText(M + "");
            et4.setText(Rs + "");
            et6.setText(J + "");
            et7.setText(S + "");

        } catch(Exception e) {
            Toast.makeText(MainActivity.this, "Please enter valid input", 1000).show();
        }
    }
    public void click6 (View v) {
        try {
            double rupee, dollar, M, Rs, J, H, S, B;

            J = Double.parseDouble(et6.getText().toString());
            rupee = (Double) J * 0.587;
            dollar = (Double)  J * 0.0091;
            M = (Double)  J * 0.0358;
            B=(Double) J * 0.0034;
            Rs = (Double) J * 0.5221;
            H = (Double)  J * 2.2851;
            S = (Double)  J * 0.0085;
            et.setText(B + "");
            et1.setText(rupee + "");
            et2.setText(dollar + "");
            et3.setText(M + "");
            et4.setText(Rs + "");
            et5.setText(H + "");
            et7.setText(S + "");

        } catch(Exception e) {
            Toast.makeText(MainActivity.this, "Please enter valid input", 1000).show();
        }
    }
    public void click7 (View v) {
        try {
            double rupee, dollar, M, Rs, J, H, S, B;

            S = Double.parseDouble(et7.getText().toString());
            rupee = (Double)  S * 68.7123;
            dollar = (Double)  S * 1.0706;
            M = (Double)  S * 4.1875;
            B=(Double) S * 0.4025;
            Rs = (Double) S * 61.2213;
            H = (Double)  S * 267.7758;
            J = (Double)  S * 116.6162;
            et.setText(B + "");
            et1.setText(rupee + "");
            et2.setText(dollar + "");
            et3.setText(M + "");
            et4.setText(Rs + "");
            et5.setText(H + "");
            et6.setText(J + "");

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












