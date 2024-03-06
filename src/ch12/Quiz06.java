package ch12;

import java.util.StringTokenizer;

public class Quiz06 {
    public static void main(String[] args) {
        String str = "아이디, 이름, 패스워드";
        StringTokenizer strs = new StringTokenizer(str, ",");
        for (int i = 0; i < 3 ; i++) {
        System.out.println(strs.nextElement());
        }

    }
}
