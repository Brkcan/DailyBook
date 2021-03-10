package com.dailybook.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dailybook.dao.DailyBookDAO;
import com.dailybook.entity.DailyBook;

@Service
public class DailyBookServiceImpl implements DailyBookService{

	private DailyBookDAO dailyBookDAO;
	
	public DailyBookServiceImpl(DailyBookDAO theDailyBookDAO) {
		dailyBookDAO = theDailyBookDAO;
	}
	
	@Override
	public Integer addDailyBook(DailyBook dailyBook) {
		return dailyBookDAO.addDailyBook(dailyBook);
	}
	
	@Override
	public List<DailyBook> getDailyBook() {
		return dailyBookDAO.getDailyBook();
	}

}
