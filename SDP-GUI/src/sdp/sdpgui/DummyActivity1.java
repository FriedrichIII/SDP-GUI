package sdp.sdpgui;

import android.os.Build;
import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.view.Menu;

public class DummyActivity1 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dummy);
        
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH){
        	
        }else if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB){
        	ActionBar actionBar= getActionBar();
        	actionBar.setHomeButtonEnabled(true);
        }
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_dummy, menu);
        return true;
    }
}
