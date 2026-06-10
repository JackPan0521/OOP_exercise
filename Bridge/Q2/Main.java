package Bridge.Q2;

public class Main {
    public static void main(String[] args) {
        AudioPlayer p = new MusicBox(new WAVPlayer() );
        p.display(); //顯示我是音樂盒
        p.play("music.wav" ); //顯示 "Playing WAV file: music.wav"

        p = new MobileMusicPlayer(new MP3Player() );
        p.display(); //顯示我是隨身聽
        p.play("music.mp3" ); //顯示 "Playing MP3 file: music.mp3"   
    }
}
