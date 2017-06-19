package com.example.asus.mececv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {

    WebView wb;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        wb=(WebView)findViewById(R.id.webview);

        String link= getIntent().getStringExtra("LinkId");
        wb.getSettings().setJavaScriptEnabled(true);
        String pdf= link;
        wb.setWebViewClient(new WebViewClient()); //başka sekmede açılmasın diye bunu yapıyoruz app de kalsın diye
        wb.loadUrl("http://drive.google.com/viewerng/viewer?embedded,=true&url=" + pdf); // google üzerinden açıyor



    }
}
