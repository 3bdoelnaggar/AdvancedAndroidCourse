package elnaggar.advanedandroidcourse;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class MaterialActivity extends AppCompatActivity {
    ArrayList<String>tabsTitls=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        tabsTitls.add("Tab1");
        tabsTitls.add("Tab2");
        tabsTitls.add("Tab3");
        tabsTitls.add("Tab4");
        tabsTitls.add("Tab5");
        tabsTitls.add("Tab6");
        tabsTitls.add("Tab7");
        ViewPager viewPager= (ViewPager) findViewById(R.id.viewpager);
        TabLayout tabLayout= (TabLayout) findViewById(R.id.sliding_tabs);
        PagerTabsAdapter pagerTabsAdapter=new PagerTabsAdapter(getSupportFragmentManager(),tabsTitls);
        viewPager.setAdapter(pagerTabsAdapter);
        tabLayout.setupWithViewPager(viewPager);
        for(int i=0;i<tabLayout.getTabCount();i++){
            tabLayout.getTabAt(i).setIcon(R.drawable.happy_face);
        }
    }

}
