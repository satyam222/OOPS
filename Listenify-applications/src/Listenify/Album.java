package Listenify;
import java.util.ArrayList;
import java.util.List;

public class Album {
    private String singerName;
    private List<Song> songList;
    //constructor for new singer
    public Album(String singerName){
        this.singerName = singerName;
        this.songList = new ArrayList<>();
    }
    //constructor for old singer which have already some song in  song list
    public Album(String singerName, List<Song> songList) {
        this.singerName = singerName;
        this.songList = songList;
    }

    //searching song in list

    public boolean findSongInAlbum(String songName){

        //Return T/F
        for(Song song : songList){
            if(song.getSongName().equals(songName)){
                return true;
            }
        }
        return false;
    }
    //Add song to playList
    public String addSongToAlbum(String songName,double duration,String password){

        if(findSongInAlbum(songName)){
            return "Song is already present in Album";
        }

        Song newSong = new Song(songName,duration,password);
        songList.add(newSong);
        return "New Song has been added";
    }
    //add song to playlist by song no and song name
    public String addSongToPlayList(int songNo,List<Song> playList){

        int index = songNo -1;

        if(index>=0 && index<songList.size()){

            Song songObj = songList.get(index);
            playList.add(songObj);
            return "Song has been added to the playList";
        }

        return "Song no entered is Invalid";
    }
    //add to playlist by song name

    public String addSongToPlayList(String songName,List<Song> playList) {

        for(Song song : songList){
            if(song.getSongName().equals(songName)){
                playList.add(song);
                return "Song added to PlayList";
            }
        }

        return "No song with this songName existed in the album SongList";

    }



}
