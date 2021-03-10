package com.dailybook.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.dailybook.entity.DailyBook;

public class DailyBookRowMapper implements RowMapper<DailyBook>{
	
	
	@Override
	public DailyBook mapRow(ResultSet rs, int rowNum) throws SQLException {
		DailyBook book = new DailyBook();
		
		book.setId(rs.getInt("id"));
		book.setNickName(rs.getString("nickName"));
		book.setDaily(rs.getString("daily"));
		book.setSubjectDaily(rs.getString("subjectDaily"));
		book.setUtilDate(rs.getDate("utilDate"));
		return book;
	}	

}
