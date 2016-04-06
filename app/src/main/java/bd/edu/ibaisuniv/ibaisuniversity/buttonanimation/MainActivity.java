package bd.edu.ibaisuniv.ibaisuniversity.buttonanimation;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final Animation animTranslate = AnimationUtils.loadAnimation(this,
                R.anim.anim_translate);

        final Animation animAlpha = AnimationUtils.loadAnimation(this,
                R.anim.anim_alpha);

        final Animation animScale = AnimationUtils.loadAnimation(this,
                R.anim.anim_scale);

        final Animation animRotate = AnimationUtils.loadAnimation(this,
                R.anim.anim_rotate);

        Button btnTranslate = (Button) findViewById(R.id.translate);
        Button btnAlpha = (Button) findViewById(R.id.alpha);
        Button btnScale = (Button) findViewById(R.id.scale);
        Button btnRotate = (Button) findViewById(R.id.rotate);
        Button btnComplex = (Button) findViewById(R.id.complex);

        btnTranslate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                v.startAnimation(animTranslate);
            }
        });

        btnAlpha.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                v.startAnimation(animAlpha);
            }
        });

        btnScale.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                v.startAnimation(animScale);
            }
        });

        btnRotate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                v.startAnimation(animRotate);
            }
        });

        btnComplex.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                AnimationSet sets = new AnimationSet(false);
                sets.addAnimation(animAlpha);
                sets.addAnimation(animScale);
                sets.addAnimation(animRotate);
                v.startAnimation(sets);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
