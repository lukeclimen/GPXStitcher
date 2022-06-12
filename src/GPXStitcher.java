import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class GPXStitcher {

    public static void main(String args[])  {
        try {
            FileReader file1 = new FileReader("./First_Part.gpx");
            FileReader file2 = new FileReader("./First_Part.gpx");
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}


