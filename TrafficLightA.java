public class TrafficLightA
{
    private String color;
    private int reds;

    public TrafficLightA()
    {
        color = "green";
    }

    public TrafficLightA(String initialColor)
    {
        color = initialColor;
    }

    public void next()
    {
        if (color == "green")
        {
            color = "yellow";
        } else if (color == "yellow")
        {
            color = "red";
        } else if (color == "red")
        {
            color = "green";
        }
    }
    public String getColor()
    {
        return color;
    }
    public int getReds()
    {
        if (color == "red"){
            reds++;
        }
        return reds;
    }
}