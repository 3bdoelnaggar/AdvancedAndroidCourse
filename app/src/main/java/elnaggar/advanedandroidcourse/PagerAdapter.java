package elnaggar.advanedandroidcourse;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

/**
 * Created by Elnaggar on 01/12/2015.
 */
public class PagerAdapter extends FragmentStatePagerAdapter {
    private final ArrayList<String> photos;

    public PagerAdapter(FragmentManager fm, ArrayList<String> Photes) {
        super(fm);
        this.photos=Photes;

    }

    @Override
    public Fragment getItem(int position) {
        return BlankFragment.newInstance(photos.get(position));
    }

    @Override
    public int getCount() {
        return photos.size();
    }
}
