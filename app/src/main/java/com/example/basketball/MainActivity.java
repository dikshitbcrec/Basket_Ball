package com.example.basketball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
    }
   int Basket=0,Basket1=0;

    public void Point3(View view)
    {
        Basket+=3;
        disp(Basket);
        dispA(Basket,Basket1);
    }
    public void PointB3(View view)
    {
        Basket1+=3;
        dispB(Basket1);
        dispA(Basket,Basket1);
    }



    public void Point2(View view)
    {
        Basket+=2;
        disp(Basket);
        dispA(Basket,Basket1);
    }
    public void PointB2(View view)
    {
        Basket1+=2;
        dispB(Basket1);
        dispA(Basket,Basket1);
    }


    public void Point1(View view)
    {
        Basket+=1;
        disp(Basket);
        dispA(Basket,Basket1);
    }
    public void PointB1(View view)
    {
        Basket1+=1;
        dispB(Basket1);
        dispA(Basket,Basket1);
    }
    private void disp(int basket) {
        TextView tex=(TextView) findViewById(R.id.name1);
        tex.setText("" + basket);
    }
    private void dispB(int basket1) {
        TextView texB=(TextView)findViewById(R.id.nameB1);
        texB.setText("" + basket1);
    }
    public void reSet(View view)
    {
        Basket1=0;
        Basket=0;
        disp(Basket);
        dispB(Basket1);
        TextView tex=(TextView)findViewById(R.id.win);
        tex.setText("");
    }

    private void dispA(int b, int b1) {
        TextView tex=(TextView)findViewById(R.id.win);
        if(b == b1)
            tex.setText("Tie");
        else if(b > b1)
            tex.setText("Team A is On Lead");
        else
            tex.setText("Team B is On Lead");
    }


    public void calculate(View view) {
        TextView tex=(TextView)findViewById(R.id.win);

        if(Basket == Basket1)
            tex.setText("Tie");
        else if(Basket > Basket1)
            tex.setText("Hooray!!" +"\n" +" Team A Won");
        else
            tex.setText("Hooray!!" +"\n" +" Team B Won");

        Basket=0;
        Basket1=0;
        disp(Basket);
        dispB(Basket1);
    }
}