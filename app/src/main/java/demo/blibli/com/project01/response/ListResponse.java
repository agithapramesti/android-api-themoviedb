package demo.blibli.com.project01.response;

import java.util.List;

public class ListResponse<T> {

    private List<T> results;

    public ListResponse(List<T> results) {
        this.results = results;
    }

    public List<T> getResults() {
        return results;
    }

    public void setResults(List<T> results) {
        this.results = results;
    }
}
