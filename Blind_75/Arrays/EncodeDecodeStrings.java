package Blind_75.Arrays;

import java.util.ArrayList;
import java.util.List;

public class EncodeDecodeStrings {
    public static String encode(String s[]) {
        StringBuilder sb = new StringBuilder();
        for(String str : s) {
            sb.append(str.length());
            sb.append("#");
            sb.append(str);
        }
        return sb.toString();
    }
    public static String[] decode(String s) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while(i < s.length()) {
            int j = i;
            while(s.charAt(j) != '#') {
                j++;
            }
            int len = Integer.parseInt(s.substring(i, j));

            j++; // move after '#'
            String word = s.substring(j, j + len);

            list.add(word);

            i = j + len; // move to next block
        }
        return list.toArray(new String[0]);
    }
    public static void main(String[] args) {
        String s[] = {"Hello","World"};
        String ans = encode(s);
        System.out.println(ans);
        String[] decodeAns = decode(ans);
        for(int i = 0;i < decodeAns.length;i++) {
            System.out.println(decodeAns[i] + " ");
        }
    }
}
