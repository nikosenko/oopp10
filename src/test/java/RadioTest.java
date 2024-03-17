import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio;

//Номер текущей радиостанции может принимать значения только в пределах от 0 до 9.
public class RadioTest {
    //1
  @Test
    public void shouldGetCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);


        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    //2

    @Test
    public void shouldGetCurrentStationAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);


        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }
//3


    @Test
    public void shouldGetCurrentStationBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-2);


        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }


    //4

    //Если текущая радиостанция 9 и клиент нажал на кнопку next (=вызвал одноимённый метод next, с англ. — следующая) на пульте, то текущей должна стать нулевая. В остальных случаях при нажатии на эту же кнопку радио переключается просто на следующую станцию.
    @Test

    public void nextStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void nextStation5() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.nextStation();
        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    //5
    //Если текущая радиостанция 0 и клиент нажал на кнопку prev (=вызвал одноимённый метод prev, с англ. — предыдущая) на пульте, то текущей должна стать девятая. В остальных случаях радио переключается просто на предыдущую станцию.
    @Test
    public void prevStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevStation4() {
        Radio radio = new Radio();

        radio.setCurrentStation(4);
        radio.prevStation();
        int expected = 3;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    //6
    //Клиент должен иметь возможность увеличивать и уменьшать уровень громкости звука в пределах от 0 до 100.
    @Test
    public void setVolume() {
        Radio radio = new Radio();
        radio.setVolume(5);


        int expected = 5;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setVolume101() {
        Radio radio = new Radio();
        radio.setVolume(101);


        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setVolumeMinus1() {
        Radio radio = new Radio();
        radio.setVolume(-1);


        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);

    }

    //7
    @Test
    void volumeUpForOne() {
        Radio radio = new Radio();
        int volume = 80;
        radio.setVolume(volume);
        radio.volumeUpForOne();
        int expected = 81;
        Assertions.assertEquals(expected, radio.getVolume());
    }

    @Test
    void volumeUpForOne101() {
        Radio radio = new Radio();
        int volume = 100;
        radio.setVolume(volume);
        radio.volumeUpForOne();
        int expected = 100;
        Assertions.assertEquals(expected, radio.getVolume());
    }
//8

    @Test
    void volumeDownForOne() {
        Radio radio = new Radio();
        int volume = 0;
        radio.setVolume(volume);
        radio.volumeDownForOne();
        int expected = 0;
        Assertions.assertEquals(expected, radio.getVolume());

    }

    @Test
    void volumeDownForOne5() {
        Radio radio = new Radio();
        int volume = 5;
        radio.setVolume(volume);
        radio.volumeDownForOne();
        int expected = 4;
        Assertions.assertEquals(expected, radio.getVolume());

    }
}
