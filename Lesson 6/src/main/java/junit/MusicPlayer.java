package junit;
import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    private  List<Music> musicList = new ArrayList<>();
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    private  int volume;
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }
    public  MusicPlayer (){}
//    public  void  setMusic(Music music){
//        this.music = music;
//    }
    public void  playMusic(){
        for (Music music: musicList){
            System.out.println("Playing: "+music.getSong());
        }
    }
}
