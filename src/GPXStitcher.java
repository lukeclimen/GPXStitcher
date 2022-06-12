import java.io.*;
import java.nio.charset.StandardCharsets;

public class GPXStitcher {

    String timestamp;

    public static void main(String args[])  {
        try {
            FileReader file1 = new FileReader("./First_Part.gpx", StandardCharsets.UTF_8);
            FileReader file2 = new FileReader("./Second_Part.gpx", StandardCharsets.UTF_8);

            File finalFile = new File("./Final.gpx");
            boolean successful = finalFile.createNewFile();
            if (successful){
                System.out.println("File has been created");
                copyContent(file1, finalFile);
            }
            else
                System.out.println("File already exists");
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void copyContent (FileReader file1,  File finalFile) {
        String lineToCopy;
        BufferedReader fileToRead = new BufferedReader(file1);

        try {
            FileWriter stitcher = new FileWriter(finalFile);

            for (int i = 0; i < 7990; i++) {
                lineToCopy = fileToRead.readLine();
                stitcher.write(lineToCopy);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void fileStitcher (FileReader file1,  File finalFile) {
        int lineToCopy;

        try {
            BufferedWriter stitcher = new BufferedWriter(new FileWriter(finalFile));
            for (int i = 0; i < 7990; i++) {
                lineToCopy = file1.read();
                stitcher.write(lineToCopy);
                stitcher.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


