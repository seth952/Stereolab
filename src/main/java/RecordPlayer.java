public class RecordPlayer extends Component implements IPlayer {
    private int speed;

    public RecordPlayer(String make, String module) {
        super(make, module);
        this.speed = 33;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String play() {
        return ("Play");
    }

    @Override
    public String stop() {
        return ("Stop");
    }

    public void changeSpeed(){
        if (this.speed == 33) {
            this.speed = 45;
        } else {this.speed = 33;}
        }
    }

