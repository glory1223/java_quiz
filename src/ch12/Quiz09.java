package ch12;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Quiz09 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분");
        System.out.println(sdf.format(new Date()));

    }
}
