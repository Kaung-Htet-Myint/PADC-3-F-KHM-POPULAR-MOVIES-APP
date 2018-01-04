package khm.kaunghtetmyint.padc_3_f_khm_popular_movies_app.adpater;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import khm.kaunghtetmyint.padc_3_f_khm_popular_movies_app.R;
import khm.kaunghtetmyint.padc_3_f_khm_popular_movies_app.data.vo.MoviesVO;
import khm.kaunghtetmyint.padc_3_f_khm_popular_movies_app.delegates.MoviesActionDelegates;
import khm.kaunghtetmyint.padc_3_f_khm_popular_movies_app.viewholder.ItemMoviesViewHolder;

/**
 * Created by User on 12/5/2017.
 */

public class PopularMovieAdapter extends RecyclerView.Adapter<ItemMoviesViewHolder> {

    private MoviesActionDelegates mMoviesActionDelegates;
    private List<MoviesVO> mMoviesList;


    public void setmMoviesList(List<MoviesVO> moviesList) {
        mMoviesList = moviesList;
        notifyDataSetChanged();
    }


    public PopularMovieAdapter(MoviesActionDelegates moviesActionDelegates){
        mMoviesActionDelegates = moviesActionDelegates;
        mMoviesList = new ArrayList<>();
    }
    @Override
    public ItemMoviesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View moviesItemView = inflater.inflate(R.layout.item_movies, parent ,false);
        ItemMoviesViewHolder itemMoviesViewHolder = new ItemMoviesViewHolder(moviesItemView, mMoviesActionDelegates);

        return itemMoviesViewHolder;
    }

    @Override
    public void onBindViewHolder(ItemMoviesViewHolder holder, int position) {
            holder.setMovies(mMoviesList.get(position));
    }

    @Override
    public int getItemCount() {
        return mMoviesList.size();
    }
}
