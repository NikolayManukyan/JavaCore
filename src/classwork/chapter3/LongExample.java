package classwork.chapter3;

public class LongExample {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;
        lightspeed = 186000;
        days = 1000;
        seconds = days * 60 * 60 * 24;
        distance = lightspeed * seconds;
        System.out.print("in " + days);
        System.out.print(" days light cross around ");
        System.out.println(distance + " mils");
    }
}
