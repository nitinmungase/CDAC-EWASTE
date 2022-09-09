package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Ewaste;

public interface EwasteService {
	
	public List<Ewaste>getItems();

	public Ewaste getItem(long itemId);
	
	public Ewaste addItem(Ewaste item);

	public Ewaste updateItem(Ewaste item);

	public void deleteItem(long parseLong);
}
