//액티비티간 변환
//라디오버튼
package com.example.a20191104;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnNewActivity =(Button)findViewById(R.id.btnNewActivity);
        final RadioButton rBtn1,rBtn2;
        rBtn1=(RadioButton)findViewById(R.id.rBtn1);
        rBtn2=(RadioButton)findViewById(R.id.rBtn2);
        btnNewActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(rBtn1.isChecked()){
                    Intent intent =new Intent(getApplicationContext(),SecondActivity.class);
                    startActivity(intent);
                }
                else if(rBtn2.isChecked()){
                    Intent intent =new Intent(getApplicationContext(),ThirdActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this,"체크해주세요",Toast.LENGTH_SHORT).show();
                }        }    }); }}
