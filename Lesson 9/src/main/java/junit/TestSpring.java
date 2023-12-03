package junit;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music = context.getBean("rockMusic",Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();
        Music music2 = context.getBean("classicalMusic",Music.class);
        MusicPlayer musicPlayer2 = new MusicPlayer(music2);
        musicPlayer2.playMusic();
        Music music3 = context.getBean("sakhaMusic",Music.class);
        MusicPlayer musicPlayer3 = new MusicPlayer(music3);
        musicPlayer3.playMusic();
        context.close();
    }
}
