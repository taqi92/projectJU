package thedev.taqi.projectju;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        int layout=getIntent().getIntExtra("LAYOUT", 0);
        setContentView(layout);

    }
}
