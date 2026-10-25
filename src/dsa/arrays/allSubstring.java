package javaCollege;

public class allSubstring {
    static void main(String[] args) {
        String s = "abciiidef";
        int w = 2, n = s.length();

        for(int i = 0;i<n;i++){
            for(int j = i;j<n;j++){
                for(int k= i;k<=j;k++){
                    String ss = s.substring(i,j+1);
                    if(j-1 == w)
                        System.out.println(ss);
                }
            }
        }
    }
}
