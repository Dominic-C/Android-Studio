package Q2;

import java.util.Comparator;
//starting code

public class AccountComparator implements Comparator<Account> {
    @Override
    public int compare(Account account, Account t1) {
        return account.getId().compareTo(t1.getId());
    }
}
