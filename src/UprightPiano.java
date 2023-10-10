public class UprightPiano extends TypesOfPiano {
    public UprightPiano(Instruments i) {
        super(i);
    }

    @Override
    public String play() {
        return super.play() + " an upright piano";
    }

    @Override
    public void getInfo() {
        System.out.println("Upright piano");
    }
}
