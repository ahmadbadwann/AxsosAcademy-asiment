import java.util.HashMap;

public class SongListDemo {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<>();
        trackList.put("Starlight", "Hold you in my arms...");
        trackList.put("Uprising", "They will not force us...");
        trackList.put("Time is Running Out", "I think I'm drowning...");
        trackList.put("Supermassive Black Hole", "Ooh baby, don't you know I suffer...");
        String lyrics = trackList.get("Uprising");
        System.out.println("Lyrics of 'Uprising': " + lyrics);
        System.out.println("--------------------------");

        for (String track : trackList.keySet()) {
            System.out.println(track + ": " + trackList.get(track));
        }
    }
}
