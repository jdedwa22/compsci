public class CodingBatExerciseOperations {

    public static void main(String[] args) {

        System.out.println("This is the Participation Exercise 2: IntelliJ IDEA by Jacob Edwards");

        System.out.println("helloName Test Result: " + helloName("Jacob"));
        System.out.println("countHi Test Result: " + countHi("hhinhij"));
        System.out.println("repeatSeparator Test Result: " + repeatSeparator("phone", "/*", 2));
        System.out.println("inOrderEqual Test Result: " + inOrderEqual(5, 5, 7, true));
        System.out.println("mixString Test Result: " + mixString("hello", "red"));
        System.out.println("old35 Test Result: " + old35(89));
        System.out.println("alarmClock Test Result: " + alarmClock(4, true));
    }

    public static String helloName(String name)
    {

        return "Hello " + name + "!";
    }

    public static int countHi(String str)
    {

        int count = 0;

        for (int i = 0; i < str.length() - 1; i++)
        {
            if(str.substring(i, i + 2).equals("hi"))
            {
                count++;
            }
        }
        return count;
    }

    public static String repeatSeparator(String word, String sep, int count)
    {

        String result = "";

        for (int i = 0; i < count; i++){
            result += word;
            if (i+1 != count) {
                result = result + sep;
            }
        }
        return result;
    }

    public static boolean inOrderEqual(int a1, int b1, int c, boolean equalOk)
    {

        if(equalOk){
            return (a1 <= b1 && b1 <= c);

        } else {
            return (a1 < b1 && b1 < c);
        }
    }

    public static String mixString(String a2, String b2)
    {

        int i = 0;
        String result = "";

        while (i < a2.length() && i < b2.length())
        {
            result = result + a2.charAt(i) + b2.charAt(i);
            i++;
        }

        if (i == a2.length() && i != b2.length())
        {
            result = result + b2.substring(i);
        }

        if (i == b2.length() && i != a2.length())
        {
            result = result + a2.substring(i);
        }
        return result;
    }

    public static boolean old35(int n)
    {
        return ((n%3 == 0 || n%5 == 0) && !(n%3 == 0 && n%5 == 0));
    }

    public static String alarmClock(int day, boolean vacation)
    {

        if (vacation)
        {
            if (day > 0 && day < 6)
            {
                return "10:00";
            } else
            {
                return "off";
            }
        } else
        {
            if (day > 0 && day < 6)
            {
                return "7:00";
            } else
            {
                return "10:00";
            }
        }
    }
}