package ua.lviv.iot.algo.part1.lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ZipCodesOfLviv {
    private static final List<String> zipCodes = new ArrayList<>();
    private static final String regex = "\\b79[0-9]{3}\\b";
    public static List<String> getLvivZipCodes(String text) {

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String zipCode = matcher.group();
            if (zipCode.compareTo("79000") >= 0 && zipCode.compareTo("79099") <= 0) {
                zipCodes.add(zipCode);
            }
        }

        return zipCodes;
    }

    public static void main(String[] args) {
        String text = "м. Львів вул. Окружна, 57а, офіс 100, індекс 79041. I live in Shklo, our zip code is 81050";
        List<String> lvivZipCodes = getLvivZipCodes(text);
        System.out.println(lvivZipCodes);
    }
}
