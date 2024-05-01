import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Radio {

    private int radioRange = 10;
    private int maxCurrentRadio = radioRange - 1;
    private int minCurrentRadio = 0;
    private int currentRadio = minCurrentRadio;

    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;

    public Radio(int radioRange) {
        maxCurrentRadio = radioRange - 1;
    }

    public void setCurrentRadio(int currentRadio) {
        if (currentRadio < minCurrentRadio) {
            return;
        }
        if (currentRadio > maxCurrentRadio) {
            return;
        }
        this.currentRadio = currentRadio;
    }

    public void setNextRadio() {
        if (currentRadio == maxCurrentRadio) {
            setCurrentRadio(minCurrentRadio);
        } else {
            currentRadio++;
        }
    }

    public void setPervRadio() {
        if (currentRadio == minCurrentRadio) {
            setCurrentRadio(maxCurrentRadio);
        } else {
            currentRadio--;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void setUpVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void setDownVolume() {
        if (currentVolume < maxVolume) {
            currentVolume--;
        }
        if (currentVolume == maxVolume) {
            currentVolume--;
        }
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
        }
    }
}