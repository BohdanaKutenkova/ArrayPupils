import java.util.*;

public class PupilsArray {
    public static void main(String[] args) {
        String[] pupilsArray = {"Антонов", "Шевченко", "Бойко", "Шевченко", "Кравченко",
                "Савицький", "Антонов", "Шевченко", "Тетерів", "Мамченко"};
        List<String> pupilsList = new ArrayList<>();
        for (String pupil : pupilsArray) {
            pupilsList.add(pupil);
        }
        System.out.println("Pupils list size: " + pupilsList.size());

        Set<String> pupilsSet = new HashSet<>(pupilsList);
        System.out.println("Quantity of pupils unics surnames: " + pupilsSet.size());

        Map<String, Integer> surnameLength = new HashMap<>();
        pupilsSet.forEach(p -> surnameLength.put(p, p.length()));
        System.out.println(surnameLength);
    }
}

