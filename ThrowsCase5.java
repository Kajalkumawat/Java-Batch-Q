public class ThrowsCase5 {
    // multiple exception with throw keyword yes
    void show() throws Exception {
        throw new Exception("hello world");
    }

    public static void main(String[] args) {
        ThrowsCase5 t = new ThrowsCase5();
        try {
            t.show();
        } catch (Exception ex) {

        }
    }
}