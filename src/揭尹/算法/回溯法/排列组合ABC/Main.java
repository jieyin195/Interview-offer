package 揭尹.算法.回溯法.排列组合ABC;

import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/9/11
 * \* Time: 18:58
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Main {
    static ArrayList<String> list = new ArrayList<>();
    public static void findCombination(String digits,int index ,String s,String[] letterMap){
        if(index == digits.length()){
            list.add(s);
            return;
        }

        Character c = digits.charAt(index);
        String letters = letterMap[c - 'A'];
        for(int i = 0 ; i < letters.length() ; i ++){
            findCombination(digits, index+1, s + letters.charAt(i),letterMap);
        }
        return;
    }

    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] letterMap=new String[s.length()];
        for (int i = 0; i < letterMap.length; i++) {
            letterMap[i]=s;
        }
        findCombination(s,0,"",letterMap);
        System.out.println(list);
        System.out.println(list.size());
    }
}
