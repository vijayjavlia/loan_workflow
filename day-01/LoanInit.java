import java.util.HashMap;

public class LoanInit {

    public static void main(String[] args) {

     try {
         LoanService loanService=new LoanService("L01", 10);
          LoanService loanService1=new LoanService("L02", 100);
          System.out.print("LOAN CREATED !");
         
             System.out.println(loanService.getLoanBalance("L01"));
             System.out.println(loanService1.getLoanBalance("L02"));
            
         } catch ( IllegalArgumentException e) {
           e.printStackTrace();
           System.err.println("Exception "+e.getMessage());
         } catch(Exception e){
            e.printStackTrace();
           System.err.println(" Exception "+e.getMessage());
         }
        
        
         
    }

    

}

 class  LoanService {

       private HashMap<String, Integer> loan = new HashMap<>();

        public LoanService(String loanId, int loanAmount) throws IllegalArgumentException {

            saveLoan(loanId, loanAmount);

        }

        private void saveLoan(String loanId, int ammount) throws IllegalArgumentException {

            if (loanId.isBlank() || loanId == null) {
                throw new IllegalArgumentException("Loan Id should not be empty.");
            }
            if (ammount <= 0) {
                throw new NumberFormatException("Loan ammount should not be 0 or negative ");
            }

            loan.put(loanId, ammount);
        }

        public int getLoanBalance(String loanId) throws IllegalArgumentException, Exception {

            if (loanId.isBlank() || loanId == null) {
                throw new IllegalArgumentException("Loan Id should not be empty.");
            }

            if (!loan.containsKey(loanId)) {
                throw new Exception("Loan Id not found !");
            }

            return loan.get(loanId);
        }

    }