package IntegerPrg;

import java.util.*;

public class StringPrgs {

	public static void main(String[] args) {
        String str = "aaabbcddddaaasdssdvcvrgsdfxadsjidsjhflasjdhquweiohfsdahasdbhahuewfirvdssdahbcasdbcasdfwqeryrutperwuytiuywqeriouhdfvjbxcbxazcasfffeeeewwttyyasdfgvbnm";

        Map<Character, Integer> freqMap = new LinkedHashMap<>(); 

        for (char ch : str.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
