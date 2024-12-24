package com.example.demo.Service;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.Model.Expense;
import com.example.demo.Repository.MainRepository;

@Service
public class MainService {
private final MainRepository mainRepository;

public MainService(MainRepository mainRepository) {
	this.mainRepository=mainRepository;	
}


public Expense create(Expense expense) {
		return mainRepository.save(expense);
}

public List<Expense> alldata() {
	return (List<Expense>) mainRepository.findAll();
}


public Expense dataById(Long id) {
	Optional<Expense> optionalExpense = mainRepository.findById(id);
    return optionalExpense.orElse(null);
}

public void del(Long id) {
	 mainRepository.deleteById(id);
}


public Expense updatePage(Expense expense) {
        return mainRepository.save(expense);
}
}