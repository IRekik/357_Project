public class Main {
    public static void main(String[] args) {
        MP3FileManager am = new MP3FileManager();
        MediaPlayer player = new MediaPlayer(am.getRandomNote());
        player.play();
    }
}
