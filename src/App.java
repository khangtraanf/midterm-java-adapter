public class App {
    public static void main(String[] args) {
        MediaPlayer player1 = new MediaAdapter("vlc");
        player1.play("vlc", "movie.vlc");

        MediaPlayer player2 = new MediaAdapter("mp4");
        player2.play("mp4", "video.mp4");
    }
}