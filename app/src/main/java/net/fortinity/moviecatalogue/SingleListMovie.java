package net.fortinity.moviecatalogue;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SingleListMovie extends AppCompatActivity {

    ImageView photo;
    TextView title, description;

    public static final String EXTRA_MOVIE = "extra_movie";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_list_movie);

        photo = findViewById(R.id.gambar_movie);
        title = findViewById(R.id.judul_movie);
        description = findViewById(R.id.deskripsi_movie);

        Movie selectedMovie = getIntent().getParcelableExtra(EXTRA_MOVIE);

        if (selectedMovie != null) {
            photo.setImageResource(selectedMovie.getPhoto());
            title.setText(selectedMovie.getName());
            description.setText(selectedMovie.getDescription());
        }
    }
}
