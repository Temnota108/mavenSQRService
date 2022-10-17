package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    public void shouldCalculateAmountOfSQR() {
        SQRService service= new SQRService ();

        // подготавливаем данные:
        int min = 200;
        int max = 300;
        int expected = 3;

        // вызываем целевой метод:
        int actual = service.calculatesqr(min, max);

        // производим проверку:
        assertEquals(expected, actual);

    }

}