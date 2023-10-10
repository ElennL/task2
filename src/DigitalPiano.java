public class DigitalPiano extends TypesOfPiano{
    public DigitalPiano(Instruments i) {
        super(i);
    }

    @Override
    public String play() {
        return super.play() + " digital piano";
    }

    @Override
    public void getInfo() {
        System.out.println("Digital piano");
    }
}
