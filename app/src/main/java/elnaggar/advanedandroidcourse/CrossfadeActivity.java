package elnaggar.advanedandroidcourse;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class CrossfadeActivity extends AppCompatActivity {
    ImageView mFadeImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crossfade);
        mFadeImageView= (ImageView) findViewById(R.id.fadeImageView);
    }

    public void onFadeClick(View view) {
        mFadeImageView.setAlpha(0f);
        mFadeImageView.setVisibility(View.VISIBLE);
        mFadeImageView.animate().alpha(1f).setDuration(5000).setListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
                Toast.makeText(CrossfadeActivity.this, "Done Anmition", Toast.LENGTH_SHORT).show();
            }
        });



    }
}
