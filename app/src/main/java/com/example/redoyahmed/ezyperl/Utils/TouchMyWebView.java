package com.example.redoyahmed.ezyperl.Utils;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;

public class TouchMyWebView extends WebView {
    private static final int MIN_DISTANCE = 150;
    private float x1;

    public TouchMyWebView(Context context) {
        super(context);
    }

    public TouchMyWebView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TouchMyWebView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public boolean onTouchEvent(MotionEvent event) {
        if (event.getPointerCount() > 1) {
            requestDisallowInterceptTouchEvent(true);
        }
        return super.onTouchEvent(event);
    }
}
