package practice;

import java.util.*;

public class CoolNumbers {

    public static List<String> generateCoolNumbers() {
        List<String> list = new ArrayList<>();
        for (int region1 = 0; region1 < 10; region1++) {
            for (int region2 = 0; region2 < 199; region2++) {
                String region = Integer.toString(region2);
                if (region1 < 10) {
                    region = "0" + region;
                }
                for (String s1 : list) {
                    for (String s2 : list) {
                        for (String s3 : list) {
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
        return false;
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {
        return false;
    }

    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        return false;
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        return false;
    }

}
