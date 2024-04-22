public class Radio {

    private int currentRadio;
    public int currentVolume;

    public int getCurrentRadio() {
        return currentRadio;
    }

    public void setCurrentRadio(int currentRadio) {
        if (currentRadio < 0) {
            return;
        }
        if (currentRadio > 9) {
            return;
        }
        this.currentRadio = currentRadio;
    }

    public void setNextRadio() {
        if (currentRadio == 9) {
            setCurrentRadio(0);
        } else {
            currentRadio++;
        }
    }

    public void setPervRadio() {
        if (currentRadio == 0) {
            setCurrentRadio(9);
        } else {
            currentRadio--;
        }
    }

    public void setToMaxRadio() {
        currentRadio = 9;
    }

    public void setToMinRadio() {
        currentRadio = 0;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void setToMaxVolume() {
        currentVolume = 100;
    }

    public void setToMinVolume() {
        currentVolume = 0;
    }

    public void setUpVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        } else {
            currentVolume = 100;
        }
    }

    public void setDownVolume() {
        if (currentVolume < 100) {
            currentVolume--;
        }
        if (currentVolume == 100) {
            currentVolume--;
        }
        if (currentVolume < 0) {
            currentVolume = 0;
        }
    }
}
