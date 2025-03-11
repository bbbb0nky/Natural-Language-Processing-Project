import java.util.ArrayList;
import java.util.Scanner;

/**
 * The Song class represents a collection of songs, allowing users to search for songs,
 * find their genres, and retrieve similar songs based on genre.
 */
public class Song {

  /*
  Steps:
  1. Create a scanner method that allows the user to find a song
  2. Traverse the songTitle ArrayList 
      If the song inputted matches a song from the ArrayList, return the song inputted
  3. Create a similar songs method that finds songs similar to the song inputted by traversing through the genre array
      Add the song into a separate playlist
      Get the genre from the index of the song the user inputted
  */
  
  private ArrayList<String> songTitle;  // Stores the list of song titles
  private ArrayList<String> songArtist; // Stores the list of corresponding artists
  private ArrayList<String> songGenre;  // Stores the list of corresponding genres
  
  //_________________________________________________________________\
  
  /**
   * Constructs a Song object by reading song titles, artists, and genres from files.
   * @param songFile the file containing song titles
   * @param artistFile the file containing artist names
   * @param genreFile the file containing genres
   */
  public Song(String songFile, String artistFile, String genreFile){
    this.songTitle = FileReader.toStringList(songFile);
    this.songArtist = FileReader.toStringList(artistFile);
    this.songGenre = FileReader.toStringList(genreFile);
  }

  /**
   * Gets the list of song titles.
   * @return an ArrayList of song titles
   */
  public ArrayList<String> getSong(){
    return songTitle;
  }

  /**
   * Gets the list of artists.
   * @return an ArrayList of artist names
   */
  public ArrayList<String> getArtist(){
    return songArtist;
  }

  //_________________________________________________________________\
  
  /**
   * Prompts the user to enter a song title and searches for it.
   * If found, asks if the user wants to see similar songs.
   */
  public void prompt(){
    Scanner input = new Scanner(System.in);
    System.out.println("What song are you looking for?");
    String songChoice = input.nextLine();
    if(confirmSong(songChoice)){
      String genre = findGenreOfSong(songChoice);
      
      System.out.println("Would you be interested in similar songs?");
      songChoice = input.nextLine();
      if(songChoice.equalsIgnoreCase("yes")){
        similarSongs(genre);
      }
    }
    System.out.print("Goodbye!");
    input.close();
  }

  //_________________________________________________________________\
  
  /**
   * Finds and returns the genre of the specified song.
   * @param songName the name of the song to find
   * @return the genre of the song, or null if not found
   */
  public String findGenreOfSong(String songName){
    String result = "";
    for(int i = 0 ; i < songTitle.size() ; i++){
      String onlyTitle = songTitle.get(i);
      if(songName.equalsIgnoreCase(onlyTitle)){
        result = songTitle.get(i) + " by " + songArtist.get(i) + " was found";
        System.out.println(result);
        return songGenre.get(i);
      }
    }
    return null;
  }

  /**
   * Checks if a given song exists in the song list.
   * @param songName the name of the song to check
   * @return true if the song is found, false otherwise
   */
  public boolean confirmSong(String songName){
    boolean found = false;
    for(int i = 0 ; i < songTitle.size() ; i++){
      if(songName.equalsIgnoreCase(songTitle.get(i))){
        found = true;
      }
    }
    return found;
  }
  
  /**
   * Finds and displays songs that are similar to the given genre.
   * @param genreOfSong the genre of the input song
   */
  public void similarSongs(String genreOfSong){
    String result = "";
    for(int i = 0 ; i < songGenre.size() ; i++){
      if(checkGenreForWord(songGenre.get(i), genreOfSong)){
        result += songTitle.get(i) + " by " + songArtist.get(i) + " || " + songGenre.get(i) + "\n";
      }
    }
    System.out.println("Similar Songs" + "\n" + result);
  }
  
  /**
   * Checks if the searchGenre is present within the given genre.
   * @param genre the genre to search within
   * @param searchGenre the genre being searched for
   * @return true if searchGenre is found within genre, false otherwise
   */
  private boolean checkGenreForWord(String genre, String searchGenre) {
      return genre.toLowerCase().contains(searchGenre.toLowerCase()); 
  }
 
  //_________________________________________________________________\
  
  /**
   * Returns a string representation of all songs in the list.
   * @return a string containing all song titles and artists
   */
  public String toString() {
    String result = "";
    for (int index = 0; index < songTitle.size(); index++) {
      result += songTitle.get(index) + " by " + songArtist.get(index) + "\n";
    }
    return result;
  }
}
