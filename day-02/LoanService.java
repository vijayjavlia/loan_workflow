import java.util.List;

public class LoanService {

    private final List<String> STATUS = List.of("APPROVED", "REJECTED", "REVIEW", "SUBMITTED");

    LoanDto loan = null;
    LoanRepo lrepo = new LoanRepo();

    private String saveLoan(LoanDto loan) throws IllegalArgumentException {

        lrepo.addLoan(loan);

    }

    public String processLoanRequest(int id, String applicantid, String Status)
            throws IllegalArgumentException, UnknownError {

        if (id <= 0) {
            throw new IllegalArgumentException("Id should not be 0 or lesser");
        }

        if (applicantid.isBlank()) {
            throw new IllegalArgumentException("ApplicantId should not be 0 or lesser");
        }

        if (!STATUS.contains(Status.toUpperCase())) {

            throw new UnknownError("unknow status");
        }

        loan = new LoanDto(id, applicantid, Status);
        return saveLoan(loan);

    }

}
