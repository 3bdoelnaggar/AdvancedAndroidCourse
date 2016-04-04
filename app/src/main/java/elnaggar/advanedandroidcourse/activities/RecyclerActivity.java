package elnaggar.advanedandroidcourse.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import elnaggar.advanedandroidcourse.R;
import elnaggar.advanedandroidcourse.adapters.PlayersAdapter;
import elnaggar.advanedandroidcourse.models.Player;

public class RecyclerActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        recyclerView = (RecyclerView) findViewById(R.id.rec_players);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new PlayersAdapter(this,createPlayerArrayList()));
    }

    ArrayList<Player> createPlayerArrayList() {
        ArrayList<Player> players = new ArrayList<>();
        Player player1 = new Player();
        player1.setName("Salah");
        player1.setAge(35);
        player1.setImageResourceId(R.drawable.salah);
        players.add(player1);
        Player player2 = new Player();
        player2.setName("Treka");
        player2.setAge(35);
        player2.setImageResourceId(R.drawable.trika);
        players.add(player2);
        Player player3 = new Player();
        player3.setName("Zedan");
        player3.setAge(35);
        player3.setImageResourceId(R.drawable.zedan);
        players.add(player3);
        Player player4 = new Player();
        player4.setName("Yaya");
        player4.setAge(35);
        player4.setImageResourceId(R.drawable.yaya);
        players.add(player4);
        Player player5 = new Player();
        player5.setName("UnKnown For Me");
        player5.setAge(35);
        player5.setImageResourceId(R.drawable.muslim);
        players.add(player5);
        return players;
    }
}
