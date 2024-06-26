package in.cjctech.wonderhomeapp.app.serviceimpl;






import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import in.cjctech.wonderhomeapp.app.model.SanctionLetter;

import in.cjctech.wonderhomeapp.app.repository.SanctionLetterRepository;
import in.cjctech.wonderhomeapp.app.service.SanctionLetterService;
import in.cjctech.wonderhomeapp.app.utility.EmailHelper;




import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.cjctech.wonderhomeapp.app.model.SanctionLetter;
import in.cjctech.wonderhomeapp.app.repository.SanctionLetterRepository;
import in.cjctech.wonderhomeapp.app.service.SanctionLetterService;


@Service
public class SanctionLetterServiceImpl implements SanctionLetterService
{
		@Autowired
		private SanctionLetterRepository sr;
		@Autowired EmailHelper emailHelper;
		
	@Override
	public SanctionLetter saveSanctionLetter(SanctionLetter s)
	{
		
		return sr.save(s);
	}

	@Override
	public List<SanctionLetter> getAll() 
	{
	
		return sr.findAll();
	}



	
@Override
	public SanctionLetter findbysid(long sid) 
	{
	
		SanctionLetter list1=  sr.findById(sid);
		return list1;

	}


	@Override
	public void getDataBysanctionId(long id) {
		// TODO Auto-generated method stub
		
		emailHelper.emailsendComponent(sr.findById(id), true);
	}

	
	
	


}
