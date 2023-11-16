package Listenify;

public class Song {
    private String songName;
    private  double duration;
    private  String  secretpassword;

    public Song(String songName, double duration, String secretpassword) {
        this.songName = songName;
        this.duration = duration;
        this.secretpassword = secretpassword;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }
    public void setSongName(String songName,String password) {

        if(password.equals(secretpassword)){
            this.songName = songName;
        }
        return;

    }


    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getSecretpassword() {
        return secretpassword;
    }

    public void setSecretpassword(String secretpassword) {
        this.secretpassword = secretpassword;
    }

    public String toString() {
        return "Song{" +
                "songName='" + songName + '\'' +
                ", duration=" + duration +
                '}';
    }
}
