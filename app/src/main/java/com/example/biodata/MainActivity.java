package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

public void Maps(View view){
    Intent mapsIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/9WbwpWwUYBUn57QL6"));
    startActivity(mapsIntent);
}
public void Phone(View view){
        String nomor = "085727075643";
        Intent phoneIntent = new Intent(Intent.ACTION_DIAL,Uri.fromParts("tel",nomor, null));
        startActivity(phoneIntent);
}
public void email(View view){
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setData(Uri.parse("mailto"));
        String emailUri = "111202012647@mhs.dinus.ac.id";
        emailIntent.putExtra(Intent.EXTRA_EMAIL, emailUri);
        emailIntent.setType("message/rfc822");
        Intent chooser=Intent.createChooser(emailIntent, "Send Email");
        startActivity(chooser);
}
}