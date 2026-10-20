import java.util.HashMap;

public class LoanRepo {

    private HashMap<Integer, Object> loanDb = new HashMap<>();

    public void addLoan(LoanDto loanDto) {

        loanDb.put(loanDto.getId(), loanDto);

    }

    public LoanDto getLoanById(int id) throws IllegalArgumentException {
        if (loanDb.containsKey(id)) {
            return loanDb.get(id);
        }

        throw new IllegalArgumentException(" Loan Id is not found !");
    }
}
