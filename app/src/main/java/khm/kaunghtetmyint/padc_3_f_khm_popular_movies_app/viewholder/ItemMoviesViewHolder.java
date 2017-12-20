package khm.kaunghtetmyint.padc_3_f_khm_popular_movies_app.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;
import khm.kaunghtetmyint.padc_3_f_khm_popular_movies_app.R;
import khm.kaunghtetmyint.padc_3_f_khm_popular_movies_app.activites.MoviesDetailsActivity;
import khm.kaunghtetmyint.padc_3_f_khm_popular_movies_app.delegates.MoviesActionDelegates;

/**
 * Created by User on 12/5/2017.
 */

public class ItemMoviesViewHolder extends RecyclerView.ViewHolder {

    public MoviesActionDelegates mMoviesActionDelegates;

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
}
