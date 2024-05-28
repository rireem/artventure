package com.example.qrscan;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ArtPieceAdapter extends RecyclerView.Adapter<ArtPieceAdapter.ArtPieceViewHolder> {

    private List<ArtPiece> artPieces;
    private Context context;

    public ArtPieceAdapter(Context context, List<ArtPiece> artPieces) {
        this.context = context;
        this.artPieces = artPieces;
    }

    @NonNull
    @Override
    public ArtPieceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.artpiece, parent, false);
        return new ArtPieceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ArtPieceViewHolder holder, int position) {
        ArtPiece artPiece = artPieces.get(position);
        holder.artTitleTextView.setText(artPiece.getTitle());
        holder.artDescriptionTextView.setText(artPiece.getDescription());
        holder.artImageView.setImageResource(artPiece.getImageResId());

        // Optionally handle click if needed
        // holder.itemView.setOnClickListener(v -> {
        //     Intent intent = new Intent(context, displayExtraDescriptions.class);
        //     intent.putExtra("INDEX", position); // Pass the index of the current item
        //     context.startActivity(intent);
        // });
    }

    @Override
    public int getItemCount() {
        return artPieces.size();
    }

    static class ArtPieceViewHolder extends RecyclerView.ViewHolder {
        ImageView artImageView;
        TextView artTitleTextView;
        TextView artDescriptionTextView;

        public ArtPieceViewHolder(@NonNull View itemView) {
            super(itemView);
            artImageView = itemView.findViewById(R.id.artImageView);
            artTitleTextView = itemView.findViewById(R.id.artTitleTextView);
            artDescriptionTextView = itemView.findViewById(R.id.artDescriptionTextView);
        }
    }
}
