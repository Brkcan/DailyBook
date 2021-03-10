package com.dailybook.dao.enums;

public enum DailyBookEnum {

	DAILY_BOOK_NICK_NAME("nickName"),
	DAILY_BOOK_UTIL_DATE("utilDate"),
	DAILY_BOOK_DAILY("daily"),
	DAILY_BOOK_SUBJECT("subjectDaily");
	
	private String dailyBook;
	
	DailyBookEnum(String dailyBook) {
		this.dailyBook=dailyBook;
	}
	
	public String getDailyBook() {
		return dailyBook;
	}
	
}
