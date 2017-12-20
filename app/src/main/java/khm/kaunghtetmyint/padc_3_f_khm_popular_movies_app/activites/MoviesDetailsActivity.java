package khm.kaunghtetmyint.padc_3_f_khm_popular_movies_app.activites;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;


import butterknife.BindView;
import butterknife.ButterKnife;
import khm.kaunghtetmyint.padc_3_f_khm_popular_movies_app.R;
import khm.kaunghtetmyint.padc_3_f_khm_popular_movies_app.adpater.MoviesDetailsAdapter;

/**
 * Created by User on 12/12/2017.
 */


public class MoviesDetailsActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolBar;

    @BindView(R.id.fab)
    FloatingActionButton floatingActionButton;

    @BindView(R.id.rv_popular_movies)
    RecyclerView rvPopularMovies;

    private MoviesDetailsAdapter moviesDetailsAdapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies_details);

        ButterKnife.bind(this,this);

        setSupportActionBar(toolBar);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null) {
            actionBar.setDisplayShowTitleEnabled(false);
        }

        moviesDetailsAdapter = new MoviesDetailsAdapter();

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(),
                                                        LinearLayoutManager.HORIZONTAL,false);
        rvPopularMovies.setLayoutManager(linearLayoutManager);
        rvPopularMovies.setAdapter(moviesDetailsAdapter);
     }
}
