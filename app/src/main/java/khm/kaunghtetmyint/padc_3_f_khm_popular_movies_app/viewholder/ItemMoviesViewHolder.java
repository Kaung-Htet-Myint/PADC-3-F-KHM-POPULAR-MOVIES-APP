package khm.kaunghtetmyint.padc_3_f_khm_popular_movies_app.viewholder;

import android.support.v4.media.VolumeProviderCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import khm.kaunghtetmyint.padc_3_f_khm_popular_movies_app.R;
import khm.kaunghtetmyint.padc_3_f_khm_popular_movies_app.activites.MoviesDetailsActivity;
import khm.kaunghtetmyint.padc_3_f_khm_popular_movies_app.data.vo.MoviesVO;
import khm.kaunghtetmyint.padc_3_f_khm_popular_movies_app.delegates.MoviesActionDelegates;

/**
 * Created by User on 12/5/2017.
 */

public class ItemMoviesViewHolder extends RecyclerView.ViewHolder {

    public MoviesActionDelegates mMoviesActionDelegates;

    @BindView(R.id.tv_movie_name)
    TextView tvMovieName;

    @BindView(R.id.iv_movie)
    ImageView ivMovie;

    @BindView(R.id.tv_movie_type)
    TextView tvMovieType;

    @BindView(R.id.tv_favorite)
    TextView tvFavorite;

    @BindView(R.id.rb_stars)
    RatingBar rbStars;

    public ItemMoviesViewHolder(View itemView,MoviesActionDelegates moviesActionDelegates) {
        super(itemView);

        ButterKnife.bind(this,itemView);

        mMoviesActionDelegates = moviesActionDelegates;
    }

    @OnClick(R.id.cv_item_movies_root)
    public void onMovesItemTap(View view){
//        Toast.makeText(view.getContext(),"Movies Item Clicked",Toast.LENGTH_LONG).show();

        mMoviesActionDelegates.onTapMoviesItem();
    }

    public void setMovies(MoviesVO movies){
        tvMovieName.setText(movies.getTitle());
        tvMovieType.setText(movies.getGenreId().toString());

        Glide.with(ivMovie.getContext())
                .load(movies.getPosterPath())
                .into(ivMovie);

    }
}
