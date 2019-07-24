
package getdesktoppath;

public class GetDesktopPath {

    public static void main(String[] args) {
        try {
            String desktopPath = System.getProperty("user.home") + "/Desktop";
            System.out.print(desktopPath.replace("\\", "/"));
        } catch (Exception e) {
            System.out.println("Exception caught =" + e.getMessage());
        }
    }

}
