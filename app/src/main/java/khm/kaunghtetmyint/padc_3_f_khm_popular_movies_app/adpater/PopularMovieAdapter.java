package khm.kaunghtetmyint.padc_3_f_khm_popular_movies_app.adpater;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import khm.kaunghtetmyint.padc_3_f_khm_popular_movies_app.R;
import khm.kaunghtetmyint.padc_3_f_khm_popular_movies_app.viewholder.ItemMoviesViewHolder;

/**
 * Created by User on 12/5/2017.
 */

public class PopularMovieAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View moviesItemView = inflater.inflate(R.layout.item_movies, parent ,false);
        ItemMoviesViewHolder itemMoviesViewHolder = new ItemMoviesViewHolder(moviesItemView);

        return itemMoviesViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 16;
    }
}
