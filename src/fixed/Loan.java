package fixed;

public interface Loan extends Payment {

    void initiateLoanSettlement();

    void initiateRePayment();
}