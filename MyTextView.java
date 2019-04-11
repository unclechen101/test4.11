package e.l.circle_1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MyTextView extends View{

    private Paint paint;
    private Paint mpaint;
    private float start = 0;
    private List<Pie> list = new ArrayList<>();


    public MyTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(5);
        paint.setTextSize(30);

        mpaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mpaint.setStyle(Paint.Style.FILL_AND_STROKE);
        mpaint.setAntiAlias(true);
        mpaint.setStrokeWidth(5);
        mpaint.setColor(Color.WHITE);
    }
    public void setList( List<Pie> list){
        this.list =list;
        invalidate();
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = new RectF();
        rectF.set(getWidth()/2-200,getHeight()/2-200,getWidth()/2+200,getHeight()/2+200);
       // canvas.drawArc(rectF,start,36,false,paint);
     //   start+=36;
        for (int i=0;i<list.size();i++){
            Pie pie = list.get(i);
            String name = pie.getName();
            float zhi = pie.getZhi();
            int color = pie.getColor();
            paint.setColor(color);
            Log.d("abc",zhi+"");
            float xxx = zhi*360/100;
            canvas.drawArc(rectF,start,xxx,true,paint);
            start+=xxx;
        }

        canvas.drawCircle(getWidth()/2,getHeight()/2,100,mpaint);

    }
}
