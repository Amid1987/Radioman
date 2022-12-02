public class Radio {
    private int currentRadioStation;
    private int currentSoundVolume;
    private int numberStation = 10;

    public Radio() {
    }

    public Radio(int numberStation) {
        this.numberStation = numberStation;
    }

    public int getNumberStation() {
        return numberStation;
    }

    public void setNumberStation(int numberStation) {
        if (numberStation < 0) {
            return;
        }
        this.numberStation = numberStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > numberStation - 1) {
            return;
        }
        if (currentRadioStation < 0) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void nextRadioStation() {
        if (currentRadioStation < numberStation - 1) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation > 0) {

            currentRadioStation--;
        } else {
            currentRadioStation = numberStation - 1;
        }
    }

    public int getCurrentVolume() {
        return currentSoundVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 100) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentSoundVolume = currentSoundVolume;
    }


    //Увеличение громкости
    public void increaseVolume() {
        if (currentSoundVolume < 100) {
            currentSoundVolume++;
        }
    }

    //Уменьшение громкости
    public void decreaseVolume() {
        if (currentSoundVolume > 0) {
        }
        currentSoundVolume--;
    }
}
