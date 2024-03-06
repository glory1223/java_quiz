package ch12;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Quiz09 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년MM월dd일E요일hh시mm분");
        System.out.println(sdf.format(new Date()));

    }
}
