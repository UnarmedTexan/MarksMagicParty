package com.example.android.marksmagicparty;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void webContact(View view){
        Intent intent = null, chooser = null;
        if (view.getId()==R.id.web_contact)
        {
            intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("http://www.mtmagic.com/contact/"));
            chooser = Intent.createChooser(intent, "Launch Browser");
            startActivity(chooser);
        }
    }


}
