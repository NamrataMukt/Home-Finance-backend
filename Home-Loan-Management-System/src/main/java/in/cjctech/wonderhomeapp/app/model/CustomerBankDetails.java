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

public class CustomerBankDetails 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bankdetailsId;
	
	private long bankAccountNo;
	private  String bankName;
	private String bankIFSCCode;
	private String bankAddress;
	private long bankConatactNo;
	@Lob
	@Column(length=999999999)
	private byte[] bankStatment;//pdf
	

}
