public class MobileFactory {
    public Mobile CreateMobile(String name){
        if(null==name || name.isEmpty()) return null;
        else if("Iphone".equals(name)) return new Iphone();
        else if("OnePlus".equals(name)) return new OnePlus();
        else if("Realme".equals(name)) return new Realme();
        else return null;
    }
}
