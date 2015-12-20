package com.example.lenovo.testtouchevent;

import android.animation.FloatArrayEvaluator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/**
 * Created by lenovo on 2015/12/19.
 */
public class CustomViewGroup extends LinearLayout {


    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {

        return false;
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        // super.dispatchTouchEvent(ev);
        // boolean result=super.dispatchTouchEvent(ev);
        // Log.v("PLU","-------parent dispatchTouchEvent result is "+result);
        //注意此处，返回值跟onTouchEvent的返回值有关，此项目中测下来，如果onTouchEvent返回false,则此处也返回false
        //如果自己强制让其返回true,则即使onTouchEvent返回false(表明自己不消费此事件，本该向上一层传递)，也不会向上级传递，而是自己处理。
        return super.dispatchTouchEvent(ev);

        //return true;
        // return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //Log.v("PLU","--parent -------------onTouchEvent");
        //Log.v("PLU","--parent -------------onTouchEvent");
        super.onTouchEvent(event);
        //boolean result=super.onTouchEvent(event);
        Log.v("PLU", "-------------parent onTouchEvent is ---");
        return true;
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }

    public CustomViewGroup(Context context) {
        super(context);
    }

    public CustomViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomViewGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

   /* @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

      *//*  View child=getChildAt(0);
        if (child!=null){
            int childWidth=child.getMeasuredWidth();
            int childHeight=child.getMeasuredHeight();
            Log.v("PLU","----child width is "+childWidth+"height is  "+childHeight);
            child.layout(0,100,childWidth,childHeight);
        }else{
            Log.v("PLU","------CHILD IS NULL");
        }

        int containerWidth=getMeasuredWidth();
        int containerHeight=getMeasuredHeight();
        Log.v("PLU","container width is "+containerWidth+"   container height is "+containerHeight);*//*

    }*/


    /*@Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        View child=getChildAt(0);
        LayoutParams layoutParams= (LayoutParams) child.getLayoutParams();
        int height=layoutParams.height;
        Log.v("PLU","----HEIGHT IS "+height);
        int childHeightMespec;
        if (layoutParams.height==LayoutParams.MATCH_PARENT){
            Log.v("PLU","----_________________________-layout height is match parent");
            childHeightMespec=MeasureSpec.makeMeasureSpec(height,MeasureSpec.EXACTLY);
        }else{
            childHeightMespec=getChildMeasureSpec(heightMeasureSpec, child.getPaddingTop()+child.getPaddingBottom(), layoutParams.height);

        }
       *//* RelativeLayout.LayoutParams layoutParams1;
        LinearLayout.LayoutParams layoutParams2;
        View view;
        view.getPaddingLeft();*//*


        int childWidthMespec;
        if (layoutParams.width== LayoutParams.MATCH_PARENT){
            Log.v("PLU","-----layout params width is match parent ");
            childWidthMespec=MeasureSpec.makeMeasureSpec(layoutParams.width,MeasureSpec.EXACTLY);
        }else{
            childWidthMespec=getChildMeasureSpec(widthMeasureSpec,child.getPaddingTop()+child.getPaddingBottom(),layoutParams.width);
        }
       *//* FrameLayout frameLayout;

        int parentMeasuredWidth=getMeasuredWidth();
        Log.v("PLU","-----parent measuredWidth is "+parentMeasuredWidth+" paddig left is "+getPaddingLeft()+" padign right is "+getPaddingRight());
        int widthSpec=MeasureSpec.makeMeasureSpec(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), MeasureSpec.EXACTLY);
        int heightSpec=MeasureSpec.makeMeasureSpec(getMeasuredHeight()-getPaddingBottom()-getPaddingTop(),MeasureSpec.EXACTLY);*//*
        child.measure(childWidthMespec,childHeightMespec);

        setMeasuredDimension(MeasureSpec.makeMeasureSpec(widthMeasureSpec, MeasureSpec.EXACTLY), MeasureSpec.makeMeasureSpec(heightMeasureSpec, MeasureSpec.EXACTLY));



    }
}*/
}
