package sdp.sdpgui;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class DummyActivity2 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dummy_activity2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_dummy_activity2, menu);
        return true;
    }
}
