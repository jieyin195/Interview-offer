package DataStructure.String;

/**
 * @Author: zl
 * @Date: 2019/3/7 12:52
 * @Description:
 */
public class KMP {

    public static void main(String[] args) {
        String s1 = "BBC ABCDAB ABCDABCDABDE";
        String s2 = "ABCDABD";
        int result = indexof_KMP(s1, s2, 0);
        System.out.println(result);
    }

    /**
     * next[]数组用来存取  前缀和后缀  所共有的最大长度。
     * 		"部分匹配值"就是"前缀"和"后缀"的最长的共有元素的长度。以"ABCDABD"为例，
     *		－　"A"的前缀和后缀都为空集，共有元素的长度为0；
     *		－　"AB"的前缀为[A]，后缀为[B]，共有元素的长度为0；
     *		－　"ABC"的前缀为[A, AB]，后缀为[BC, C]，共有元素的长度0；
     *		－　"ABCD"的前缀为[A, AB, ABC]，后缀为[BCD, CD, D]，共有元素的长度为0；
     *		－　"ABCDA"的前缀为[A, AB, ABC, ABCD]，后缀为[BCDA, CDA, DA, A]，共有元素为"A"，长度为1；
     *		－　"ABCDAB"的前缀为[A, AB, ABC, ABCD, ABCDA]，
     *				后缀为[BCDAB, CDAB, DAB, AB, B]，共有元素为"AB"，长度为2；
     *		－　"ABCDABD"的前缀为[A, AB, ABC, ABCD, ABCDA, ABCDAB]，
     *				后缀为[BCDABD, CDABD, DABD, ABD, BD, D]，共有元素的长度为0。
     */

    /*
     *  如果next [j] = 0 或 -1，则跳到子串的开头字符
     *  如果next [j] = k 且 k > 0，代表下次匹配跳到j 之前的某个字符，而不是跳到开头，且具体跳过了k个字符
     */
    //	"ABCDABD"为例
    private static int[] getNext(String subStr) {	// {-1 0 0 0 0 1 2}
        int j = 1, k = 0;
        int[] next = new int[subStr.length()];
        next[0] = -1;
        next[1] = 0;
        while(j < subStr.length() - 1) {
            if(subStr.charAt(j) == subStr.charAt(k)) {	// 当j = 4进入判断
                next[j + 1] = k + 1;
                j++;
                k++;
            }else if(k == 0) {
                next[j + 1] = 0;
                j++;	// 主要区别是需要挪动j的指针
            }else {	// 当k = 2, j = 6进入判断
                k = next[k];	// k取最长公共前缀和后缀
            }
        }
        return next;
    }

    private static int indexof_KMP(String Str, String subStr, int start) {
        int[] next = getNext(subStr);
        int index = -1;
        int i = start, j = 0;
        while(i < Str.length() && j < subStr.length()) {
            if(Str.charAt(i) == subStr.charAt(j)) {
                i++;
                j++;
            }else if(j == 0){
                i++;	// 在子串的第一个字符和大串不匹配时，此处i不用回退，还是继续往前移动
            }else {
                j = next[j];	// 回转到next[]数组对应的   公共前缀和后缀最大长度   的下标处
            }

            if(j == subStr.length())
                index = i - j;
        }
        return index;
    }
}
