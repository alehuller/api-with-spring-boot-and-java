package br.com.erudio.mapper.custom;

import java.util.Date;

import org.springframework.stereotype.Service;

import br.com.erudio.data.vo.v1.BookVO;
import br.com.erudio.model.Book;


@Service
public class BookMapper {
	
	public BookVO convertEntityToVo(Book book) {
		BookVO vo = new BookVO();
		vo.setKey(book.getId());
		vo.setAuthor(book.getAuthor());
		vo.setLaunchDate(book.getLaunchDate());
		vo.setPrice(book.getPrice());
		vo.setTitle(book.getTitle());
		return vo;
	}
	
	public Book convertVoToEntity(BookVO book) {
		Book entity = new Book();
		entity.setId(book.getKey());
		entity.setAuthor(book.getAuthor());
		entity.setLaunchDate(book.getLaunchDate());
		entity.setPrice(book.getPrice());
		entity.setTitle(book.getTitle());
		return entity;
	}
}
