package com.example.qrscan;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class Log extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<ArtPiece> artPieces = new ArrayList<>();
        artPieces.add(new ArtPiece("Mona Lisa", "A portrait by Leonardo da Vinci", R.drawable.mona_lisa));
        artPieces.add(new ArtPiece("Starry Night", "A painting by Vincent van Gogh", R.drawable.starry_night));
        artPieces.add(new ArtPiece("The Persistence of Memory", "A painting by Salvador Dalí", R.drawable.the_persistence_of_memory));
        artPieces.add(new ArtPiece("The Scream", "An iconic painting by Edvard Munch", R.drawable.the_scream));
        artPieces.add(new ArtPiece("Girl with a Pearl Earring", "A painting by Johannes Vermeer", R.drawable.girl_with_a_pearl_earring));
        artPieces.add(new ArtPiece("The Night Watch", "A painting by Rembrandt", R.drawable.the_night_watch));
        artPieces.add(new ArtPiece("The Birth of Venus", "A painting by Sandro Botticelli", R.drawable.the_birth_of_venus));
        artPieces.add(new ArtPiece("The Last Supper", "A mural painting by Leonardo da Vinci", R.drawable.the_last_supper));
        artPieces.add(new ArtPiece("Guernica", "A mural-sized painting by Pablo Picasso", R.drawable.guernica));
        artPieces.add(new ArtPiece("Water Lilies", "A series of paintings by Claude Monet", R.drawable.water_lilies));

        ArtPieceAdapter adapter = new ArtPieceAdapter(this, artPieces);
        recyclerView.setAdapter(adapter);
    }
}
