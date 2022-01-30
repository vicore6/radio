package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class radioTest {


    @Test
    public void maxStation() {
        radio radio = new radio(4);

        assertEquals(4, radio.getMaxStation());
    }


    @Test
    public void setTheDesiredStation() {
        radio radio = new radio(5);
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void allValue() {
        radio radio = new radio(2, 0, 10, 9, 0, 100);

        assertEquals(2, radio.getCurrentStation());
        assertEquals(0, radio.getMinStation());
        assertEquals(10, radio.getMaxStation());
        assertEquals(9, radio.getCurrentVolume());
        assertEquals(0, radio.getMinVolume());
        assertEquals(100, radio.getMaxVolume());
    }


    @Test
    public void changeNextStation() {
        radio radio = new radio(5, 10);

        radio.nextStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void changePrevStation() {
        radio radio = new radio(9, 10);

        radio.prevStation();
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void minMaxStationValue() {
        radio radio = new radio();

        radio.setMaxStation(10);
        radio.setMinStation(0);
        assertEquals(10, radio.getMaxStation());
        assertEquals(0, radio.getMinStation());
    }


    @Test
    public void pressOnTheNextButton() {
        radio radio = new radio(10, 10);

        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void pressOnThePrevButton() {
        radio radio = new radio(0, 10);

        radio.prevStation();
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void toSetTheStationNumberMin() {
        radio radio = new radio();

        radio.setCurrentStation(-2);
        assertEquals(0, radio.getCurrentStation());
    }


    @Test
    public void toSetTheStationNumberMax() {
        radio radio = new radio();

        radio.setCurrentStation(11);
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void setAnyStation() {
        radio radio = new radio();

        radio.setCurrentStation(23);
        assertEquals(10, radio.getCurrentStation());
    }


    @Test
    public void volumeValues() {
        radio radio = new radio();

        radio.setCurrentVolume(8);
        radio.setMinVolume(0);
        radio.setMaxVolume(100);

        assertEquals(8, radio.getCurrentVolume());
        assertEquals(0, radio.getMinVolume());
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void volumeIncrease() {
        radio radio = new radio(4, 0, 100);

        radio.plusVolume();
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void volumeDecrease() {
        radio radio = new radio(4, 0, 100);

        radio.minusVolume();
        assertEquals(3, radio.getCurrentVolume());
    }


    @Test
    public void increaseFromMaxVolume() {
        radio radio = new radio();

        radio.setCurrentVolume(100);
        radio.plusVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void decreaseFromMinVolume() {
        radio radio = new radio();

        radio.setCurrentVolume(0);
        radio.minusVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void toSetTheVolumeNumberMin() {
        radio radio = new radio();

        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void toSetTheVolumeNumberMax() {
        radio radio = new radio();

        radio.setCurrentVolume(110);
        assertEquals(100, radio.getCurrentVolume());
    }
}
