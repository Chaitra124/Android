package myapplications.com.sensorapplication;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;



/**
 * Created by Chaitra Vani Jujaray on 27-10-2016.
 */
public class DisplayHTMLfileApplication extends ActionBarActivity {
    private WebView wbDisplay;



            @Override
                 protected void onCreate(Bundle saveInstanceState){
                super.onCreate(saveInstanceState);
                setContentView(R.layout.activity_display_htmlapplication);
                WebView htmlWebView = (WebView)findViewById(R.id.wbDisplay);
                WebSettings webSetting = htmlWebView.getSettings();
                webSetting.setJavaScriptEnabled(true);
                webSetting.setDisplayZoomControls(true);


                String htmlFilename = "abc.html";
                AssetManager mgr = getBaseContext().getAssets();
                try {
                    InputStream in = mgr.open(htmlFilename, AssetManager.ACCESS_BUFFER);
                    String htmlContentInStringFormat = StreamToString(in);
                    in.close();
                    htmlWebView.loadDataWithBaseURL(null, htmlContentInStringFormat, "text/html", "utf-8", null);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
    public static String StreamToString(InputStream in) throws IOException {
        if(in == null) {
            return "";
        }
        Writer writer = new StringWriter();
        char[] buffer = new char[1024];
        try {
            Reader reader = new BufferedReader(new InputStreamReader(in, "UTF-8"));
            int n;
            while ((n = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, n);
            }
        } finally {
        }
        return writer.toString();
    }
}



