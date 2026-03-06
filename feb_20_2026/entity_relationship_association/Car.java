package feb_20_2026.entity_relationship_association;

public class Car {

    private String brand;
    private String name;
    private String make;
    private double price;

    // Association
    private Engine engine;
    private MediaPlayer mediaPlayer;

    // Constructor Injection (Engine association)
    public Car(String brand, String name, String make, double price, Engine engine) {
        this.brand = brand;
        this.name = name;
        this.make = make;
        this.price = price;
        this.engine = engine;
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public String getMake() {
        return make;
    }

    public double getPrice() {
        return price;
    }

    public Engine getEngine() {
        return engine;
    }

    public MediaPlayer getMediaPlayer() {
        return mediaPlayer;
    }

    // Setter Injection (MediaPlayer association)
    public void setMediaPlayer(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    public void displayCarDetails() {
        System.out.println("Car Details:");
        System.out.println("---------------------");
        System.out.println("Brand: " + brand);
        System.out.println("Name: " + name);
        System.out.println("Make: " + make);
        System.out.println("Price: " + price);
        System.out.println();

        if (engine != null) {
            engine.displayEngineDetails();
        } else {
            System.out.println("No Engine Attached.");
        }

        if (mediaPlayer != null) {
            mediaPlayer.displayMediaPlayerDetails();
        } else {
            System.out.println("No Media Player Installed.");
        }
    }
}