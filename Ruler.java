public class Ruler {
	public static void drawRuler(int total_length, int tick_interval)
	{
		drawLine(tick_interval, 0); // draw inch 0 line and label
		for (int j = 1; j <= total_length; j++)
		{
			drawInterval(tick_interval - 1); // draw interior ticks for inch
			drawLine(tick_interval, j); // draw inch j line and label
		}
	}

	private static void drawInterval(int centralLength)
	{
		if (centralLength >= 1)
		{
			drawInterval(centralLength - 1); // recursively draw top interval
			drawLine(centralLength); // draw center tick line (without label)
			drawInterval(centralLength - 1); // recursively draw bottom interval
		}
		// otherwise, do nothing
	}

	private static void drawLine(int tickLength, int tickLabel)
	{
		for (int j = 0; j < tickLength; j++)
			System.out.print("-");
		if (tickLabel >= 0)
			System.out.print(" " + tickLabel);
		System.out.print("\n");
	}

	private static void drawLine(int tickLength)
	{
		drawLine(tickLength, -1);
	}

	public static void main(String[] args)
	{
		System.out.print("\n\nRuler of length 2 with major tick length 4\n");
		drawRuler(2, 4);
		System.out.print("\n\nRuler of length 1 with major tick length 5\n");
		drawRuler(1, 5);
		System.out.print("\n\nRuler of length 3 with major tick length 3\n");
		drawRuler(3, 3);
	}
}
