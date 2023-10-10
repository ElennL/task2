public class Piano implements Instruments {
    @Override
    public String play() {
        return "Playing ";
    }

    public void getInfo() {
        System.out.println("Piano types");
    }

}
