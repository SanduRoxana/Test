package repositories; // in acest pachet - clase care se ocupa de persistenta datelor, informatiile din aplicatie
                        // este standard in aplicatie

import org.springframework.stereotype.Repository;

@Repository
public class TransactionRepository {
    private String nume;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "TransactionRepository{" +
                "nume='" + nume + '\'' +
                '}';
    }
}
