package nee.software.gamedev;

import android.app.Activity;
import android.os.Bundle;

// TODO 1. will make default framework.
// TODO 2. will make "Character" module.
// TODO 3. will make "Map Mode" module.
// TODO 4. will make "Battle Mode" module.
public class MainScreenActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}