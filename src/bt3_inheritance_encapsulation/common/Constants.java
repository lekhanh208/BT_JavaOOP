package bt3_inheritance_encapsulation.common;

public class Constants {
    private static String browser;
    private static boolean report;
    private static boolean headless;

    public static String getBrowser() {
        return browser;
    }

    public static boolean isReport() {
        return report;
    }

    public static boolean isHeadless() {
        return headless;
    }

    public static void setBrowser(String browser) {
        Constants.browser = browser;
    }

    public static void setReport(boolean report) {
        Constants.report = report;
    }

    public static void setHeadless(boolean headless) {
        Constants.headless = headless;
    }
}
