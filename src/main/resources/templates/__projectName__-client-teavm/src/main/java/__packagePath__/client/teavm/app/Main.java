package @packageName@.client.teavm.app;

public class Main {
    public static void main(String[] args) {
        DaggerInjector.create().getBootstrap().onBootstrap();
    }
}
