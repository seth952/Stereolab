public class Stereo {
    private Radio radio;
    private RecordPlayer recordplayer;
    private String name;

    public Stereo(Radio radio, RecordPlayer recordplayer, String name) {
        this.radio = radio;
        this.recordplayer = recordplayer;
        this.name = name;
    }

    public void radioVolumeUp(){
        radio.volumeUp();
}

    public String deckPlay() {
        return recordplayer.play();
    }

    }
