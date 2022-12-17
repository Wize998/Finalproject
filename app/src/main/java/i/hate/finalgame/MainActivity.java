//sources
//https://www.youtube.com/watch?v=TPKugVdd6E4
//https://stackoverflow.com/questions/12243462/simple-android-add-subtract-app
package i.hate.finalgame;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Point;



import java.util.Random;

public class MainActivity<listener> extends AppCompatActivity {

    Button buttoneven;
    TextView textView;
    Point size = new Point();
    ImageView ic_outside;
    ImageView ic_inside;
    Random r;
    Random a;


    int startpoint ;




    int degree =0,
    degree_old=0;

    TextView tvPoints;
    private static final float FACTOR =4.86f;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        buttoneven = (Button) findViewById(R.id.buttoneven);
        ic_outside = (ImageView) findViewById(R.id.ic_outside);
        ic_inside = (ImageView) findViewById(R.id.ic_inside);
        textView = (TextView) findViewById(R.id.textView);
        tvPoints = (TextView) findViewById(R.id.tvPoints);
        r = new Random();
        a = new Random();

        startpoint = a.nextInt(60);

        View.OnClickListener listener = new View.OnClickListener() {


            @Override
            public void onClick(View view) {


                degree_old = degree % 360;
                degree = r.nextInt(3600) + 720;

                RotateAnimation rotate = new RotateAnimation(degree_old, degree,
                        RotateAnimation.RELATIVE_TO_SELF, 0.5f, RotateAnimation.RELATIVE_TO_SELF, 0.5f);
                rotate.setDuration(5000);
                rotate.setFillAfter(true);
                rotate.setInterpolator(new DecelerateInterpolator());
                rotate.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                        textView.setText(" ");
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        textView.setText(currentNumber(360 - (degree % 360)));
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {
                    }

                });
                ic_inside.startAnimation(rotate);
                tvPoints.setText("  Points:" + startpoint);


            }


        };

        buttoneven.setOnClickListener(listener);


    }


    private String currentNumber(int degrees) {
        Random a;
        a= new Random();



        int p=3;
    int p2;
    int c;

        String text = "";

        if (degrees >= (FACTOR * 1) && degrees < (FACTOR * 3)) {


            text = "red 30";
            p2 = p + 1;
            c=startpoint+ 30;


          if (c>=50){
              tvPoints.setText(" Nice job!" );
          }
          else{
              tvPoints.setText(" Try it again!" );
          }
        }
            if (degrees >= (FACTOR * 3) && degrees < (FACTOR * 5)) {

                text = "black 8";
                p2 = p - 1;
                c=startpoint- 8;

                if (c>=50){
                    tvPoints.setText(" Nice job!" );
                }
                else{
                    tvPoints.setText(" Try it again!" );
                }

            }

        if (degrees >= (FACTOR * 5) && degrees < (FACTOR * 7)) {

            text = "red 23";


            p2 = p + 1;
            c=startpoint+ 23;

            if (c>=50){
                tvPoints.setText(" Nice job!" );
            }
            else{
                tvPoints.setText(" Try it again!" );
            }

        }

        if (degrees >= (FACTOR * 7) && degrees < (FACTOR * 9)) {

            text = "black 10";
            p2 = p - 1;
            c=startpoint-10;

            if (c>=50){
                tvPoints.setText(" Nice job!" );
            }
            else{
                tvPoints.setText(" Try it again!" );
            }

        }

        if (degrees >= (FACTOR * 9) && degrees < (FACTOR * 11)) {

            text = "red 5";
            p2 = p + 1;
            c=startpoint+5;

            if (c>=50){
                tvPoints.setText(" Nice job!" );
            }
            else{
                tvPoints.setText(" Try it again!" );
            }

        }

        if (degrees >= (FACTOR * 11) && degrees < (FACTOR * 13)) {

            text = "black 24";
            p2 = p - 1;
            c=startpoint-24;

            if (c>=50){
                tvPoints.setText(" Nice job!" );
            }
            else{
                tvPoints.setText(" Try it again!" );
            }

        }

        if (degrees >= (FACTOR * 13) && degrees < (FACTOR * 15)) {

            text = "red 16";
            p2 = p + 1;
            c=startpoint+16;

            if (c>=50){
                tvPoints.setText(" Nice job!" );
            }
            else{
                tvPoints.setText(" Try it again!" );
            }


        }

        if (degrees >= (FACTOR * 15) && degrees < (FACTOR * 17)) {

            text = "black 33";
            p2 = p - 1;
            c=startpoint-33;

            if (c>=50){
                tvPoints.setText(" Nice job!" );
            }
            else{
                tvPoints.setText(" Try it again!" );
            }

        }

        if (degrees >= (FACTOR * 17) && degrees < (FACTOR * 19)) {

            text = "red 1";
            p2 = p + 1;
            c=startpoint+1;

            if (c>=50){
                tvPoints.setText(" Nice job!" );
            }
            else{
                tvPoints.setText(" Try it again!" );
            }


        }

        if (degrees >= (FACTOR * 19) && degrees < (FACTOR * 21)) {

            text = "black 20";
            p2 = p - 1;
            c=startpoint-20;

            if (c>=50){
                tvPoints.setText(" Nice job!" );
            }
            else{
                tvPoints.setText(" Try it again!" );
            }


        }

        if (degrees >= (FACTOR * 21) && degrees < (FACTOR * 23)) {

            text = "red 14";
            p2 = p + 1;
            c=startpoint+14;

            if (c>=50){
                tvPoints.setText(" Nice job!" );
            }
            else{
                tvPoints.setText(" Try it again!" );
            }

        }

        if (degrees >= (FACTOR * 23) && degrees < (FACTOR * 25)) {

            text = "black 31";
            p2 = p - 1;
            c=startpoint-31;

            if (c>=50){
                tvPoints.setText(" Nice job!" );
            }
            else{
                tvPoints.setText(" Try it again!" );
            }

        }

        if (degrees >= (FACTOR * 25) && degrees < (FACTOR * 27)) {

            text = "red 9";
            p2 = p + 1;
            c=startpoint+9;

            if (c>=50){
                tvPoints.setText(" Nice job!" );
            }
            else{
                tvPoints.setText(" Try it again!" );
            }


        }

        if (degrees >= (FACTOR * 27) && degrees < (FACTOR * 29)) {

            text = "black 22";
            p2 = p - 1;
            c=startpoint-22;

            if (c>=50){
                tvPoints.setText(" Nice job!" );
            }
            else{
                tvPoints.setText(" Try it again!" );
            }


        }

        if (degrees >= (FACTOR * 29) && degrees < (FACTOR * 31)) {

            text = "red 18";
            p2 = p + 1;
            c=startpoint+18;

            if (c>=50){
                tvPoints.setText(" Nice job!" );
            }
            else{
                tvPoints.setText(" Try it again!" );
            }

        }

        if (degrees >= (FACTOR * 31) && degrees < (FACTOR * 33)) {

            text = "black 29";
            p2 = p - 1;
            c=startpoint-29;

            if (c>=50){
                tvPoints.setText(" Nice job!" );
            }
            else{
                tvPoints.setText(" Try it again!" );
            }

        }

        if (degrees >= (FACTOR * 33) && degrees < (FACTOR * 35)) {

            text = "red 7";
            p2 = p + 1;
            c=startpoint+7;

            if (c>=50){
                tvPoints.setText(" Nice job!" );
            }
            else{
                tvPoints.setText(" Try it again!" );
            }

        }

        if (degrees >= (FACTOR * 35) && degrees < (FACTOR * 37)) {

            text = "black 28";
            p2 = p - 1;
            c=startpoint-28;

            if (c>=50){
                tvPoints.setText(" Nice job!" );
            }
            else{
                tvPoints.setText(" Try it again!" );
            }

        }

        if (degrees >= (FACTOR * 37) && degrees < (FACTOR * 39)) {

            text = "red 12";
            p2 = p + 1;
            c=startpoint+12;

            if (c>=50){
                tvPoints.setText(" Nice job!" );
            }
            else{
                tvPoints.setText(" Try it again!" );
            }


        }

        if (degrees >= (FACTOR * 39) && degrees < (FACTOR * 41)) {

            text = "black 35";
            p2 = p - 1;
            c=startpoint-35;

            if (c>=50){
                tvPoints.setText(" Nice job!" );
            }
            else{
                tvPoints.setText(" Try it again!" );
            }


        }

        if (degrees >= (FACTOR * 41) && degrees < (FACTOR * 43)) {

            text = "red 3";
            p2 = p + 1;
            c=startpoint+3;

            if (c>=50){
                tvPoints.setText(" Nice job!" );
            }
            else{
                tvPoints.setText(" Try it again!" );
            }
        }

        if (degrees >= (FACTOR * 43) && degrees < (FACTOR * 45)) {

            text = "black 26";
            p2 = p - 1;
            c=startpoint-26;

            if (c>=50){
                tvPoints.setText(" Nice job!" );
            }
            else{
                tvPoints.setText(" Try it again!" );
            }


        }

        if (degrees >= (FACTOR * 45) && degrees < (FACTOR * 47)) {


            text = "0";
            tvPoints.setText("Take a break");

        }
        startpoint = a.nextInt(60) ;

        if (degrees >= (FACTOR * 47) && degrees < (FACTOR * 49)) {

            text = "red 32";
            p2 = p + 1;
            c=startpoint+32;

            if (c>=50){
                tvPoints.setText(" Nice job!" );
            }
            else{
                tvPoints.setText(" Try it again!" );
            }

        }

        if (degrees >= (FACTOR * 49) && degrees < (FACTOR * 51)) {

            text = "black 15";
            p2 = p - 1;
            c=startpoint-15;

            if (c>=50){
                tvPoints.setText(" Nice job!" );
            }
            else{
                tvPoints.setText(" Try it again!" );
            }

        }

        if (degrees >= (FACTOR * 51) && degrees < (FACTOR * 53)) {

            text = "red 19";
            p2 = p + 1;
            c=startpoint+19;

            if (c>=50){
                tvPoints.setText(" Nice job!" );
            }
            else{
                tvPoints.setText(" Try it again!" );
            }

        }

        if (degrees >= (FACTOR * 53) && degrees < (FACTOR *55)) {

            text = "black 4";
            p2 = p - 1;
            c=startpoint-4;

            if (c>=50){
                tvPoints.setText(" Nice job!" );
            }
            else{
                tvPoints.setText(" Try it again!" );
            }


        }

        if (degrees >= (FACTOR * 55) && degrees < (FACTOR * 57)) {

            text = "red 21";
            p2 = p + 1;
            c=startpoint+21;

            if (c>=50){
                tvPoints.setText(" Nice job!" );
            }
            else{
                tvPoints.setText(" Try it again!" );
            }

        }

        if (degrees >= (FACTOR * 57) && degrees < (FACTOR * 59)) {

            text = "black 2";
            p2 = p - 1;
            c=startpoint-2;

            if (c>=50){
                tvPoints.setText(" Nice job!" );
            }
            else{
                tvPoints.setText(" Try it again!" );
            }


        }

        if (degrees >= (FACTOR * 59) && degrees < (FACTOR * 61)) {

            text = "red 25";
            p2 = p + 1;
            c=startpoint+25;

            if (c>=50){
                tvPoints.setText(" Nice job!" );
            }
            else{
                tvPoints.setText(" Try it again!" );
            }

        }


        if (degrees >= (FACTOR * 61) && degrees < (FACTOR * 63)) {

            text = "black 17";
            p2 = p - 1;
            c=startpoint-17;

            if (c>=50){
                tvPoints.setText(" Nice job!" );
            }
            else{
                tvPoints.setText(" Try it again!" );
            }

        }

        if (degrees >= (FACTOR * 63) && degrees < (FACTOR * 65)) {

            text = "red 34";
            p2 = p + 1;
            c=startpoint+34;

            if (c>=50){
                tvPoints.setText(" Nice job!" );
            }
            else{
                tvPoints.setText(" Try it again!" );
            }
            p = p2; return text;
        }


        if (degrees >= (FACTOR * 65) && degrees < (FACTOR * 67)) {

            text = "black 6";
            p2 = p - 1;
            c=startpoint-6;

            if (c>=50){
                tvPoints.setText(" Nice job!" );
            }
            else{
                tvPoints.setText(" Try it again!" );
            }


        }

        if (degrees >= (FACTOR * 67) && degrees < (FACTOR * 69)) {

            text = "red 27";
            p2 = p + 1;
            c=startpoint+27;

            if (c>=50){
                tvPoints.setText(" Nice job!" );
            }
            else{
                tvPoints.setText(" Try it again!" );
            }


        }

        if (degrees >= (FACTOR * 69) && degrees < (FACTOR * 71)) {

            text = "black 13";
            p2 = p - 1;
            c=startpoint-13;

            if (c>=50){
                tvPoints.setText(" Nice job!" );
            }
            else{
                tvPoints.setText(" Try it again!" );
            }

        }


        if (degrees >= (FACTOR * 71) && degrees < (FACTOR * 73)) {

            text = "red 36";
            p2 = p + 1;
            c=startpoint+36;

            if (c>=50){
                tvPoints.setText(" Nice job!" );
            }
            else{
                tvPoints.setText(" Try it again!" );
            }

        }

        if ((degrees >= (FACTOR * 73) && degrees < 360) || (degrees >= 0 && degrees < (FACTOR * 1))) {

            text = "black 11";
            p2 = p - 1;
            c=startpoint-11;

            if (c>=50){
                tvPoints.setText(" Nice job!" );
            }
            else{
                tvPoints.setText(" Try it again!" );
            }

        }


        return text;

    }

}
