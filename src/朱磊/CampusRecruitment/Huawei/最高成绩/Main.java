package 朱磊.CampusRecruitment.Huawei.最高成绩;

import java.util.Scanner;

/**
 * @Author: zl
 * @Date: 2019/4/3 17:05
 * @Description: 老师想知道从某某同学当中，分数最高的是多少，现在请你编程模拟老师的询问。当然，老师有时候需要更新某位同学的成绩.
 *
 *      每组输入第一行是两个正整数N和M（0 < N <= 30000,0 < M < 5000）,分别代表学生的数目和操作的数目。
 *      学生ID编号从1编到N。
 *      第二行包含N个整数，代表这N个学生的初始成绩，其中第i个数代表ID为i的学生的成绩
 *      接下来又M行，每一行有一个字符C（只取‘Q’或‘U’），和两个正整数A,B,当C为'Q'的时候, 表示这是一条询问操作，
 *  他询问ID从A到B（包括A,B）的学生当中，成绩最高的是多少
 *      当C为‘U’的时候，表示这是一条更新操作，要求把ID为A的学生的成绩更改为B。
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] gradeArr = new int[N];
            String[] operateArr = new String[M];
            for (int i = 0; i < N; i++) {
                gradeArr[i] = sc.nextInt();
            }

            sc.nextLine();
            for (int i = 0; i < M; i++) {
                operateArr[i] = sc.nextLine();
            }

            for (int i = 0; i < M; i++) {
                String[] cur = operateArr[i].split(" ");
                int numOne = Integer.parseInt(cur[1]);
                int numTwo = Integer.parseInt(cur[2]);
                if(cur[0].equals("Q"))
                    queryGrade(gradeArr, numOne, numTwo);
                else if(cur[0].equals("U"))
                    updateGrade(gradeArr, numOne, numTwo);
            }
        }
    }

    private static void queryGrade(int[] gradeArr, int numOne, int numTwo) {
        int max = 0;
        int begin = Math.min(numOne, numTwo);
        int end = Math.max(numOne, numTwo);
        for (int i = begin - 1; i < end; i++) {
            max = Math.max(gradeArr[i], max);
        }
        System.out.println(max);
    }

    private static void updateGrade(int[] gradeArr, int numOne, int numTwo) {
        gradeArr[numOne - 1] = numTwo;
    }

}
