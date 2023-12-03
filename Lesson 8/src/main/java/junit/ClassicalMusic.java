package junit;

public class ClassicalMusic implements Music{
    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic(){
        return  new ClassicalMusic();
    }
    public void doInit(){
        System.out.println("DOING INITIALIZATION");
    }
    public void doDestroy(){
        System.out.println("DOING DESTRUCTION");
    }
    @Override
    public String getSong() {
        return "SONG classic";
    }
}
