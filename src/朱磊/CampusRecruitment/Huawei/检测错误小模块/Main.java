package 朱磊.CampusRecruitment.Huawei.检测错误小模块;

import java.util.*;

/**
 * @Author: zl
 * @Date: 2019/4/3 21:14
 * @Description:
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> save = new HashMap<>();
        while (sc.hasNext()){
            String input = sc.nextLine();
            if(input.equals("!"))   break;
            // 对文件的路径符部分进行拆分
            String[] filePart = input.split("\\\\");
            // fileName为整个路径的文件部分
            String fileName = filePart[filePart.length - 1];
            if (save.containsKey(fileName)) {
                save.put(fileName, save.get(fileName) + 1);
            } else {
                save.put(fileName, 1);
            }
        }

        Map<String, Integer> map = sortMapByValue(save);

        int total = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            String whole = entry.getKey();
            String[] file = whole.split(" ");
            String name = fileSave(file[0]);
            String line = file[1];
            Integer count = entry.getValue();
            System.out.println(name + " " + line + " " + count);
            if(++total == 8)
                break;
        }
    }

    private static Map<String, Integer> sortMapByValue(Map<String, Integer> save) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(save.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i).getKey(), list.get(i).getValue());
        }
        return map;
    }

    private static String fileSave(String fileName) {
        if(fileName.length() <= 16)
            return fileName;
        return fileName.substring(fileName.length() - 16, fileName.length() - 1);
    }

}
