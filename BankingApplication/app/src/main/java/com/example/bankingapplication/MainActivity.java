package com.example.bankingapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.transfer_button);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View V)
            {
                openActivity2();
            }
        });
    }
    public void openActivity2()
    {
        Intent intent = new Intent(this, transfer_activity.class);
        startActivity(intent);
    }
}