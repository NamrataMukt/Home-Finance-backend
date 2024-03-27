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
public class StatusCheck {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long statusId;
	private long customerId;
	private String customerName;
	private long customerMobileNumber;
	private String customerEmailId;
	public String status;
	
}
