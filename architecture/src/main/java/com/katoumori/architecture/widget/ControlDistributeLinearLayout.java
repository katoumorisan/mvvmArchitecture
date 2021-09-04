package com.katoumori.architecture.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

import com.katoumori.architecture.R;
 /**
  * @Title: ControlDistributeLinearLayout
  * @Package com.katoumori.architecture.widget
  * @Description: 控制事件分发的LinearLayout
  * @author yzl10
  * @date 2021/9/4
  * @version V1.0
  */
public class ControlDistributeLinearLayout extends LinearLayout {
    //默认是不拦截事件,分发事件给子View
    private boolean isDistributeEvent = false;

    public ControlDistributeLinearLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.ControlDistributeLinearLayout);
        isDistributeEvent = typedArray.getBoolean(R.styleable.ControlDistributeLinearLayout_distribute_event, false);
    }

    public ControlDistributeLinearLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ControlDistributeLinearLayout(Context context) {
        this(context, null);
    }

    /**
     * 重写事件分发方法,false 为分发 , true 为父控件自己消耗, 由外面传进来的参数决定
     */
    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return isDistributeEvent();
    }

    public boolean isDistributeEvent() {
        return isDistributeEvent;
    }

    public void setDistributeEvent(boolean distributeEvent) {
        isDistributeEvent = distributeEvent;
    }
}
