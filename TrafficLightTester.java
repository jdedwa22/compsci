public class TrafficLightTester
{
    public static void main(String[] args)
    {
        TrafficLightB tl1 = new TrafficLightB();
        System.out.println(tl1.getColor());
        System.out.println("Expected: green");
        System.out.println(tl1.getReds());
        System.out.println("Expected: 0");
        tl1.next();
        System.out.println(tl1.getColor());
        System.out.println("Expected: yellow");
        System.out.println(tl1.getReds());
        System.out.println("Expected: 0");
        tl1.next();
        System.out.println(tl1.getColor());
        System.out.println("Expected: red");
        System.out.println(tl1.getReds());
        System.out.println("Expected: 1");
        tl1.next();
        System.out.println(tl1.getColor());
        System.out.println("Expected: green");
        System.out.println(tl1.getReds());
        System.out.println("Expected: 1");

        TrafficLightB tl2 = new TrafficLightB("red");
        System.out.println(tl2.getColor());
        System.out.println("Expected: red");
        System.out.println(tl2.getReds());
        System.out.println("Expected: 1");
        tl2.next();
        System.out.println(tl2.getColor());
        System.out.println("Expected: green");
        System.out.println(tl2.getReds());
        System.out.println("Expected: 1");
        tl2.next();
        tl2.next();
        System.out.println(tl2.getColor());
        System.out.println("Expected: red");
        System.out.println(tl2.getReds());
        System.out.println("Expected: 2");
    }
}