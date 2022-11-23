public class Radio {
    private int currentRadioStation;
    private int currentSoundVolume;

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > 9) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }
    public void nextRadioStation() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 9;
        }
    }
    public void prevRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = 9;
        }
    }
    public int getCurrentRadioStation() {
        return currentRadioStation;
    }
    public void setCurrentSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume < 0) {
            return;
        }
        if (currentSoundVolume > 10) {
            return;
        }
        this.currentSoundVolume = currentSoundVolume;
    }
    public void setToMaxVolume() {
        currentSoundVolume = 10;
    }
    public void setToMinVolume() {
        currentSoundVolume = 0;
    }
    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentVolume(int i) {
    }

    public int getCurrentVolume() {
        return 0;
    }
}
