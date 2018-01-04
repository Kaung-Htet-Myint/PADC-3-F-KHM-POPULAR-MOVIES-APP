package khm.kaunghtetmyint.padc_3_f_khm_popular_movies_app.event;

import java.util.List;

import khm.kaunghtetmyint.padc_3_f_khm_popular_movies_app.data.vo.MoviesVO;

/**
 * Created by User on 1/1/2018.
 */

public class LoadedMoviesEvent {
    private List<MoviesVO> moviesList;

    public List<MoviesVO> getMoviesList(){
        return moviesList;
    }

    public LoadedMoviesEvent(List<MoviesVO> moviesList){ this.moviesList = moviesList; }
}
