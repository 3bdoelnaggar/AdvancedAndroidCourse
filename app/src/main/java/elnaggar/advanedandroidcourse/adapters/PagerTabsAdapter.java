package elnaggar.advanedandroidcourse.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

import elnaggar.advanedandroidcourse.fragments.PageFragment;

/**
 * Created by Elnaggar on 01/12/2015.
 */
public class PagerTabsAdapter extends FragmentStatePagerAdapter {
    private final ArrayList<String> titles;

    public PagerTabsAdapter(FragmentManager fm, ArrayList<String> titles) {
        super(fm);
        this.titles = titles;

    }

    @Override
    public Fragment getItem(int position) {
        return PageFragment.newInstance(titles.get(position));
    }

    @Override
    public int getCount() {
        return titles.size();
    }

}
