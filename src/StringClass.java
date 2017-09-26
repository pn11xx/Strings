public class StringClass {

    /**
     * @author pngo
     * @param args
     */
    public static void main(String args[]){

        String name = "Computer Science";/** name the string we will be using */

        System.out.println(name.charAt(2));/** charAt will return the character at the index/spot inside () */

        String string = name.concat(" Rocks");/**  */
        System.out.println(string);

        boolean b = name.equals("Computer Science");/** name.equals in boolean will test if the string inside () is the same as name */
        System.out.println(b);

        boolean c = name.equalsIgnoreCase("computer science");
        System.out.println(c);

        int i = name.indexOf("Science");/** indexOf will return the index of the first letter of the string inside () */
        System.out.println(i);

        int l = name.lastIndexOf("e");/** lastIndex will return the last occurance of the string inside () */
        System.out.println(l);

        String lowercaseString = name.toLowerCase();
        System.out.println(lowercaseString);

        String uppercaseString = name.toUpperCase();
        System.out.println(uppercaseString);

        String replaceString = name.replace('e', 'o');
        System.out.println(replaceString);

        String subString = name.substring(2);
        System.out.println(subString);

        String subString2 = name.substring(9, 15);
        System.out.println(subString2);



        String trimString = "   Computer Science   ";
        String trimString2 = name.trim();
        System.out.println(trimString2);

    }
}


