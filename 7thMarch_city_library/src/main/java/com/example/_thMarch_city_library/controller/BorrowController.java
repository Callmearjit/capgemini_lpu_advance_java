package com.example._thMarch_city_library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example._thMarch_city_library.entity.BorrowRecord;
import com.example._thMarch_city_library.repo.BorrowRecordRepository;
import com.example._thMarch_city_library.service.BorrowService;

@RestController
@RequestMapping("/api/borrow")
public class BorrowController {

    @Autowired
    private BorrowService borrowService;
    @Autowired
    private BorrowRecordRepository borrowRecordRepository;

    @PostMapping
    public ResponseEntity<BorrowRecord> borrowBook(
            @RequestParam Long userId,
            @RequestParam Long bookId) {

        BorrowRecord record = borrowService.borrowBook(userId, bookId);

        return ResponseEntity.ok(record);
    }
    @GetMapping
    public List<BorrowRecord> getAllBorrowRecords() {

        return borrowRecordRepository.findAll();
    }

   
    @GetMapping("/{id}")
    public ResponseEntity<BorrowRecord> getBorrowRecordById(@PathVariable Long id) {

        BorrowRecord record = borrowRecordRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Record not found"));

        return ResponseEntity.ok(record);
    }

}
