package com.example.a04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    public class MyCanvas extends View {

        private Paint paint;

        public MyCanvas(Context context) {
            super(context);
            init();
        }

        public MyCanvas(Context context, AttributeSet attrs) {
            super(context, attrs);
            init();
        }

        public MyCanvas(Context context, AttributeSet attrs, int defStyle) {
            super(context, attrs, defStyle);
            init();
        }

        private void init() {
            paint = new Paint();
            paint.setColor(0xff0000ff); // blue color
            paint.setStrokeWidth(5);
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            int width = getWidth();
            int height = getHeight();
            int radius = Math.min(width, height) / 4 - 10;
            canvas.drawCircle(width / 2, height / 5, radius, paint);
            int left = width / 6;
            int top = height / 2;
            int right = left + width / 3;
            int bottom = top + height / 3;
            canvas.drawRect(left, top, right, bottom, paint);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        MyCanvas myCanvas = new MyCanvas(this);
        setContentView(myCanvas);
    }
}