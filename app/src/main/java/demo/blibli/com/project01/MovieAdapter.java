package demo.blibli.com.project01;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import demo.blibli.com.project01.response.MovieResponse;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {


    // nah adapter butuh megang data maka:
    private List<MovieResponse> data;

    class MovieViewHolder extends RecyclerView.ViewHolder{

        ImageView imagePoster;
        TextView textRating;

        public MovieViewHolder(View itemView) {
            super(itemView);
            imagePoster = itemView.findViewById(R.id.imageView4);
            textRating = itemView.findViewById(R.id.textView7);
        }
    }

    public MovieAdapter(List<MovieResponse> data) {
        this.data = data;
    }

    @NonNull
    @Override // disini kita parsing xml yg item list movie
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list_movie, parent,false);
        return new MovieViewHolder(itemView);
    }

    @Override // ngemapping antara data dan item list movienya
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        MovieResponse item = data.get(position);
        holder.textRating.setText(String.valueOf(item.getVoteAverage()));
    }

    @Override // jumlah item di listnya berapa
    public int getItemCount() {
        return data.size();
    }

}
