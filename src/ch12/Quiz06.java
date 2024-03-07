package ch12;

import java.util.StringTokenizer;

public class Quiz06 {
    public static void main(String[] args) {
        String str = "아이디, 이름, 패스워드";
        StringTokenizer strs = new StringTokenizer(str, ","); //문자열 분리할때 Tokenizer 또는 split사용 (3개의토큰이생성됨)

        while (strs.hasMoreTokens()) {
           String token = strs.nextToken();
            System.out.println(token);
        }
        /*
        for (int i = 0; i < 3 ; i++) {
        System.out.println(strs.nextElement());
        }
         */

    }
}
