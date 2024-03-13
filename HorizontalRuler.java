public class HorizontalRuler {
    public static void drawRuler(int total_length, int tick_interval)
    {
        for (int depth = tick_interval; depth >= 1; depth--)
        {
            drawLine(tick_interval, depth); // draw inch 0 line and label
            for (int j = 1; j <= total_length; j++)
            {
                drawInterval(tick_interval - 1, depth); // draw interior ticks for inch
                drawLine(tick_interval, depth); // draw inch j line and label
            }
            System.out.println(); // newline after each level
        }

        for (int k = 0; k <= total_length; k++)
        {
            if(tick_interval == 3)
            {
                if (k > 0)
                {
                    for (int i = 0; i < tick_interval; i++)
                    {
                        System.out.print("  ");
                    }
                }
                System.out.print(k);
                System.out.print(" ");
            }
            else if (tick_interval == 4)
            {
                if (k > 0)
                {
                    for (int i = 0; i < tick_interval; i++)
                    {
                        System.out.print("   ");
                    }
                }
                System.out.print(k);
                System.out.print("   ");
            } else if (tick_interval == 5)
            {
                if (k > 0)
                {
                    for (int i = 0; i < tick_interval; i++)
                    {
                        System.out.print("     ");
                    }
                }
                System.out.print(k);
                System.out.print("      ");
            }
        }
    }

    private static void drawInterval(int centralLength, int depth)
    {
        if (centralLength >= 1)
        {
            drawInterval(centralLength - 1, depth); // recursively draw top interval
            drawLine(centralLength, depth); // draw center tick line (without label)
            drawInterval(centralLength - 1, depth); // recursively draw bottom interval
        }
        // otherwise, do nothing
    }

    private static void drawLine(int tick_height, int depth)
    {
            if (tick_height >= depth)
            {
                System.out.print("| ");
            }
            else
            {
                System.out.print("  ");
            }
    }

    public static void main(String[] args)
    {
        System.out.println("Horizontal Ruler - Jacob Edwards");
        System.out.print("\nRuler of length 2 with major tick length 4\n");
        drawRuler(2, 4);
        System.out.print("\nRuler of length 1 with major tick length 5\n");
        drawRuler(1, 5);
        System.out.print("\nRuler of length 3 with major tick length 3\n");
        drawRuler(3, 3);
        System.out.println("\nRuler of length 4 with major tick length 5\n");
        drawRuler(4, 5);
        System.out.print("\nRuler of length 3 with major tick length 5\n");
        drawRuler(3, 4);
    }
}
