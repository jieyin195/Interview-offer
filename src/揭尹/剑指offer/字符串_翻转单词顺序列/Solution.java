package 揭尹.剑指offer.字符串_翻转单词顺序列;

import java.util.ArrayList;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/5/28
 * \* Time: 15:22
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。
 * 同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，但却读不懂它的意思。
 * 例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，
 * 正确的句子应该是“I am a student.”。Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
 */
public class Solution {
    public String ReverseSentence(String str) {
        if(str.trim().equals(""))
            return str;
        String[] strArr = str.split(" ");
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = strArr.length-1; i >= 0; i--) {
            arrayList.add(strArr[i]);
        }
        String s="";
        for (int i = 0; i < arrayList.size(); i++) {
            if(i==arrayList.size()-1){
                s+=arrayList.get(i);
                break;
            }
            s+=arrayList.get(i)+" ";
        }
        return s;
    }
}
