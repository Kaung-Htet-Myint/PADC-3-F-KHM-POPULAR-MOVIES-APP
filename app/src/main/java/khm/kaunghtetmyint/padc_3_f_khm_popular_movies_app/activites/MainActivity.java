package khm.kaunghtetmyint.padc_3_f_khm_popular_movies_app.activites;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import butterknife.BindView;
import butterknife.ButterKnife;
import khm.kaunghtetmyint.padc_3_f_khm_popular_movies_app.MoviesApp;
import khm.kaunghtetmyint.padc_3_f_khm_popular_movies_app.R;
import khm.kaunghtetmyint.padc_3_f_khm_popular_movies_app.adpater.PopularMovieAdapter;
import khm.kaunghtetmyint.padc_3_f_khm_popular_movies_app.data.models.MoviesModel;
import khm.kaunghtetmyint.padc_3_f_khm_popular_movies_app.delegates.MoviesActionDelegates;
import khm.kaunghtetmyint.padc_3_f_khm_popular_movies_app.event.LoadedMoviesEvent;

public class MainActivity extends AppCompatActivity implements MoviesActionDelegates{

    @BindView(R.id.rv_popular_movies)
    RecyclerView rvPopularMovies;

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.fab)
    FloatingActionButton floatingActionButton;

    private PopularMovieAdapter movieAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ButterKnife.bind(this,this);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        /*fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        movieAdapter = new PopularMovieAdapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(),
                LinearLayoutManager.VERTICAL, false);

        rvPopularMovies.setLayoutManager(linearLayoutManager);

        rvPopularMovies.setAdapter(movieAdapter);

        MoviesModel.getsObjInstance().loadNews();
    }


    @Override
    protected void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onTapMoviesItem() {
        Intent intent =new Intent(getApplication(),MoviesDetailsActivity.class);
        startActivity(intent);
    }

    @Override
    public void onTapMovieOverviewButton() {

    }

    @Override
    public void onTapCropButton() {

    }

    @Override
    public void onTapFavoriteButton() {

    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMoviesLoaded(LoadedMoviesEvent event){
        Log.d(MoviesApp.LOG_TAG,"onMoviesLoaded :"+event.getMoviesList().size());
        movieAdapter.setmMoviesList(event.getMoviesList());
    }

}
