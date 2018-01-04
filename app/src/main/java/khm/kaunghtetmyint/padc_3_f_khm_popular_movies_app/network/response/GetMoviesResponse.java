package khm.kaunghtetmyint.padc_3_f_khm_popular_movies_app.network.response;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Since;

import java.util.List;

import khm.kaunghtetmyint.padc_3_f_khm_popular_movies_app.data.vo.MoviesVO;

/**
 * Created by User on 1/1/2018.
 */

public class GetMoviesResponse {

    private int code;
    private String message;
    private String apiVersion;
    private String page;

    @SerializedName("popular-movies")
    private List<MoviesVO> popularMovies;


    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public String getPage() {
        return page;
    }

    public List<MoviesVO> getPopularMovies() {
        return popularMovies;
    }


}