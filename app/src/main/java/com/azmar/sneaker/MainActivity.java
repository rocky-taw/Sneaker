package com.azmar.sneaker;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.irozon.sneaker.Sneaker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnSuccess).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sneaker.with(MainActivity.this)
                        .setTitle("Success!")
                        .setMessage("This is success message")
                        .sneakSuccess();
            }
        });

        findViewById(R.id.btnWarning).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sneaker.with(MainActivity.this)
                        .setTitle("Warning!")
                        .setMessage("This is warning message")
                        .sneakWarning();
            }
        });

        findViewById(R.id.btnError).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sneaker.with(MainActivity.this)
                        .setTitle("Error!")
                        .setMessage("This is error message")
                        .sneakError();
            }
        });

        findViewById(R.id.btnCustom).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sneaker.with(MainActivity.this)
                        .setTitle("Custom!")
                        .setMessage("This is custom message")
                        .setDuration(5000)
                        .autoHide(true)
                        .setHeight(ViewGroup.LayoutParams.WRAP_CONTENT)
                        .setTypeface(Typeface.createFromAsset(MainActivity.this.getAssets(),"fonts/vermin_vibes.ttf"))
                        .setIcon(R.drawable.ic_cloud_done)
                        .setOnSneakerClickListener(new Sneaker.OnSneakerClickListener() {
                            @Override
                            public void onSneakerClick(View view) {
                                Toast.makeText(MainActivity.this,"Sneaker Clicked",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .sneak(R.color.colorAccent);
            }
        });
    }
}
