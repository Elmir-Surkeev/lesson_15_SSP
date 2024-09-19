
import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class JSONFileHandler {
    private static final Gson gson = new Gson();

    public static Computer[] getPlayer() {
        try (Reader reader = new FileReader("data.json")) {
            return gson.fromJson(reader, Computer[].class);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return new Computer[0];
    }

    public static void writePlayer(Computer[] players) {
        try (Writer writer = new FileWriter("data.json")){
            String json = gson.toJson(players);
            writer.write(json);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

}