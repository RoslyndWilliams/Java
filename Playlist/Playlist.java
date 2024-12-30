package Playlist;

import java.util.Arrays;
import java.util.ArrayList;

class Playlist {
    public static void main(String[] args)
    {

        //Create array: favoriteSongs
        String[] favoriteSongs = new String[]
                {"Queen - Bohemian Rhapsody",
                        "Shaboozey - A Bar Song",
                        "Teddy Swims - Lose Control",
                        "Missy Elliot - Lose Control",
                        "Aaliyah - Rock the Boat",
                        "Sabrina Carenter - Espresso",
                        "Post Malone - I Had Some Help",
                        "Morgan Wallen - Love Somebody",
                        "Chappell Roan - Good Luck Babe!",
                        "Sabrina Carpenter - Bed Chem"};

      /*
      System.out.println(favoriteSongs[0]);
      System.out.println(favoriteSongs[1]);
      System.out.println(favoriteSongs[2]);
      */

        //Create ArrayList: desertIslandPlaylist
        ArrayList<String> desertIslandPlaylist = new ArrayList<>();

        //Add elements to the ArrayList
        desertIslandPlaylist.add("Taylor Swift - Now That We Don't Talk");
        desertIslandPlaylist.add("Kendrick Lamar - TV Off");
        desertIslandPlaylist.add("Kendrick Lamar - Luther");
        desertIslandPlaylist.add("Carrie Underwood - I'm Gonna Love You");
        desertIslandPlaylist.add("Addison Rae - Diet Pepsi");

        //Print desertIslandPlaylist
        System.out.println(desertIslandPlaylist);

        //Add all of your Array's (favoriteSongs) elements to the islandDesertPlaylist ArrayList
        desertIslandPlaylist.addAll(Arrays.asList(favoriteSongs));

        //Check how many songs are in desertIslandPlaylist
        System.out.println(desertIslandPlaylist.size());


        //Remove 10 songs, leaving only 5
        for (int i = 9; i >= 0; i--)
            desertIslandPlaylist.remove(i);

        //Check how many songs are in desertIslandPlaylist after removing 10 songs
        System.out.println(desertIslandPlaylist.size());

        //Print the songs in desertIslandPlaylist
        System.out.println(desertIslandPlaylist);


        //Swap songs

        //Get 2 songs' indices
        System.out.println(desertIslandPlaylist.indexOf("Morgan Wallen - Love Somebody"));
        System.out.println(desertIslandPlaylist.indexOf("Sabrina Carenter - Espresso"));

        //Assign indices to variables
        int SongB = desertIslandPlaylist.indexOf("Morgan Wallen - Love Somebody");
        int SongA = desertIslandPlaylist.indexOf("Sabrina Carenter - Espresso");

        String tempA = "Sabrina Carenter - Espresso";
        desertIslandPlaylist.set(0, "Morgan Wallen - Love Somebody");

        //Print the ArrayList desertIslandSongs to see if the swap worked
        System.out.println(desertIslandPlaylist);

        //Swap out index 2 with tempA
        desertIslandPlaylist.set(2, tempA);

        //Print the ArrayList desertIslandSongs to see if the swap worked
        System.out.println(desertIslandPlaylist);
    }
}