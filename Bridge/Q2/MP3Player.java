package Bridge.Q2;

public class MP3Player implements MusicPlayer{
    public void play(String s){
        System.out.println("Playing MP3 file: "+s);
    }
}
