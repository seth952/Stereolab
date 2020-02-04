import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    private Stereo stereo;
    private RecordPlayer deck;
    private Radio radio;

    @Before
    public void before(){
        deck = new RecordPlayer("Sony", "Entry");
        radio = new Radio("Sony", "Entry");
        stereo = new Stereo(radio, deck, "Ellie's Sounds");
    }

    @Test
    public void canPlayDeck(){
        assertEquals("Play", stereo.deckPlay());
    }

}
