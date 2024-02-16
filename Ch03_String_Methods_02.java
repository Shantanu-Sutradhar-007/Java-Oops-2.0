public class Ch03_String_Methods_02 {
    public static void main(String[] args) {

        String name = "Shanu  ";

        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim());
        System.out.println(name.substring(2));
        System.out.println(name.substring(0, 4));
        System.out.println(name.replace("u", "tanu"));
        System.out.println(name.startsWith("Sh"));
        System.out.println(name.endsWith(" "));
        System.out.println(name.charAt(0));
        System.out.println(name.indexOf("a"));
        System.out.println(name.indexOf("S", 2));
        System.out.println(name.lastIndexOf("nu"));
        System.out.println(name.equals("Shanu  "));
        System.out.println(name.equalsIgnoreCase("shanu  "));
        System.out.println("Shanu IS a Boy \" " );

    }

}
