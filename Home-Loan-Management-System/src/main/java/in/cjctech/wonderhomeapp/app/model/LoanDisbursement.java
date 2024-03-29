package in.cjctech.wonderhomeapp.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
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
	private long loanNumber;
	private String aggrementDate;
	private String amountPayTime;
	private double totalAmount;
	private String bankName;
	private long accountNumber;
	private String ifscCode;
	private String AccountType;
	private double transferAmount;
	private String paymentStatus;
	private String amountPaidDate;
	
	@Lob
	@Column(length=999999999)
	private byte[] propertyInsurance;


}
