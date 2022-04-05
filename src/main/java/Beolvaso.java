import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Beolvaso {

    static ArrayList<String> beolvaso()
    {
        ArrayList<String> inputString = new ArrayList<>();
        RandomAccessFile input;

        try
        {
            input = new RandomAccessFile("src/main/resources/input.txt", "r");
            while (input.getFilePointer() < input.length())
            {
                inputString.add(input.readLine());
            }
            input.close();
        }
        catch (FileNotFoundException f)
        {
            System.out.println("Hoppá, valami nem jó! " + f.getMessage());
        }
        catch (IOException e)
        {
            System.out.println("Hoppá, valami nem jó! " + e.getMessage());
        }
        return inputString;
    }
}
