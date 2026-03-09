package com.example._thMarch_city_library.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example._thMarch_city_library.Exception.ResourceNotFoundException;
import com.example._thMarch_city_library.entity.Book;
import com.example._thMarch_city_library.entity.BorrowRecord;
import com.example._thMarch_city_library.entity.User;
import com.example._thMarch_city_library.repo.BookRepository;
import com.example._thMarch_city_library.repo.BorrowRecordRepository;
import com.example._thMarch_city_library.repo.UserRepository;

@Service
public class BorrowServiceImpl implements BorrowService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BorrowRecordRepository borrowRecordRepository;

    @Override
    public BorrowRecord borrowBook(Long userId, Long bookId) {

        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        Book book = bookRepository.findById(bookId)
                .orElseThrow(() -> new RuntimeException("Book not found"));

        if(!book.isAvailable()){
        	throw new ResourceNotFoundException("User not found");
        }

        BorrowRecord record = new BorrowRecord();
        record.setUser(user);
        record.setBook(book);
        record.setBorrowDate(LocalDate.now());
        record.setReturned(false);

        book.setAvailable(false);

        bookRepository.save(book);

        return borrowRecordRepository.save(record);
    }
}
