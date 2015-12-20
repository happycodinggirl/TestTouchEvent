package com.example.lenovo.testtouchevent;

import android.os.Bundle;
import android.support.annotation.VisibleForTesting;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.LoginFilter;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final Button view= (MyButton) findViewById(R.id.textview);
        view.post(new Runnable() {
            @Override
            public void run() {
                int left = view.getLeft();
                int top = view.getTop();
                Log.v("PLU", "-----LEFT IS " + left + "   top is " + top);

            }
        });

        view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.v("PLU", "________child __________-onTouchListener =onTouch----");
                int action=event.getAction();
               /* switch (action){
                    case MotionEvent.ACTION_DOWN:
                        return true;



                }*/
                return false;
            }
        });








        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("PLU", "------view onClick---------------------------------");
            }
        });

      /*  FrameLayout fram;
        LinearLayout linearLayout;*/
       /* TextView view= (TextView) findViewById(R.id.tv_outer);
        int top=view.getPaddingTop();
        Log.v("PLU","----TOP IS "+top);*/

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        CustomViewGroup customViewGroup= (CustomViewGroup) findViewById(R.id.customViewGroup);
        customViewGroup.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.v("PLU","----parent -----onTouchListener onTouch ---");
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                       // SwipeRefreshLayout swipeRefreshLayout;

                        break;
                    case MotionEvent.ACTION_MOVE:
                        break;
                    case MotionEvent.ACTION_UP:
                        break;
                }
                return false;
            }
        });


        customViewGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("PLU","------parent onClick listener ");
            }
        });
    }

   /* @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.v("PLU","------activity______________________________-onTouchEvent----");
        super.onTouchEvent(event);
        return true;
    }*/


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.v("PLU","-----ACTIVITY ------onTouchEvent");
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
