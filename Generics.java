public class Generics {
    public static void main(String[] args) {
        Integer intList[] = {2,6,8,4,9,7,3};
        Character charList[] = {'b','t','z','g','u','r'};
        Float floatList[] = {199.3F , 2658.63597F , -987.2146F , 1674.2687F};
        Double doubleList[] = {89.214 , 56.248 , 964.30 , 66.00};
        System.out.println("Int Max = "+getMax(intList));
        System.out.println("Char Max = "+getMax(charList));
        System.out.println("Doubl Max = "+getMax(doubleList));
        System.out.println("Float Max = "+getMax(floatList));
    }
    public static  <T> T getMax(T[] element)
    {
        T  max = element[0] ;
        for (T e: element)
        {
            if(e.hashCode() > max.hashCode())
                max = e ;
        }
        return max ;
    }
}
