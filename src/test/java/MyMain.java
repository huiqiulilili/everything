import java.util.Scanner;

/**
 * @author zhuicat
 * @date 2022/6/23 19:11
 * @Description
 */

public class MyMain {
    public static int lengthOfLast(String str) {
        String[] s = str.split(" ");
        return s[s.length - 1].length();
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            String str = sc.nextLine();
//            System.out.println(lengthOfLast(str));
//        }
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();


        System.out.println(str.length() - (str.lastIndexOf(" ")+1));

    }
}

