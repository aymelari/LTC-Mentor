//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      String name="a y s u";

      String words="shfbd sfhbdshjf sdjahfbds sfhbdsjn";


      name=name.replace(" " ,"");
        System.out.println(name);
        System.out.println(name.length());
       name=name.toUpperCase();
        System.out.println(name);
        name=name.toLowerCase();
        System.out.println(name);

        boolean a=name.startsWith("A");
        boolean b=name.endsWith("Z");
        System.out.println(a);
        System.out.println(b);

        name=name.replace("y","Y");
        System.out.println(name);


       /* char[] namearray=name.toCharArray();
        System.out.println(namearray); */

        String[] s = name.split(" ");

        int i=name.indexOf("s");
        System.out.println(i);

        name=name.substring(1,3);
        System.out.println(name);

        String name2="  aysu ";
        name2=name2.trim();
        System.out.println(name2);



    }
}