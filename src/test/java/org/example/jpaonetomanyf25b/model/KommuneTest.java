package org.example.jpaonetomanyf25b.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


class KommuneTest {

    @Test
    void test2() {
        assertEquals("ABC", "ABC"); //assertEquals er overload metode.

    }

    @Test
    void testDiv(){
        int a = 10;
        int b = 0;
        int c = a/b;
        assertEquals(0, c); //Jeg forventer at få 0.
    }

    @Test
    @DisplayName("Test array sortering") //Det navn som vises i test rapporten til venstre.
    void testArr() {
        int[] numbers = {12,3,4,1};
        int[] expected = {1,3,4,12};
        Arrays.sort(numbers);
        //Husk at vi bruger assertArrayEquals til at teste arrays.
        assertArrayEquals(expected,numbers, ()->"Array sort"); //Jeg forventer at sortere arrayen.
    }

    @DisplayName("paramtest med 3 arrays")
    @ParameterizedTest
    @MethodSource("sortnumbersArgument") //Navnet på den metode som genererer arrays.
    void testArrParm(int[] numbers, int[] expected) { // Modtager 2 arrays som skal sorteres.
        Arrays.sort(numbers); //Sorterer arrayen.
        assertArrayEquals(expected, numbers, () -> "der er fejl " + Arrays.toString(numbers) + " i array");
    }

    private static Stream<Arguments> sortnumbersArgument() { //Metode som returnerer en stream af arrays side 17 i UnitTestTips.
        return Stream.of(
                Arguments.of(new int[]{12,3,4,1}, new int[]{1,3,4,12}),
                Arguments.of(new int[]{1,2,3,4}, new int[]{1,2,3,4}),
                Arguments.of(new int[]{1,2,3,4,5}, new int[]{1,2,3,4,5})
        );
    }



}