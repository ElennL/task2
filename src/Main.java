public class Main {
    public static void main(String[] args) {
        Piano piano = new Piano();
        piano.getInfo();
        System.out.println(piano.play());
        System.out.println();

        Instruments upright = new UprightPiano(new Piano());
        upright.getInfo();
        System.out.println(upright.play());
        System.out.println();

        Instruments digital = new DigitalPiano(new Piano());
        digital.getInfo();
        System.out.println(digital.play());
        System.out.println();

        Instruments a = new DigitalPiano(new UprightPiano(new Piano()));
        System.out.println(a.play());
    }
}