package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class radioTest {

    @Test
    public void changeNextStation() {
        radio radio = new radio();

        radio.setCurrentStation(5);
        radio.nextStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void changePrevStation() {
        radio radio = new radio();

        radio.setCurrentStation(7);
        radio.prevStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void pressOnTheNextButton() {
        radio radio = new radio();

        radio.setCurrentStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void pressOnThePrevButton() {
        radio radio = new radio();

        radio.setCurrentStation(0);
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void toSetTheStationNumberMin() {
        radio radio = new radio();

        radio.setCurrentStation(-6);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void toSetTheStationNumberMax() {
        radio radio = new radio();

        radio.setCurrentStation(11);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void volumeIncrease() {
        radio radio = new radio();

        radio.setCurrentVolume(5);
        radio.plusVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void volumeDecrease() {
        radio radio = new radio();

        radio.setCurrentVolume(3);
        radio.minusVolume();
        assertEquals(2, radio.getCurrentVolume());
    }

    @Test
    public void volumeIncreaseOverMax() {
        radio radio = new radio();

        radio.setCurrentVolume(12);
        radio.plusVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void volumeDecreaseUnderMin() {
        radio radio = new radio();

        radio.setCurrentVolume(-1);
        radio.minusVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}