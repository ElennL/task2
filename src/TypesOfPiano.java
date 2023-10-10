public abstract class TypesOfPiano implements Instruments{
    protected Instruments i;

    public TypesOfPiano(Instruments i) {
        this.i = i;
    }

    @Override
    public void getInfo() {
        this.i.getInfo();
    }

    @Override
    public String play() {
        return i.play();
    }
}
