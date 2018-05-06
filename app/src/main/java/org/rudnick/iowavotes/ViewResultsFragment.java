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
public class ViewResultsFragment extends Fragment {


    public ViewResultsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_check_web, container, false);
        WebView view = rootView.findViewById(R.id.web_view);
        // WebView displaying Iowa Gov website.
        view.loadUrl("https://sos.iowa.gov/elections/results/#15");
        view.setWebViewClient(new WebViewClient());
        // Enable JavaScript
        view.getSettings().setJavaScriptEnabled(true);
        return rootView;
    }

}