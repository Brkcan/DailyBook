package com.dailybook.rest;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dailybook.entity.DailyBook;
import com.dailybook.service.DailyBookService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class DailyBookRest {

	public DailyBookService dailyBookService;

	@Autowired
	public DailyBookRest(DailyBookService theDailyBookService) {
		dailyBookService = theDailyBookService;
	}

	@GetMapping("/selam")
	public String welcome ()
	{
		return "Selam Spring";
	}

	@PostMapping(value = "/addInsert", produces="application/json")
	public DailyBook addDailyBook(@RequestBody DailyBook dailyBook)
	{
		dailyBook.setId(0);
		dailyBook.setUtilDate(new Date());
		dailyBookService.addDailyBook(dailyBook);
		return dailyBook;
	}


	@GetMapping(value = "/getDailyBook")
	public List<DailyBook> getDailyBooklist()
	{
		return dailyBookService.getDailyBook();
	}

}
