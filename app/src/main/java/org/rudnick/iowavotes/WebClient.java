package org.rudnick.iowavotes;

import android.net.Uri;
import android.os.Build;
import android.view.KeyEvent;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebClient extends WebViewClient {
    public boolean shuldOverrideKeyEvent(WebView view, KeyEvent event) {

        return true;
    }

    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            if (request.getUrl().toString().contains("iowa.gov")) {
                // This is my web site, so do not override; let my WebView load the page
                return false;
            } else {
                // reject anything other
                return true;
            }
        } else {
            if (view.getUrl().contains("iowa.gov")) {
                // This is my web site, so do not override; let my WebView load the page
                return false;
            } else {
                // reject anything other
                return true;
            }
        }
    }
}
