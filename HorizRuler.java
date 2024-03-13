public class HorizRuler {
    public static void draw_ruler(int total_length, int tick_interval)
    {

        draw_line(tick_interval, 0, tick_interval); // draw inch 0 line and label
        for (int j = 1; j <= total_length; j++)
        {
                draw_interval(tick_interval - 1, tick_interval); // draw interior ticks for inch
                draw_line(tick_interval, j, tick_interval); // draw inch j line and label
        }
    }

    private static void draw_interval(int central_height, int depth)
    {
        if (central_height >= 1)
        {
            draw_interval(central_height - 1, central_height); // recursively draw top interval
            draw_line(central_height, central_height); // draw center tick line (without label)
            draw_interval(central_height - 1, central_height); // recursively draw bottom interval
        }
        // otherwise, do nothing
    }

    private static void draw_line(int tick_height, int tickLabel, int depth)
    {
        for (int j = 0; j < tick_height; j++)
        {
            if (depth <= tick_height)
            {
                System.out.print("| ");
            } else
            {
                System.out.println("  ");
            }
        }
        if (tickLabel >= 0)
            System.out.print(" " + tickLabel);
        System.out.print("\n");
    }

    private static void draw_line(int tick_height, int depth)
    {
        draw_line(tick_height, -1, depth);
    }

    public static void main(String[] args)
    {
        System.out.println("Horizontal Ruler - Jacob Edwards");
        System.out.print("\nRuler of length 2 with major tick length 4\n");
        draw_ruler(2, 4);
        System.out.print("\nRuler of length 1 with major tick length 5\n");
        draw_ruler(1, 5);
        System.out.print("\nRuler of length 3 with major tick length 3\n");
        draw_ruler(3, 3);
    }
}
