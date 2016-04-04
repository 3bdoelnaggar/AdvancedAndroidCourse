package elnaggar.advanedandroidcourse.activities;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import elnaggar.advanedandroidcourse.R;

public class CardFlipActivity extends AppCompatActivity {
    boolean isBackShow=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_flip);
        getFragmentManager().beginTransaction().replace(R.id.container,new CardFrontFragment()).commit();


    }

    public void onFlipClick(View view) {
        if(isBackShow){
            getFragmentManager().beginTransaction().setCustomAnimations(R.animator.card_flip_right_in,R.animator.card_flip_right_out)
                    .replace(R.id.container,new CardFrontFragment()).commit();
            isBackShow=false;
        }else{
            getFragmentManager().beginTransaction().setCustomAnimations(R.animator.card_flip_right_in,R.animator.card_flip_right_out)
                    .replace(R.id.container,new CardBackFragment()).commit();
            isBackShow=true;
        }



    }




    public static class CardFrontFragment extends Fragment {
        public CardFrontFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            return inflater.inflate(R.layout.fragment_card_front, container, false);
        }
    }

    public static class CardBackFragment extends Fragment {
        public CardBackFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            return inflater.inflate(R.layout.fragment_card_back, container, false);
        }
    }
}
