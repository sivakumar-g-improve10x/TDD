package nameinverter;

import java.util.ArrayList;
import java.util.Arrays;

public class NameInverter {
    public String invertName(String name) {
        if (name.equals("")) {
            return "";
        } else if (!name.trim().contains(" ")) {
            return name.trim();
        }else {
            ArrayList<String> names = new ArrayList<>(Arrays.asList(name.trim().split("\\s+")));
            removeHonorifics(names);
            String postNominal = (names.size()> 2) ? names.get(2) : "";
            return (names.get(1)+ ", " + names.get(0) + " " + postNominal).trim();
        }
    }

    private static void removeHonorifics(ArrayList<String> names) {
        if (names.get(0).matches("Mrs.|Mr.|Miss.")&& names.size()>2){
            names.remove(0);
        }
    }
}
