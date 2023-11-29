package Week5._03_Wednesday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapsCollection {
    public static void main(String[] args) {
//        Collections
//        List - ArrayList
//        Set - HashSet, TreeSet
//        Map - HashMap, TreeMap
//        Queue -

//        Business card using Map
        Map<String,String> johnCard = new HashMap<>();
        johnCard.put("name","John Snow");
        johnCard.put("email","john123@gmail.com");
        johnCard.put("phone","12345678798");

        Map<String,String> smithCard = new HashMap<>();
        smithCard.put("name","Adam Smith");
        smithCard.put("email","smithy@gmail.com");
        smithCard.put("phone","763438747");

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Aslanbek", "Azamat"));
        for (String name:names) {
            System.out.println(name);
        }

//        for (Map.Entry<String,String> dataValue:smithCard.entrySet()) {
//            System.out.println(dataValue.getValue());
//        }

        Map<String,Map<String,String>> businessCards = new HashMap<>();
        businessCards.put("John",johnCard);
        businessCards.put("Smith",smithCard);

        for (Map.Entry<String,Map<String,String>> bc:businessCards.entrySet()) {
//            System.out.println(bc);
//            System.out.println(bc.getValue());
            System.out.println(bc.getValue().get("email"));
        }

    }
}
