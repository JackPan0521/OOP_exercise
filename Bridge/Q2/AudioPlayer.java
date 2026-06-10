package Bridge.Q2;

abstract class AudioPlayer implements MusicPlayer{
    protected MusicPlayer mp;
    abstract void display();
    public void play(String s){mp.play(s);}
}
