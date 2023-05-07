package ua.lviv.iot.algo.part1.lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import java.util.List;

public class ZipCodesOfLvivTest {
    @Test
    public void testGetLvivZipCodes() {
        String text = "м. Львів вул. Окружна, 57а, офіс 100, індекс 79041. I live in Shklo, our zip code is 81050";
        List<String> expectedZipCodes = List.of("79041");
        List<String> actualZipCodes = ZipCodesOfLviv.getLvivZipCodes(text);

        assertEquals(expectedZipCodes, actualZipCodes);
    }
}
