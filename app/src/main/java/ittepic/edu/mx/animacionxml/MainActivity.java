package ittepic.edu.mx.animacionxml;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button btn_iniciar;
    ImageView img_1,img_2,img_3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_iniciar=(Button)findViewById(R.id.button);
        img_1=(ImageView)findViewById(R.id.imageView);
        img_2=(ImageView)findViewById(R.id.imageView2);
        img_3=(ImageView)findViewById(R.id.imageView3);
        btn_iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation= AnimationUtils.loadAnimation(v.getContext(),R.anim.grow);

                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        img_1.setRotationX(39);
                        img_1.setRotationY(10);
                        img_2.setScaleX(2);
                        img_2.setScaleY(1);
                        img_3.setTranslationX(1);
                        img_3.setTranslationY(2);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
                img_1.startAnimation(animation);
                img_2.startAnimation(animation);
                img_3.startAnimation(animation);
            }
        });
    }
}
