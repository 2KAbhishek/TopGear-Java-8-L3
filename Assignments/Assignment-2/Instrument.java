public class Instrument implements Guitar, Piano {
    @Override
    public void play() {
        System.out.println(" is being played");
    }

    public static void main(String[] args) {
        Guitar guitar = new Instrument();
        Piano piano = new Instrument();
        System.out.print("Guitar");
        guitar.play();
        System.out.print("Piano");
        piano.play();
    }
}
