package elnaggar.advanedandroidcourse.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import elnaggar.advanedandroidcourse.R;
import elnaggar.advanedandroidcourse.models.Player;

/**
 * Created by Elnaggar on 04/04/2016.
 */
public class PlayersAdapter extends RecyclerView.Adapter<PlayersAdapter.MyHolder> {
    private final Context context;
    private final ArrayList<Player> players;

    public PlayersAdapter(Context context,ArrayList<Player> players){
        this.context=context;
        this.players=players;
    }
    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.custom_player_item,parent,false);
        MyHolder myHolder=new MyHolder(view);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        holder.pic.setImageResource(players.get(position).getImageResourceId());
        holder.name.setText(players.get(position).getName());
        holder.age.setText(""+players.get(position).getAge());

    }

    @Override
    public int getItemCount() {
        return players.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        ImageView pic;
        TextView name;
        TextView age;
        public MyHolder(View itemView) {
            super(itemView);
            pic = (ImageView) itemView.findViewById(R.id.imageView_pic);
            name = (TextView) itemView.findViewById(R.id.textView_name);
            age = (TextView) itemView.findViewById(R.id.textView_age);
        }
    }
}
