public class Nachalo {

    @AfterSuite
    public void afterTest(){
        System.out.println("After test");
    }

    @Test (10)
    public void test10(){
        System.out.println("Тест 10");
    }

    @Test(7)
    public void test7(){
        System.out.println("Тест 7");
    }

    @Test(4)
    public void test4(){
        System.out.println("Тест 4");
    }

    @Test(1)
    @AfterSuite
    public void test1(){
        System.out.println("Тест 1");
    }

    @BeforeSuite
    public void beforeTest(){
        System.out.println("Before test");
    }
}