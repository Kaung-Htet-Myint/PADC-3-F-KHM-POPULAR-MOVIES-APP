package khm.kaunghtetmyint.padc_3_f_khm_popular_movies_app.data.vo;

import java.util.List;

/**
 * Created by User on 12/20/2017.
 */

public class MoviesVO {

    private int voteCount;
    private int id;
    private boolean video;
    private float voteAverage;
    private String title;
    private double popularity;
    private String posterPath;
    private String originalLanguae;
    private String originalTitle;
    private List<Integer> genreId;
    private String backdropPack;
    private boolean adult;
    private String overView;
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
