public class reverse {
    public static void main(String[] args) {
        String name="hello";
        char[] charArray = name.toCharArray();
        int start=0;
        int end=charArray.length-1;
        for (char item : charArray){
            if (start<end){
                char temp = charArray[start];
                charArray[start] = charArray[end];
                charArray[end] = temp;



                start++;
                end--;
            }



        }

        String string = new String(charArray);
        System.out.println(string);


    }
}
