import annotation.GetPublicThings;
import scene.RO;
import object.*;

@GetPublicThings
public class Main {
    public static void main(String[] args) {
        RO b = new RO();
        for (int i = 0; i < 10; i++) {
            SimpleObject a = b.genSimple();
            System.out.println(a.text());
        }
    }
}