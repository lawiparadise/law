package com.law.yeje;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButton1Clicked(View v){
       //Toast.makeText(this,"gogo",Toast.LENGTH_SHORT).show();
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.m.naver.com"));
        startActivity(i);
    }

    public void onButton2Clicked(View v){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-2674-8216"));
        startActivity(i);
    }

    public void onButton3Clicked(View v){
        Intent i = new Intent(getApplicationContext(), NewActivity.class);
        startActivity(i);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
