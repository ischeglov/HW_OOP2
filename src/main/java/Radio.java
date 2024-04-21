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
        if (currentRadio >= 9) {
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
}
