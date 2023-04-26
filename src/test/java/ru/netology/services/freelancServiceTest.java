package ru.netology.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class freelancServiceTest {
    @Test
    public void testWhenFreelancerRestThreeMonts () {
        freelancService service = new freelancService();

        int actual = service.calculate( income: 10_000, expenses: 3_000, threshold: 20_000);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

}