package com.example.custom_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.custom_listview.databinding.ActivityUserBinding;

public class ContactActivity extends AppCompatActivity {

    ActivityUserBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        TextView nameView = findViewById(R.id.name_profile);
        TextView phoneView = findViewById(R.id.phone_profile);
        ImageView imageView = findViewById(R.id.profile_image);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String phone = intent.getStringExtra("phone");
        String imageUri = intent.getStringExtra("imageUri");

        nameView.setText(name);
        phoneView.setText(phone);
        if (imageUri != null) {
            imageView.setImageURI(Uri.parse(imageUri));
        } else {
            imageView.setImageResource(R.drawable.facebook_avatar); // set a default image if the contact has no image
        }
    }
}