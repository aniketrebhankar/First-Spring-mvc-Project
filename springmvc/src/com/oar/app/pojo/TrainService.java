package com.oar.app.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainService {
	@Autowired
	TrainDao trainDao;
	public Train saveTrain(Train train)
	{
		return trainDao.saveTrain(train);
	}

}
