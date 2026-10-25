package javaCollege;

public class reverse_palindromeString {
    static void main(String[] args) {
//        String text = "Hello Kshitij";
//        String reversed = "";
//
//        for (int i = text.length() - 1; i >= 0; i--) {
//            reversed += text.charAt(i);
//        }
//        System.out.println(reversed);


        /// / appraoch 2 --with palindrome
//        String str = "     n     e     e     n     ";
//        String og = str;
//        char[] ch = str.toCharArray();
//        int i = 0, j = ch.length-1;
//        while(i<j){
//            char temp = ch[i];
//            ch[i] = ch[j];
//            ch[j] = temp;
//            i++;
//            j--;
//        }
//        String rev = new String(ch);
//        if(rev.equalsIgnoreCase(og)) {
//            System.out.println("palindrome");
//        }
//        else System.out.println("no");
//            System.out.println(ch);  //for print reversed

        //
         /// leetcode approach

        String str = "!@#$%^&fbdf";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        int i =0,j=str.length()-1;
        char[] ar = str.toCharArray();
        boolean f = true;
        while(i<j){
            while(i<ar.length && !Character.isLetter(ar[i])) i++;
            while(j>=0 && !Character.isLetter(ar[j])) j--;
            if(ar[i] != ar[j]){
                f =false;
                break;

            }
            i++;
            j--;
        }
        System.out.println(f);
    }
}
