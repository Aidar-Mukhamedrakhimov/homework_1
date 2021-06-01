package kz.gk.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button1 = findViewById(R.id.button1);

        button1.setOnClickListener(v -> {
            Intent intent1 = new Intent(v.getContext(), MainActivity2.class);
            startActivity(intent1);
        });
    }
}