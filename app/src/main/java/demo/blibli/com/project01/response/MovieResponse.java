package demo.blibli.com.project01.response;

import com.google.gson.annotations.SerializedName;

public class MovieResponse {

    @SerializedName("poster_path")
    private String posterPath;
    private String title;
    @SerializedName("vote_average")
    private Double voteAverage;

    public MovieResponse(String posterPath, String title, Double voteAverage) {
        this.posterPath = posterPath;
        this.title = title;
        this.voteAverage = voteAverage;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(Double voteAverage) {
        this.voteAverage = voteAverage;
    }
}
