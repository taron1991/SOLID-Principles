package dependencyinversion;

/**
 * 5 принцип SOLID гласит: Компоненты должны зависеть от абстракций нежели иметь конкретную реализацию!
 */
public interface Music {
String song();
}
class ClassicMusic implements Music{

    @Override
    public String song() {
        return "classicmusic";
    }
}
class RockMusic implements Music{
    @Override
    public String song() {
        return "rockmusic";
    }
}
class JazzMusic implements Music{
    @Override
    public String song() {
        return "jazzmusic";
    }
}
class Singer{
    public Music music;

    public Singer(Music music) {
        this.music = music;
    }

    public Music getMusic() {
        return music;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "music=" + music +
                '}';
    }

    public void setMusic(Music music) {
        this.music = music;
    }
}
