package javaCollege;

public class longest_Common_prefix {
    static void main(String[] args) {

        /// approach 1o
//        String [] ar = {"flower","flow","flight"}; //diff words par try
//        String str = ar[0];
//        boolean f = true;
//        String r = "";
//        for(int i = 0;i<str.length();i++){
//            char ch = str.charAt(i);
//            for(int j =0;j<ar.length;j++){
//                String s = ar[j];
//                if(s.indexOf(ch) != i){
//                    f = false;
//                    break;
//                }
//            }
//            if(f){
//                r = r+ch;
//            }
//        }
//        System.out.println(r);


        /// appraoch 2
//        String [] ar = {"flower","flow","flight"};
//        String result = ar[0];
//        for(int i = 0;i<ar.length;i++){
//            String s = ar[i];
//            while (s.indexOf(result) != 0) {
//                result = result.substring(0, result.length()-1);
//            }
//        }
//        System.out.println(result);

        /// google appraoch --not done yet

        String[] ar = {"flower", "flow", "flight"};
        String result = ar[0];
        for (int i = 0; i < ar.length; i++) {
            String s = ar[i];
            while (s.indexOf(result) != 0) {

            }
        }
    }
}
