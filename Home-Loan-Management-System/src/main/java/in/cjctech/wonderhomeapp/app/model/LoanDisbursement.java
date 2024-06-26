package in.cjctech.wonderhomeapp.app.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class LoanDisbursement 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long aggrementId;
	private long sanctionId;
	private String applicantName ;
	private long loanNumber;
	@Temporal(TemporalType.DATE)
	private String aggrementDate;
	private String amountPayType;
	private double totalAmount;
	private String bankName; //builder
	private long accountNumber;
	private String ifscCode;
	private double transferAmount;
	private String paymentStatus;
	@Temporal(TemporalType.DATE)
	private String amountPayDate;




}
