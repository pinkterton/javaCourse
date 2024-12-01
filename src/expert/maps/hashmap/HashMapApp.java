package expert.maps.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {
    public static void main(String[] args) {
        Map<String, String> capitals = new HashMap<String, String>();

        capitals.put("England", "London");
        capitals.put("India", "New Delhi");
        capitals.put("Ukraine", "Kyiv");
        capitals.put("England", "Oslo");

        System.out.println("The capital of England is " + capitals.get("England"));
        capitals.remove("England", "Oslo");
        System.out.println("The capital of England is " + capitals.get("England"));

        if (capitals.containsValue("Kyiv")) {
            System.out.println("Ukraine on the list");
        }

        capitals.put(null, "The city isn't on the list.");
        String userInput = "Denmark";
        if (capitals.containsKey(userInput)) {
            System.out.println(capitals.get(userInput));
        } else {
            System.out.println(capitals.get(null));
        }

        System.out.println(capitals.getOrDefault(userInput, "The city isn't on the list."));

        capitals.replace("India", "Ankara","Mumbai");
        System.out.println("The capital of India is " + capitals.get("India"));

//       if (!capitals.containsKey(userInput)) {
//           capitals.put(userInput, "Copenhagen");
//       }

        capitals.put(userInput, "Copenhagen");


        capitals.remove(null);
        System.out.println(" The following countries can be found in the hashmap: ");
        for (String country : capitals.keySet()) {
            System.out.println("-" + country);
        }

        capitals.clear();
        System.out.println(capitals.size() + " The following countries can be found in the hashmap: ");
        for (String capital : capitals.values()) {
            System.out.println("-" + capital);
        }




    }
}
