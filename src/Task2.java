/*public class Task2 {
    public static void main(String[] args) {
        String name = "aysu djhfbh dhfs dsjfh";
        int count = 0;
        int herfsayi = 0;

        for (int i = 0; i < name.length(); i++) {
            char herf = name.charAt(i);
            if (herf == 'a' || herf == 'i' || herf == 'o' || herf == 'u' || herf == 'e') {
                count++;
            }
        }
        System.out.println("vowel sayi" + count);

        //2


        boolean i = name.contains("java");
        System.out.println(i);

        name = name.replace("example", "sample");
        System.out.println(name);

        name = name.replace(".", "");
        System.out.println(name);


        for (int j = 0; j < name.length(); j++) {
            if (!(name.charAt(j) <= 'z')) {
                herfsayi++;

            }
        }
        if (herfsayi == 0) {
            System.out.println("contains only letters");

        }


        //7

       // for(int t=0;t< name.length();t++) {
        //    if (name.charAt(t-1)==' '){
         //       name.charAt(i);
           }


        }


        int last = name.lastIndexOf("t");
        System.out.println(last);

        //9
//        for (int m = 0; m < name.length(); m++) {
//
//            if (name.charAt(m) == name.charAt(m + 1)) {
//                char letter = name.charAt(m + 1);
//                // name=name.replace(letter,"");
//
//            }
//        }
        char[] array=name.toCharArray();
        for(int k=0;k< array.length;k++){
            array[k]=array[array.length - k - 1];

        }
        System.out.println(array);



    }
}

//frequency

      //2 */














