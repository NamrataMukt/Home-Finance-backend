package in.cjctech.wonderhomeapp.app.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PreviousLoanDetails 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long previousloanId;
	private Double previousloanAmount;
	private Double paidAmount;
	private Double remainingAmount;
	private int tenure;
	private String bankName;
	private String ifscCode;
	private String bankAddress;
	

}