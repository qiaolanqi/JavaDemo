import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public class ReferenceTest {

    public static void main(String[] args) {
        testWeakReference();

        testPhantomReference();
    }

    private static void testPhantomReference() {
        ReferenceQueue<String> queue = new ReferenceQueue<String>();
        PhantomReference<String> pr = new PhantomReference<String>(new String("hello"), queue);
        System.out.println(pr.get());
    }

    private static void testWeakReference() {
        WeakReference<String> sr = new WeakReference<String>(new String("hello"));

        System.out.println(sr.get());
        System.gc(); // 通知JVM的gc进行垃圾回收
        System.out.println(sr.get());
    }
}
