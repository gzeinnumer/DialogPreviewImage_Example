package com.gzeinnumer.dialogpreviewimage_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.gzeinnumer.dpi.DialogPreviewImage;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.img);
        Button btnLoad = findViewById(R.id.btn);
        Button btnExample1 = findViewById(R.id.btn_example2);
        Button btnExample2 = findViewById(R.id.btn_example3);

        btnLoad.setOnClickListener(v -> {
            String imgUrl = "https://avatars3.githubusercontent.com/u/45892408?s=460&u=94158c6479290600dcc39bc0a52c74e4971320fc&v=4";
            Glide.with(getApplicationContext()).load(imgUrl).error(R.mipmap.ic_launcher).into(imageView);
        });
        imageView.setOnClickListener(v -> {
//            Bitmap bitmap = ((BitmapDrawable) imageView.getDrawable()).getBitmap();
//            new DialogPreviewImage(getSupportFragmentManager()).setImage(bitmap).show();

            String url = "https://avatars.githubusercontent.com/u/45892408?v=4";
            new DialogPreviewImage(getSupportFragmentManager()).setImage(url).setContent("Content Content").show();

//            new DialogPreviewImage(getSupportFragmentManager()).setImage(imageView).show();

//            new DialogPreviewImage(getSupportFragmentManager()).setImage("path").show();
//            new DialogPreviewImage(getSupportFragmentManager()).setImage("path").setContent("ini content").show();
        });
        btnExample1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://images.unsplash.com/photo-1568292342316-60aa3d36f4b3?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8d2FscGFwZXJ8ZW58MHx8MHx8&w=1000&q=80";
                new DialogPreviewImage(getSupportFragmentManager()).setImage(url).setContent("content").show();
            }
        });
        btnExample2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://cdn.kibrispdr.org/data/walpaper-hp-android-0.jpg";
                new DialogPreviewImage(getSupportFragmentManager()).setImage(url).show();
            }
        });

    }
}