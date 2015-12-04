package elnaggar.advanedandroidcourse;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LessonsActivity extends ListActivity {

    String []classes={"elnaggar.advanedandroidcourse.MainActivity","elnaggar.advanedandroidcourse.CrossfadeActivity"};
    String []names={"View Pager","Cross Fade Animition"};

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        try {
            Class aClass=Class.forName(classes[position]);
            Intent intent=new Intent(this,aClass);
            startActivity(intent);
            this.finish();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names));

    }

}
