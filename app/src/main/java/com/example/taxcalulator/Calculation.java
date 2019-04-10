package com.example.taxcalulator;

public class Calculation {
    float num1;
    double taxable;

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public double calculate_tax(){


        if(this.num1 >= 1 && this.num1 < 200000){

            taxable=this.num1 * 0.01;

        }else if(this.num1 >= 200000 && this.num1 < 350000){

            double taxable1=200000 * 0.01;
            float salary=this.num1-200000;

            double taxable2=salary * 0.15;
            taxable=taxable1+taxable2;


        }else{

            double taxable1=200000 * 0.01;

            double taxable2=150000 * 0.15;
            float salary=this.num1-350000;

            double taxable3=salary * 0.25;
            taxable=taxable1+taxable2+taxable3;

        }
              return  taxable;
    }
}
