package tw.org.iii.myanim;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imeg ;
    private ObjectAnimator anim1 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imeg = (ImageView)findViewById(R.id.imege);
    }

    public  void text1(){

        anim1 =ObjectAnimator.ofFloat(imeg,"x",0,400); //X軸位移量
        anim1.setDuration(4*1000);//運作時間
        anim1.setRepeatCount(ValueAnimator.RESTART); //重複幾次
        anim1.setRepeatMode(ValueAnimator.REVERSE); //來回一次
        anim1.start();//動畫開始

    }
    public  void text2(){

    }
    public  void text3(){

    }
}
