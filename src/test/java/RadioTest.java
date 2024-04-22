import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @BeforeAll
    static void setUp() {
        System.out.println("Тесты запущены");
    }

    @AfterAll
    static void tearDown() {
        System.out.println("Тесты выполнены");
    }

    @Test
    void shouldSetCurrentRadio() {
        Radio radio = new Radio();

        radio.setCurrentRadio(5);

        int expected = 5;
        int actual = radio.getCurrentRadio();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetToMaxRadio() {
        Radio radio = new Radio();

        radio.setToMaxRadio();

        int expected = 9;
        int actual = radio.getCurrentRadio();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetToMinRadio() {
        Radio radio = new Radio();

        radio.setToMinRadio();

        int expected = 0;
        int actual = radio.getCurrentRadio();

        assertEquals(expected, actual);
    }

    @Test
    void shouldNotSetCurrentRadioAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentRadio(10);

        int expected = 0;
        int actual = radio.getCurrentRadio();

        assertEquals(expected, actual);
    }

    @Test
    void shouldNotSetCurrentRadioBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentRadio(-1);

        int expected = 0;
        int actual = radio.getCurrentRadio();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetNextRadio() {
        Radio radio = new Radio();
        radio.setCurrentRadio(5);

        radio.setNextRadio();

        int expected = 6;
        int actual = radio.getCurrentRadio();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetNextRadioMax() {
        Radio radio = new Radio();
        radio.setCurrentRadio(9);

        radio.setNextRadio();

        int expected = 0;
        int actual = radio.getCurrentRadio();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetNextRadioMin() {
        Radio radio = new Radio();
        radio.setCurrentRadio(0);

        radio.setNextRadio();

        int expected = 1;
        int actual = radio.getCurrentRadio();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetNextRadioMoreMax() {
        Radio radio = new Radio();
        radio.setCurrentRadio(10);

        radio.setNextRadio();

        int expected = 1;
        int actual = radio.getCurrentRadio();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetNextRadioMoreMin() {
        Radio radio = new Radio();
        radio.setCurrentRadio(-1);

        radio.setNextRadio();

        int expected = 1;
        int actual = radio.getCurrentRadio();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetPervRadio() {
        Radio radio = new Radio();
        radio.setCurrentRadio(5);

        radio.setPervRadio();

        int expected = 4;
        int actual = radio.getCurrentRadio();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetPervRadioMax() {
        Radio radio = new Radio();
        radio.setCurrentRadio(9);

        radio.setPervRadio();

        int expected = 8;
        int actual = radio.getCurrentRadio();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetPervRadioMin() {
        Radio radio = new Radio();
        radio.setCurrentRadio(0);

        radio.setPervRadio();

        int expected = 9;
        int actual = radio.getCurrentRadio();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetPervRadioMoreMax() {
        Radio radio = new Radio();
        radio.setCurrentRadio(10);

        radio.setPervRadio();

        int expected = 9;
        int actual = radio.getCurrentRadio();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetPervRadioMoreMin() {
        Radio radio = new Radio();
        radio.setCurrentRadio(-1);

        radio.setPervRadio();

        int expected = 9;
        int actual = radio.getCurrentRadio();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);

        int expected = 50;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetToMaxVolume() {
        Radio radio = new Radio();

        radio.setToMaxVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetToMinVolume() {
        Radio radio = new Radio();

        radio.setToMinVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldNotSetCurrentVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldNotSetCurrentVolumeBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetUpVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);

        radio.setUpVolume();

        int expected = 51;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetUpVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.setUpVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetUpVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.setUpVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetUpVolumeMoreMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        radio.setUpVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetUpVolumeMoreMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        radio.setUpVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetDownVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);

        radio.setDownVolume();

        int expected = 49;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetDownVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.setDownVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetDownVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.setDownVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetDownVolumeMoreMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        radio.setDownVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetDownVolumeMoreMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        radio.setDownVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
}