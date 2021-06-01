package kz.gk.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button button1 = findViewById(R.id.button2);
        button1.setOnClickListener(v -> {
            Intent intent1 = new Intent(v.getContext(),MainActivity.class);
            startActivity(intent1);
        });
    }
}