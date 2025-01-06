package Utilities;

import Pages.*;
import Utilities.BaseClass;

public class PageInitializer extends BaseClass {


    public static ApperalAndccessoriesPage aaap;
    public static BooksPage bp;
    public static FragrancePage fp;
    public static HairCarePage hcp;
    public static HomePage hp;
    public static MakeupPage mup;
    public static MenPage menp;
    public static SkinCarePage scp;
    public static ShoppingCartPage shcp;

    public static void initialize(){
        aaap = new ApperalAndccessoriesPage();
        bp = new BooksPage();
        fp = new FragrancePage();
        hcp = new HairCarePage();
        hp = new HomePage();
        mup = new MakeupPage();
        menp = new MenPage();
        scp = new SkinCarePage();
        shcp = new ShoppingCartPage();
    }

}
