
public class LoanRequest {

    LoanService service=    New LoanService();

    public LoanRequest(int id, String applicantId, String status) {

        try {
            service.processLoanRequest(id, applicantId, status);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (UnknownError e) {
            e.printStackTrace();
        }

    }

    public static void main(String args[]) {

        new LoanRequest(0, "LO01", "APPROVED");
    }

}
