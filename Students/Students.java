package Students;
import java.util.Arrays;

public class Students
{
    public static void main(String[] args)
    {
        String[] students =
                {
                        "Sade", "Alexus", "Sam", "Koma"
                };
        int[] mathScores = new int[4];
        mathScores[0] = 64;
        mathScores[2] = 76;
        mathScores[1] = 57;
        mathScores[3] = 98;

        for
        (int x = 0; x < students.length; x++)
        {
            System.out.println(students[x] + ": " + mathScores[x]);
        }
    }
}
