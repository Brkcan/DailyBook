package com.dailybook.sql;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@PropertySource("classpath:DailyBook.properties")
public class DailyBookSql {

	
	@Value("${SQL_LIST_GET_DAILY_BOOK}")
	private String sqlListGetDailyBook;
	
	@Value("${SQL_LIST_INSERT_DAILY_BOOK}")
	private String sqlListInsertDailyBook;

	public String getSqlListGetDailyBook() {
		return sqlListGetDailyBook;
	}

	public void setSqlListGetDailyBook(String sqlListGetDailyBook) {
		this.sqlListGetDailyBook = sqlListGetDailyBook;
	}

	public String getSqlListInsertDailyBook() {
		return sqlListInsertDailyBook;
	}

	public void setSqlListInsertDailyBook(String sqlListInsertDailyBook) {
		this.sqlListInsertDailyBook = sqlListInsertDailyBook;
	}
	
	
}
