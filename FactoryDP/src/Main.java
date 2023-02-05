public class Main {
    public static void main(String[] args) {
        MobileFactory mobileFactory=new MobileFactory();
        Mobile mobile= mobileFactory.CreateMobile("Iphone");
        mobile.CreateMobile();
        mobile=mobileFactory.CreateMobile("Realme");
        
    }
}