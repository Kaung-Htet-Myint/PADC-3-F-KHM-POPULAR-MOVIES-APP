package khm.kaunghtetmyint.padc_3_f_khm_popular_movies_app.data.vo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by User on 12/20/2017.
 */

public class MoviesVO {

    @SerializedName("vote_count")
    private int voteCount;

    private int id;
    private boolean video;

    @SerializedName("vote_average")
    private float voteAverage;

    private String title;
    private double popularity;

    @SerializedName("poster_path")
    private String posterPath;

    @SerializedName("original_language")
    private String originalLanguae;

    @SerializedName("original_title")
    private String originalTitle;

    @SerializedName("genre_ids")
    private List<Integer> genreId;

    @SerializedName("backdrop_path")
    private String backdropPack;

    private boolean adult;

    @SerializedName("overview")
    private String overView;

    @SerializedName("release_date")
    private String releaseDate;

    public List<Integer> getGenreId() {
        return genreId;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public int getId() {
        return id;
    }

    public boolean isVideo() {
        return video;
    }

    public float getVoteAverage() {
        return voteAverage;
    }

    public String getTitle() {
        return title;
    }

    public double getPopularity() {
        return popularity;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public String getOriginalLanguae() {
        return originalLanguae;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }



    public String getBackdropPack() {
        return backdropPack;
    }

    public boolean isAdult() {
        return adult;
    }

    public String getOverView() {
        return overView;
    }

    public String getReleaseDate() {
        return releaseDate;
    }


}