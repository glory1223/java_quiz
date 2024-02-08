package ch03;

public class Quiz13 {
    public static void main(String[] args) {
        char ch = 'B';
        char lowerCase = (ch >= (char)65 && ch<(char)90)?  (char)(ch+32) : ch;
        System.out.println("ch:"+ ch);
        System.out.println("ch to lowerCase:"+lowerCase);


    }
}
