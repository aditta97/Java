
package pkginterface;

public interface NewInterface {
    abstract int fun(int y, int z);
    default void tt() {
        System.out.println("show");
    }
}
