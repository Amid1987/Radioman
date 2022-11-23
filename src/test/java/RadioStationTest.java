import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioStationTest {
    Radio rad = new Radio();

    @Test
    public void shouldSetRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(15);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldAboveTheMaxRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(17);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldBelowTheMinRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(-5);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldMinusOneRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldZeroRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(0);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldOneRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(1);
        int expected = 1;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNineRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(9);
        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldTenRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(10);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNextRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(1);
        rad.nextRadioStation();
        int expected = 2;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test //кнопка next3(4)
    public void shouldNextRadioStation3() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(3);
        rad.nextRadioStation();
        int expected = 4;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNextRadioStation0() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(0);
        rad.nextRadioStation();
        int expected = 1;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNextRadioStation8() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(8);
        rad.nextRadioStation();
        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPrevRadioStation4() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(4);
        rad.prevRadioStation();
        int expected = 3;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPrevRadioStation0() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(0);
        rad.prevRadioStation();
        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCurrentVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(30);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldAboveTheMaxVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(30);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldBelowTheMinVolume() {
        Radio rad = new Radio(); //
        rad.setCurrentVolume(-5);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldMinusOneVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldZeroVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldMinVolume() {
        Radio rad = new Radio();
        rad.setToMinVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}




