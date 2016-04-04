package elnaggar.advanedandroidcourse.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.oguzdev.circularfloatingactionmenu.library.FloatingActionButton;
import com.oguzdev.circularfloatingactionmenu.library.FloatingActionMenu;
import com.oguzdev.circularfloatingactionmenu.library.SubActionButton;

import elnaggar.advanedandroidcourse.R;

public class FloatingActionMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_action_menu);

        ImageView imageView=new ImageView(this);
        imageView.setImageResource(R.drawable.ic_action_menu);

        FloatingActionButton floatingActionButton=new FloatingActionButton
                .Builder(this).setContentView(imageView).build();

        SubActionButton.Builder itemBuilder = new SubActionButton.Builder(this);

        ImageView itemIcon = new ImageView(this);
        itemIcon.setImageResource(R.drawable.ic_action_like);
        SubActionButton button1 = itemBuilder.setContentView(itemIcon).build();
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FloatingActionMenuActivity.this, "You clicked Like", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView itemIcon2 = new ImageView(this);
        itemIcon2.setImageResource(R.drawable.ic_action_share);
        SubActionButton button2 = itemBuilder.setContentView(itemIcon2).build();
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FloatingActionMenuActivity.this, "You clicked Share", Toast.LENGTH_SHORT).show();

            }
        });


        FloatingActionMenu actionMenu = new FloatingActionMenu.Builder(this)
                .addSubActionView(button1)
                .addSubActionView(button2)
                .attachTo(floatingActionButton)
                .build();



    }
}
