package com.jt.expense_tracker;

import java.util.List;
// import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.jdbc.core.BeanPropertyRowMapper;
// import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@CrossOrigin("http://localhost:5173")
public class ExpenseController {

    private final ExpenSeservice expenSeservice;

    @GetMapping("/expenses")
    public List<Expense> getExpenses() {
        return expenSeservice.getExpenses();
    }

    @GetMapping("/expenses/{id}")
    public Expense getExpenseById(@PathVariable int id) {

        return expenSeservice.getExpenseById(id);

    }

    @PostMapping("/expenses")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Expense createExpense(@RequestBody Expense expense) {
        return expenSeservice.addExpense(expense);

        // return expenseRepository.save(expense);
    }

    @DeleteMapping("/expenses/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteExpense(@PathVariable int id) {

        expenSeservice.deleteExpenseById(id);

    }

    @PutMapping("/expenses")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Expense updateExpense(@RequestBody Expense expense) {

        return expenSeservice.updateExpense(expense);

    }

}
