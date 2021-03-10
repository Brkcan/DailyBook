package com.dailybook.dao;

import java.util.List;

import com.dailybook.entity.DailyBook;

public interface DailyBookDAO {

	public List<DailyBook> getDailyBook();
	
	public Integer addDailyBook(DailyBook dailyBook);
	
	
}
