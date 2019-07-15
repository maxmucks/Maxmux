package com.alc.maxmux;

import android.content.Intent;
import android.net.http.SslError;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutAlc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("About ALC");
        WebView alcWebview = findViewById(R.id.abt_alc);
        alcWebview.loadUrl("https://andela.com/alc/");
        WebSettings webSettings = alcWebview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        alcWebview.setWebViewClient(
                new SSLTolerentWebViewClient()
        );
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        NavUtils.navigateUpTo(this, new Intent(this, MainActivity.class));
        return true;
    }

}


