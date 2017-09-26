public class StringBufferBuilder {
    /**
     * @author : pngo
     * Purpose : Use StringBuilder to Print out Hi two times
     *           Use StringBuffer append to add Holmes to Hello
     *           Print out 'Hello Holmes'
     *
     * @param args
     */
    public static void main(String[]args){
        String x = "Good morning, ";
        x += " Dr. Watson"; //Add Beth to Hello > 'Hello Beth'
        System.out.println(x);


        StringBuilder b = new StringBuilder("Hello");
        b = b.replace(0, 5, "The name is Watson");//Replace index 2-4 with "i"
        System.out.println(b.replace(11, 18, " Sherlock holmes"));
        //System.out.println(b);

        //Starting String Buffer
        StringBuffer a = new StringBuffer("And the ");
        System.out.println(a.hashCode());
        a.append("address is");//Adds Holmes to the string a = "Hello"
        System.out.println(a.hashCode());
        System.out.println(a);

        a.insert(18, " 221B Baker Street");
        System.out.println(a);
        System.out.println(a.capacity());
        System.out.println(a.length());

        a.append("221B Baker Street");
        System.out.println(a.capacity());
    }
}
