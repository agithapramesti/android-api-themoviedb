package demo.blibli.com.project01.retrovit;

import demo.blibli.com.project01.response.ListResponse;
import demo.blibli.com.project01.response.MovieResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieService {

    @GET("movie/popular")
    Call<ListResponse<MovieResponse>> findPopularMovies(@Query("api_key") String apiKey);
    // ini supaya ngewrap response yg asyncronus
}
