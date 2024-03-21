package in.cjctech.wonderhomeapp.app.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import in.cjctech.wonderhomeapp.app.model.BuilderDetails;

public interface BuilderDetailsService 
{

	
	public BuilderDetails addBuilder(String builderdetails, MultipartFile BPan, MultipartFile Baadhar);

	public List<BuilderDetails> getAllData();

}
