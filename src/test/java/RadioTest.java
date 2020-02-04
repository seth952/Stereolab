import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {
    Radio radio;

    @Before

    public void before(){
    radio = new Radio("Sony", "Entry");
    }

    @Test
    public void hasMake(){
        assertEquals("Sony", radio.getMake());
    }

    @Test
    public void hasModule(){
        assertEquals("Entry", radio.getModule());
    }

    @Test
    public void hasVolumeLevel(){
        assertEquals(5, radio.getVolumeLevel());
    }
    @Test
    public void hasPowerOn(){
        assertEquals(false, radio.isPowerOn());
    }

    @Test
    public void canPowerOn(){
        radio.powerOn();
        assertEquals(true, radio.isPowerOn());
    }

    @Test
    public void canPowerOff(){
        radio.powerOn();
        radio.powerOff();
        assertEquals(false, radio.isPowerOn());
    }

    @Test
    public void canVolumeUp(){
        radio.volumeUp();
        assertEquals(6, radio.getVolumeLevel());
    }

    @Test
    public void canVolumeDown(){
        radio.volumeDown();
        assertEquals(4, radio.getVolumeLevel());
    }

    @Test
    public void canTune(){
        assertEquals("Radio 1", radio.tune("Radio 1"));
    }

}
