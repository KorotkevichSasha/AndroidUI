package com.example.bottle;in

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView bottle;
    RelativeLayout back;
    Random random;
    int lastPose;
    int rounds;

    boolean flagBattleSpinning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        back = findViewById(R.id.back);
        bottle = findViewById(R.id.bottle);
        random = new Random();
        rounds = random.nextInt(5);
    }

    public void spinBottle(View view) {
        if (!flagBattleSpinning){
        int kol = random.nextInt(360 );
        float x = bottle.getWidth()/2;
        float y = bottle.getHeight()/2;

        Animation rotate = new RotateAnimation(lastPose,kol + rounds*360,x,y);
        rotate.setDuration(rounds* 1000L);
        rotate.setFillAfter(true);
        rotate.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                flagBattleSpinning =true;
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                flagBattleSpinning = false;
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        bottle.startAnimation(rotate);
        lastPose = kol;}
    }

    public void clickBack_01(View view) {
        back.setBackgroundResource(R.drawable.table2);
    }

    public void clickBack_02(View view) {
        back.setBackgroundResource(R.drawable.table3);
    }

    public void clickBack_04(View view) {
        back.setBackgroundResource(R.drawable.table5);

    }

    public void clickBack_05(View view) {
        back.setBackgroundResource(R.drawable.grass);

    }

    public void clickBack_06(View view) {
        back.setBackgroundResource(R.drawable.asphalt);

    }

    public void clickBack_07(View view) {
        back.setBackgroundResource(R.drawable.carpet3);

    }

    public void battle3(View view) {
        bottle.setImageResource(R.drawable.bottle3);
    }

    public void battle4(View view) {
        bottle.setImageResource(R.drawable.bottle4);}

    public void battle5(View view) {
        bottle.setImageResource(R.drawable.bottle5);}

    public void battle7(View view) {
        bottle.setImageResource(R.drawable.bottle7);}
}