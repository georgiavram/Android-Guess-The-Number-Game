package com.example.junior;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Random;
public class MainActivity extends AppCompatActivity {
    Button btnColor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnColor = findViewById((R.id.btnColor));
        btnColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rnd = new Random();
                Color color = new Color();
                btnColor.setBackgroundColor( color.argb(rnd.nextInt(255),rnd.nextInt(255),rnd.nextInt(255),rnd.nextInt(255)));
            }
        });
    }
}
