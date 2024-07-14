public class Task {
    public static void main(String[] args) {

        int i = Task.charOccurrences("hello world", 'o');
        System.out.println(i);

    }

    static int  count=0;
    static int say=0;
      public static void numberOfWords(String text ){
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)==' ' ){
                count++;
            }
        }

            System.out.println(count);
        }


      public static int charOccurrences (String text, char target){
          for(int j=0;j<text.length();j++){
              if(text.charAt(j)==target){
                  say++;
              }
          }
          return say;
    }






    }

