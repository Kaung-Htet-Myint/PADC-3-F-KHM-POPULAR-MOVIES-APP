package khm.kaunghtetmyint.padc_3_f_khm_popular_movies_app.data.models;

import khm.kaunghtetmyint.padc_3_f_khm_popular_movies_app.network.HttpUrlConnectionDataAgent;
import khm.kaunghtetmyint.padc_3_f_khm_popular_movies_app.network.MoviesDataAgent;

/**
 * Created by User on 1/1/2018.
 */

public class MoviesModel {

    private static  MoviesModel sObjInstance;
    private MoviesDataAgent mDataAgent;

    private MoviesModel(){
        mDataAgent = HttpUrlConnectionDataAgent.getsObjInstance();
    }

    public static MoviesModel getsObjInstance(){
        if(sObjInstance == null){
            sObjInstance = new MoviesModel();
        }
        return sObjInstance;
    }


    /**
     * Load movies data from network
     */
    public void loadNews(){
        mDataAgent.loadMoves();
    }

}
