//레이팅바를 이용한 별점 증가 및 감소
//다중 엑티비티를 이용한 화면 전환
package com.example.a20191104;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("18113491 - 강민송");
        final RatingBar rating1,rating2,rating3;
        Button btnInc,btnDec;
        rating1=(RatingBar)findViewById(R.id.rating1);
        rating2=(RatingBar)findViewById(R.id.rating2);
        rating3=(RatingBar)findViewById(R.id.rating3);
        btnInc=(Button)findViewById(R.id.btnInc);
        btnDec=(Button)findViewById(R.id.btnDec);

        Button btnNewActivity =(Button)findViewById(R.id.btnNewActivity);
        btnNewActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),SecondActivity.class);
                startActivity(intent);
            }
        });
        btnInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rating1.setRating((rating1.getRating()+rating1.getStepSize()));
                rating2.setRating((rating2.getRating()+rating2.getStepSize()));
                rating3.setRating((rating3.getRating()+rating3.getStepSize()));
            }
        });
        btnDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rating1.setRating((rating1.getRating()-rating1.getStepSize()));
                rating2.setRating((rating2.getRating()-rating2.getStepSize()));
                rating3.setRating((rating3.getRating()-rating3.getStepSize()));
            }
        });
    }
}
