public class Part_B_Nested_Loops
{
    public static void main(String[] args)
    {
        // Task 5: Triangle pattern increasing
        System.out.println("Task 5: Triangle pattern increasing");
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // Task 6: Triangle pattern decreasing
        System.out.println("Task 6: Triangle pattern decreasing");
        for (int i = 5; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // Task 7: Square pattern
        System.out.println("Task 7: Square pattern");
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= 5; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

    }
}