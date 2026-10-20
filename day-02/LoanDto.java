
public class LoanDto {

    private int id;
    private String applicantId;
    private String status;

    public LoanDto(int id , String applicantId,String status){

        this.id=id;
        this.applicantId=applicantId;
        this.status=status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setApplicanId(String applicantId) {

        this.applicantId = applicantId;

    }

    public void setStatus(String staus) {

        this.status = staus;
    }

}
