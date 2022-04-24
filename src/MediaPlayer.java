import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import javazoom.jl.player.*;

public class MediaPlayer {
    private File f;
    private Player player;


    public MediaPlayer(File f) {
        this.f = f;
    }

    public void setFilename (String name) {
        File f = new File(name);
        this.f = f;
    }


    public void play() {
        try {
            BufferedInputStream buffer = new BufferedInputStream(new FileInputStream(f));
            player = new Player(buffer);
            player.play();
        } catch (Exception e) {

            System.out.println(e);
        }

    }
}
