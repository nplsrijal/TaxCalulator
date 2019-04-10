package com.example.taxcalulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private Button btn1;
    private EditText txt1;
    private TextView txt_output;
    private static DecimalFormat df2 = new DecimalFormat(".##");

    public boolean validate(){
        boolean checkvalidate=true;
        if (TextUtils.isEmpty(txt1.getText().toString())) {
            txt1.setError("Number is required");
            txt1.requestFocus();
            checkvalidate = false;

        }


        return  checkvalidate;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1=findViewById(R.id.txt1);

        txt_output=findViewById(R.id.txt_output);
        btn1=findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(validate()){
                    float num1 = Float.parseFloat(txt1.getText().toString());

                    Calculation calc= new Calculation();
                    calc.setNum1(num1);
                    double taxable=calc.calculate_tax();





                    txt_output.setText("Taxable Amount: "+ df2.format(taxable) );


                }





            }
        });
    }
}
