package bt3_inheritance_encapsulation.common;

public class BaseTest{
    public void createDriver(String browser, boolean report, boolean headless) {
        Constants.setBrowser(browser);
        Constants.setReport(report);
        Constants.setHeadless(headless);
        System.out.println("- Browser: " + Constants.getBrowser());
        System.out.println("- Report: " + Constants.isReport());
        System.out.println("- Headless: " + Constants.isHeadless());
    }

    public void closeDriver(){
        System.out.println("Close browser: " + Constants.getBrowser());
    }
}
