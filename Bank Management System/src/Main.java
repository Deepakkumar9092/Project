
import com.atharv.casestudy.framework.BankFactory;
import com.atharv.casestudy.framework.CurrentAcc;
import com.atharv.casestudy.framework.MMBankFactory;
import com.atharv.casestudy.framework.SavingAcc;


public class Main {
    public static void main(String[] args) {

        BankFactory bankFactory = new MMBankFactory();

        SavingAcc savingAcc = bankFactory.getNewSavingAcc(101, "John", 5000, true);
        CurrentAcc currentAcc = bankFactory.getNewCurrentAcc(201, "Smith", 10000, 5000);

        // Testing withdraw and toString methods
        savingAcc.withdraw(2000);
        System.out.println(savingAcc);

        currentAcc.withdraw(8000);
        System.out.println(currentAcc);
    }
}