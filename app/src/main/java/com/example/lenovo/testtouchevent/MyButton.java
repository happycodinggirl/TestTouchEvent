package com.example.lenovo.testtouchevent;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by lenovo on 2015/12/19.
 */
public class MyButton extends Button {
    public MyButton(Context context) {
        super(context);
    }

    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.v("PLU","---child-------onTouchEvent");
        super.onTouchEvent(event);

        return true;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        //boolean result=super.dispatchTouchEvent(event);
        //Log.v("PLU","--------child dispatchTouchEvent result is "+result);
       /* boolean result=super.dispatchTouchEvent(event);

        Log.v("PLU","-----child---dispatchTouchEvent---RESULT IS -"+result);

        return super.dispatchTouchEvent(event);
*/
        boolean result=super.dispatchTouchEvent(event);
        Log.v("PLU", "-----child---dispatchTouchEvent---RESULT IS -" + result);
     //   return super.dispatchTouchEvent(event);
        super.dispatchTouchEvent(event);
        return false;







       // return true;
    }


}
