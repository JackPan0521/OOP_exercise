package Bridge.Q2;

public class MusicBox extends AudioPlayer{
    public MusicBox(MusicPlayer mp){this.mp = mp;}
    public void display(){
        System.out.println("我是音樂盒");
    }
}
