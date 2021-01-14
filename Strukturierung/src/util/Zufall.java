package util;

/**
 * @author km
 */
public class Zufall
{
    /**
     * @return   Eine Zufallszahl von 1 bis 6 
     */
    public static int wuerfeln()
    {
        return  (int)(Math.random()*6 + 1);
    }

    /**
     * @return   Eine Zufallszahl von 1 bis 100 
     */
    public static int hundert()
    {
        return  (int)(Math.random()*100 + 1);
    }
}
