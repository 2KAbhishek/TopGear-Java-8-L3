public interface Guitar {
    default public void play() {
        System.out.println("Guitar is being played");
    };
}
