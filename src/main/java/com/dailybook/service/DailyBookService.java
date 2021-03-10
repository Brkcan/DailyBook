package com.dailybook.service;

import java.util.List;

import com.dailybook.entity.DailyBook;

public interface DailyBookService {

	List<DailyBook> getDailyBook();
	Integer addDailyBook(DailyBook dailyBook);
}
