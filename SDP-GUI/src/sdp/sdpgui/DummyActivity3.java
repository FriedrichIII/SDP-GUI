package sdp.sdpgui;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class DummyActivity3 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dummy_activity3);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_dummy_activity3, menu);
        return true;
    }
}
