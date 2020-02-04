import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordPlayerTest {

    RecordPlayer deck;




    @Before

    public void before(){
        deck = new RecordPlayer("Sony", "Entry");
    }

    @Test
    public void hasMake(){
        assertEquals("Sony", deck.getMake());
    }

    @Test
    public void hasModule(){
        assertEquals("Entry", deck.getModule());
    }

    @Test
    public void hasVolumeLevel(){
        assertEquals(5, deck.getVolumeLevel());
    }
    @Test
    public void hasPowerOn(){
        assertEquals(false, deck.isPowerOn());
    }

    @Test
    public void canPowerOn(){
        deck.powerOn();
        assertEquals(true, deck.isPowerOn());
    }

    @Test
    public void canPowerOff(){
        deck.powerOn();
        deck.powerOff();
        assertEquals(false, deck.isPowerOn());
    }

    @Test
    public void canVolumeUp(){
        deck.volumeUp();
        assertEquals(6, deck.getVolumeLevel());
    }

    @Test
    public void canVolumeDown(){
        deck.volumeDown();
        assertEquals(4, deck.getVolumeLevel());
    }

    @Test
    public void canPlay(){
        assertEquals("Play", deck.play());
    }
    @Test
    public void canStop(){
        assertEquals("Stop", deck.stop());
    }

    @Test
    public void canChangeSpeed(){
        deck.changeSpeed();
        assertEquals(45, deck.getSpeed());
    }
    @Test
    public void canChangeSpeedBack(){
        deck.changeSpeed();
        deck.changeSpeed();
        assertEquals(33, deck.getSpeed());
    }

}
