package com.example.qrscan;

public class ArtPiece {
    private  int index;
    private String title;
    private String description;
    private int imageResId;

    public ArtPiece(String title, String description, int imageResId) {
        this.title = title;
        this.description = description;
        this.imageResId = imageResId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResId() {
        return imageResId;
    }
/*
    public String getAdditionalDescription(int index){
        switch(index){
            case 0:
                return String.valueOf(R.string.MonaLisa);
            case 1:
                return String.valueOf(R.string.StarryNight);
            case 2:
                return String.valueOf(R.string.ThePersistenceofMemory);
            case 3:
                return String.valueOf(R.string.TheScream);
            case 4:
                return String.valueOf(R.string.GirlwithaPearlEarring);
            case 5:
                return String.valueOf(R.string.TheNightWatch);
            case 6:
                return String.valueOf(R.string.TheBirthofVenus);
            case 7:
                return String.valueOf(R.string.TheLastSupper);
            case 8:
                return String.valueOf(R.string.Guernica);
            case 9:
                return String.valueOf(R.string.WaterLilies);



        }

        return "";
    }
*/

}