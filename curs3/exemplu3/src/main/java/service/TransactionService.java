package service; // in acest pachet - partea care tine de procesare de date; aici se afla logica aplicatiei
                // este standard in aplicatia spring

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import repositories.TransactionRepository;

@Component
public class TransactionService {

    @Autowired //Nu pot sa gasesc bean ul doar cu aceasta adnotare, ne trebuie @Component
                // Se poate pune pe field, pe setter sau pe constructor; de obicei nu se foloseste pe setter
    private TransactionRepository transactionRepository;

    public TransactionRepository getTransactionRepository() {
        return transactionRepository;
    }


    public void setTransactionRepository(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public String toString() {
        return "TransactionService{" +
                "transactionRepository=" + transactionRepository +
                '}';
    }
}
