package org.rudnick.iowavotes;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * A simple {@link Fragment} subclass.
 */
public class FindLegislatorsFragment extends Fragment {


    public FindLegislatorsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_check_web, container, false);
        // WebView displaying Iowa Gov website.
        WebView view = (WebView) rootView.findViewById(R.id.web_view);
        view.loadUrl("https://www.legis.iowa.gov/legislators/find");
        view.setWebViewClient(new WebClient());
        // Enable JavaScript
        view.getSettings().setJavaScriptEnabled(true);;
        return rootView;
    }

}