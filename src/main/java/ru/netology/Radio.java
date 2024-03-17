package ru.netology;

//Номер текущей радиостанции может принимать значения только в пределах от 0 до 9.
public class Radio {
    private int currentStation;
    private int volume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }
//Если текущая радиостанция 9 и клиент нажал на кнопку next (=вызвал одноимённый метод next, с англ. — следующая) на пульте, то текущей должна стать нулевая. В остальных случаях при нажатии на эту же кнопку радио переключается просто на следующую станцию.

    public void nextStation() {
        int currentStation = this.currentStation;
        {
            if (currentStation == 9) {
                this.currentStation = 0;

            } else {
                this.currentStation++;
            }

        }
    }

    //Если текущая радиостанция 0 и клиент нажал на кнопку prev (=вызвал одноимённый метод prev, с англ. — предыдущая) на пульте, то текущей должна стать девятая. В остальных случаях радио переключается просто на предыдущую станцию.
    public void prevStation() {
        int currentStation = this.currentStation;
        {
            if (currentStation == 0) {
                this.currentStation = 9;

            } else {
                this.currentStation--;
            }

        }
    }
// Клиент должен иметь возможность увеличивать и уменьшать уровень громкости звука в пределах от 0 до 100.

    public int getVolume() {
        return volume;
    }

    public void setVolume(int newSetVolume) {
        if (newSetVolume > 100) {
            return;
        }
        if (newSetVolume < 0) {
            return;
        }
        volume = newSetVolume;
    }

    public void volumeUpForOne() {
        int volume = this.volume;

        {

            if (volume == 100) {
                this.volume = volume;
            }
            if (volume < 100) {
                this.volume++;
            }
        }
    }

    public void volumeDownForOne() {
        int volume = this.volume;
        {
            if (volume == 0) {
                this.volume = volume;
            }
            if (volume > 0) {
                this.volume--;
            }
        }
    }
}









