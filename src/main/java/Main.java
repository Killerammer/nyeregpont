import java.util.ArrayList;

public class Main
{
    public static void main(String args[]) {
        new Main();
    }

    public Main()
    {
        int n = 3;
        ArrayList<String> arrayList = Beolvaso.beolvaso();
        kereso(matrix(arrayList, n));
    }

    private double[][] matrix(ArrayList<String> arrayList, int n)
    {
        double[][] matrix = new double[n][n];
        String[] elem;
        for (int i = 0; i < n; i++)
        {
            elem = arrayList.get(i).split(",");
            for (int j = 0; j < n; j++)
            {
                matrix[i][j] = Double.parseDouble(elem[j]);
            }
        }
        return matrix;
    }

    private void kereso(double[][] matrix)
    {
        boolean nincsNyeregpont = true;
        
        for (int i = 0; i < matrix.length; i++)
        {
            boolean vanNyeregpont = true;
            int sorMinID = 0;
            double min = matrix[i][0];

            for (int j = 1; j < matrix[0].length; j++)
            {
                if (matrix[i][j] < min)
                {
                    min = matrix[i][j];
                    sorMinID = j;
                }
            }

            for (int j = 0; j < matrix.length; j++)
            {
                if (min < matrix[j][sorMinID])
                {
                    vanNyeregpont = false;
                    break;
                }
            }
            if (vanNyeregpont)
            {
                System.out.println("Van nyeregpont. A nyeregpont: " + min);
                nincsNyeregpont=false;
            }
        }
        if (nincsNyeregpont)
        {
            System.out.println("Nincs nyeregpont.");
        }
    }
}
