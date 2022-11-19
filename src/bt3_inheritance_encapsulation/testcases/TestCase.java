package bt3_inheritance_encapsulation.testcases;

import bt3_inheritance_encapsulation.common.BaseTest;

public class TestCase extends BaseTest {
    public void logIn(String email, String password){
        TestCase tc = new TestCase();
        System.out.println("Test case 1: Verify that user can login");
        System.out.println("Environment test: ");
        tc.createDriver("Chrome",true,true);
        System.out.println("Step 1: User opens browser on device");
        System.out.println("Step 2: User navigate to url https://demo.activeitzone.com/ecommerce/login");
        System.out.println("Step 3: User enter email: " + email);
        System.out.println("Step 4: User enter password: " + password);
        System.out.println("Step 5: User click on Login button");
        tc.closeDriver();
    }

    public void addCategory(String name){
        TestCase tc = new TestCase();
        System.out.println("Test case 2: Verify that user can add new category");
        System.out.println("Environment test: ");
        tc.createDriver("Firefox",false,false);
        System.out.println("Step 1: Click on 'Products' item in menu");
        System.out.println("Step 2: Click on 'Category' item in drop-down list");
        System.out.println("Step 3: Click on 'Add new category' button");
        System.out.println("Step 4: Enter Name: " + name);
        System.out.println("Step 5: Click on 'Save' button");
        tc.closeDriver();
    }

    public static void main(String[] args) {
        TestCase tc = new TestCase();
        tc.logIn("admin@example.com","123456" );
        System.out.println(" ");
        tc.addCategory("Furniture");
    }
}
