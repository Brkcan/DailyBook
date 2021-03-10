package com.dailybook.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dailybook.dao.enums.DailyBookEnum;
import com.dailybook.entity.DailyBook;
import com.dailybook.rowmapper.DailyBookRowMapper;
import com.dailybook.sql.DailyBookSql;

@Repository
public class DailyBookDAOImpl implements DailyBookDAO{
	
	private final Map<String, Object> paramMap = new HashMap<>();
	
	@Autowired
	private DailyBookSql dailyBookSql;
	
	@Autowired
	@Qualifier("dataSource")
	private DataSource dataSource;
	
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	
	@PostConstruct
	public void PostConstruct ()
	{
		jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}
	

	@Override
	public Integer addDailyBook(DailyBook dailyBook) {
		paramMap.put(DailyBookEnum.DAILY_BOOK_NICK_NAME.getDailyBook(), dailyBook.getNickName());
		paramMap.put(DailyBookEnum.DAILY_BOOK_DAILY.getDailyBook(), dailyBook.getDaily());
		paramMap.put(DailyBookEnum.DAILY_BOOK_UTIL_DATE.getDailyBook(), dailyBook.getUtilDate());
		paramMap.put(DailyBookEnum.DAILY_BOOK_SUBJECT.getDailyBook(), dailyBook.getSubjectDaily());
		
		try {
			return jdbcTemplate.update(dailyBookSql.getSqlListInsertDailyBook(), paramMap);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	@Override
	public List<DailyBook> getDailyBook() {
	
		List<DailyBook> dailyBooks = new ArrayList<DailyBook>();		
	
		try {
			dailyBooks = jdbcTemplate.query(dailyBookSql.getSqlListGetDailyBook(), new DailyBookRowMapper());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return dailyBooks;
	}

}
