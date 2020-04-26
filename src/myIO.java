import java.io.*;
import java.util.Scanner;

public class myIO implements Communications {

    private String outputPath;
    private Scanner scanner;

    public myIO(String intputPath, String outputPath) {
        this.outputPath = outputPath;
        File file = new File(intputPath);
        try {
            scanner = new Scanner(file);
            new FileWriter(outputPath, false).close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String readLine() {
        if (scanner.hasNextLine()){
            return scanner.nextLine();
        }
        return null;
    }

    @Override
    public void writeLine(String line) {
        try {
            Writer output = new BufferedWriter(new FileWriter(outputPath, true));
            output.append(line);
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
