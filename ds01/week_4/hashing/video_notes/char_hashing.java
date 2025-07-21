import java.util.Scanner;

public class char_hashing {
    public static void main(String[] args) {
        countchar_lowercase("abcdefghiabcdef");
    }
    static int countchar(char ch, String str){
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)== ch) {
                count++;
            }
        }
        return count;
    }
    static void countchar_lowercase(String str){
        //pre computing [0-a,1-b,.....,25-z]
        int[] hash = new int[26];
        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i) - 'a'] ++; 
        }
        //getting query from user
        int q;
        System.out.println("enter number of query");
        Scanner in = new Scanner(System.in);
        q = in.nextInt();
        while (q>0) {
            char c;
            c = in.next().charAt(0);
            System.out.println(hash[c-'a']);
            q--;
        }
    }
}
