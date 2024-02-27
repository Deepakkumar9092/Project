import com.shoppingapp.application.GSShopFactory;
import com.shoppingapp.framework.NormalAcc;
import com.shoppingapp.framework.ShopAcc;
import com.shoppingapp.framework.ShopFactory;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ShopFactory shopFactory = new GSShopFactory();
        ShopAcc normalAcc = shopFactory.getNewNormalAcc(101, "Atharv", 2000, 0);
        System.out.println(normalAcc);
        ShopAcc primeAcc = shopFactory.getNewPrimeAcc(202, "Sandeep Mahawar", 100, true);
        System.out.println(primeAcc);
    }
}
