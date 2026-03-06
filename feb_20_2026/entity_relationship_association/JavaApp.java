package feb_20_2026.entity_relationship_association;

public class JavaApp {

    public static void execution() {

        // Create Engine (Independent object)
        Engine engine = new Engine(1500, "Water Based", 4);

        // Constructor Injection (Association)
        Car car = new Car("Hyundai", "Creta", "Made in India", 963963.96, engine);

        // Create MediaPlayer
        MediaPlayer mediaPlayer = new MediaPlayer("Boat", "Music Player", 369369.36);

        // Setter Injection (Association)
        car.setMediaPlayer(mediaPlayer);

        // Display Complete Details
        car.displayCarDetails();
    }
}