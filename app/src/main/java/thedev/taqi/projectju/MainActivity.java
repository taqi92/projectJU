package thedev.taqi.projectju;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button iit,stat,cse,env;

        iit = (Button) findViewById(R.id.iit);
        iit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,InfoActivity.class);
                i.putExtra("LAYOUT", R.layout.iit);
                startActivity(i);
            }
        });

        stat = (Button) findViewById(R.id.stat);
        stat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,InfoActivity.class);
                i.putExtra("LAYOUT", R.layout.statistics);
                startActivity(i);
            }
        });

        cse = (Button) findViewById(R.id.cse);
        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,InfoActivity.class);
                i.putExtra("LAYOUT", R.layout.cse);
                startActivity(i);
            }
        });

        env = (Button) findViewById(R.id.env);
        env.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,InfoActivity.class);
                i.putExtra("LAYOUT", R.layout.env);
                startActivity(i);
            }
        });





    }
}
