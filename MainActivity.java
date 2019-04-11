
package e.l.circle_1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Pie> list = new ArrayList<>();
    MyTextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTextView=findViewById(R.id.main_aaa);
        list.add(new Pie("大象",25f, Color.parseColor("#24EDFF")));
        list.add(new Pie("大象",15,Color.parseColor("#FF1F17")));
        list.add(new Pie("大象",10f,Color.parseColor("#FFD26B")));
        list.add(new Pie("大象",10f,Color.parseColor("#EC79FF")));
        list.add(new Pie("大象",35.0f,Color.parseColor("#92A0FF")));
        list.add(new Pie("大象",5f,Color.parseColor("#14FF9C")));
       // myTextView =new MyTextView(this);
        myTextView.setList(list);


    }
}
