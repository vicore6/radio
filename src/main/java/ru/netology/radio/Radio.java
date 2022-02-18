package ru.netology.radio;

public class Radio {
    private int minNumberStation = 0;
    private int maxNumberStation = 9;
    private int minSoundVolume = 0;
    private int maxSoundVolume = 100;
    private int currentNumberStation = 5;
    private int currentSoundVolume = 50;


    public void setCurrentNumberStation(int currentNumberStation) {
        this.currentNumberStation = currentNumberStation;
    }

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        this.currentSoundVolume = currentSoundVolume;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public int getMaxNumberStation() {
        return maxNumberStation;
    }

    public Radio(int maxNumberStation) {
        this.maxNumberStation = maxNumberStation;
    }

    public void numberStationEntered(int currentNumberStation) {
        if (currentNumberStation >= maxNumberStation) {
            this.currentNumberStation = maxNumberStation;
            return;
        }
        if (currentNumberStation <= minNumberStation) {
            this.currentNumberStation = minNumberStation;
            return;
        }
        this.currentNumberStation=currentNumberStation;
    }

    public void numberStationNext() {
        if (currentNumberStation == maxNumberStation) {
            this.currentNumberStation = minNumberStation;
            return;
        }
        currentNumberStation++;
        return;
    }

    public void numberStationPrev() {
        if (currentNumberStation == minNumberStation) {
            currentNumberStation = maxNumberStation + 1;
        }
        currentNumberStation--;
        return;
    }

    public void volumeStationUp() {
        if (currentSoundVolume >= maxSoundVolume) {
            currentSoundVolume = maxSoundVolume;
            return;
        } else {
            currentSoundVolume++;
            return;
        }

    }

    public void volumeStationDown() {
        if (currentSoundVolume <= minSoundVolume) {
            currentSoundVolume = minSoundVolume;
            return;
        } else {
            currentSoundVolume--;
            return;
        }
    }

}
