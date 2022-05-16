package practice;

import java.util.*;

public class CoolNumbers {

    public static List<String> generateCoolNumbers() {
        String[] numbers = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
        List<String> list = new ArrayList<>();
        for (int region1 = 0; region1 < 10; region1++) {
            for (int region2 = 0; region2 < 199; region2++) {
                String region = Integer.toString(region2);
                if (region2 < 10) {
                    region = "0" + region;
                }
                for (String s1 : numbers) {
                    for (String s2 : numbers) {
                        for (String s3 : numbers) {
                            String number = String.format("%s%d%d%d%s%s%s", s1, region1, region1, region1, s2, s3, region);
                            list.add(number);
                        }
                    }
                }
            }
        }
        return list;
    }


    public static boolean bruteForceSearchInList(List<String> list, String number) {
        return list.contains(number);
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {
        return Collections.binarySearch(sortedList, number) >= 0;
    }

    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        return hashSet.contains(number);
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        return treeSet.contains(number);
    }

}
