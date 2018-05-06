package org.rudnick.iowavotes;

import android.os.Build;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

class WebClient extends WebViewClient {

    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            return !request.getUrl().toString().contains("iowa.gov");
        } else {
            return !view.getUrl().contains("iowa.gov");
        }
    }
}
