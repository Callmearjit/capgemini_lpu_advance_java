package com.example._thMarch_city_library.service;

import com.example._thMarch_city_library.entity.BorrowRecord;

public interface BorrowService {

    BorrowRecord borrowBook(Long userId, Long bookId);

}
