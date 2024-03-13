public class TrafficLightB
{
    private int steps;
    private String color;
    private int reds;

    public TrafficLightB()
    {
        color = "green";
    }

    public TrafficLightB(String initialColor)
    {
        if(initialColor == "green")
        {
            steps = 0;
        } else if (initialColor == "yellow")
        {
            steps = 1;
        } else if (initialColor == "red")
        {
            steps = 2;
        }
    }

    public void next()
    {
        steps++;
    }

    public String getColor()
    {
        if (steps >= 0 && steps % 3 == 0)
        {
            color = "green";
        } else if (steps >= 0 && (steps - 1) % 3 == 0)
        {
            color = "yellow";
        } else {
            color = "red";
        }
        return color;
    }

    public int getReds()
    {
        if (color == "red")
        {
            reds++;
        }
        return reds;
    }
}