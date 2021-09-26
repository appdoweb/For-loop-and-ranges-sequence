//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        // put your code here
//        Scanner scanner = new Scanner(System.in);
//        int x1 = scanner.nextInt();
//        int y1 = scanner.nextInt();
//        int x2 = scanner.nextInt();
//        int y2 = scanner.nextInt();
//        boolean sameColumn = x1 == x2;
//        boolean sameRow = y1 == y2;
//        boolean attack;
//        if (sameRow || sameColumn) {
////            attack = true;
////            attack = Math.abs(x1 - x2) == Math.abs(y1 - y2);
//            System.out.println(Math.abs(x1));
//        } else {
////            attack = Math.abs(x1 - x2) == Math.abs(y1 - y2);
//            System.out.println(Math.abs(x1));
//        }
////        System.out.println(attack ? "YES" : "NO");
//    }
//}

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        int area = n * m;
        boolean cheker = k % n == 0;
        boolean chekerTwo = k % m == 0;
        boolean chekerThree = k <= area;

//System.out.println(area);
        if (chekerThree) {
            if (cheker || chekerTwo) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }else {System.out.println("NO");}
    }
}
