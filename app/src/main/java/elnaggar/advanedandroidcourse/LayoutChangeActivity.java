package elnaggar.advanedandroidcourse;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class LayoutChangeActivity extends AppCompatActivity {
    ViewGroup container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_changes);
        container= (ViewGroup) findViewById(R.id.container);
    }

    public void onAddItemClick(View view) {
        final View newView= LayoutInflater.from(this).inflate(R.layout.list_item_example,container,false);
        TextView textView= (TextView) newView.findViewById(R.id.text1);
        ImageButton imageButton= (ImageButton) newView.findViewById(R.id.delete_button);
        textView.setText(COUNTRIES[new Random().nextInt(COUNTRIES.length)]);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                container.removeView(newView);
            }
        });
        container.addView(newView,0);


    }
    private static final String[] COUNTRIES = new String[]{
            "Belgium", "France", "Italy", "Germany", "Spain",
            "Austria", "Russia", "Poland", "Croatia", "Greece",
            "Ukraine",
    };
}
