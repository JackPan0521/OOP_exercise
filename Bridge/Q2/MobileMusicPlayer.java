package Bridge.Q2;

public class MobileMusicPlayer extends AudioPlayer{
    public MobileMusicPlayer(MusicPlayer mp){this.mp = mp;}
    public void display(){
        System.out.println("我是隨身聽");
    }
}
