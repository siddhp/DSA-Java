package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountItemsMatchingRule {
    public static void main(String[] args) {
        List<List<String>> arr=new ArrayList<>();
        arr.add(List.of("phone","blue","pixel"));
        arr.add(List.of("computer","silver","lenovo"));
        arr.add(List.of("phone","silver","iphone"));

        System.out.println(countMatches(arr,"color","silver"));
    }

    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int index = 0;
        switch (ruleKey) {
            case "type":
                index = 0;
                break;
            case "color":
                index = 1;
                break;
            case "name":
                index = 2;
                break;
        }
        for (List<String> list : items) {

            if (list.get(index).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
