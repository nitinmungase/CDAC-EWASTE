package com.springrest.springrest.services;

//import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.EwasteDao;
import com.springrest.springrest.entities.Ewaste;

@Service
public class EwasteServiceimpl implements EwasteService  {
	
	@Autowired
	private EwasteDao ewasteDao;

	public EwasteServiceimpl() {
		
	}

	@Override
	public List<Ewaste> getItems() {
		return ewasteDao.findAll();
	}

	@Override
	public Ewaste getItem(long itemId) {
		return ewasteDao.getOne(itemId);
	}

	@Override
	public Ewaste addItem(Ewaste item) {
		return ewasteDao.save(item);
	}

	@Override
	public Ewaste updateItem(Ewaste item) {
		return ewasteDao.save(item);
	}

	@Override
	public void deleteItem(long parseLong) {
		Ewaste enitity = ewasteDao.getOne(parseLong);
		ewasteDao.delete(enitity);
	}
}


//for checking through postman

/*
@Service
public class ItemServiceimpl implements ItemService  {
	List<Item> list;
	public ItemServiceimpl() {
		list = new ArrayList<>();
		list.add(new Item(111,"Mobile","old display crack"));
		list.add(new Item(222,"Pager","old system pager"));
	}
	@Override
	public List<Item> getItems() {
		// TODO Auto-generated method stub
		return list;
	}
	@Override
	public Item getItem(long itemId) {
		Item c = null;
		for (Item item:list) 
		{
			if(item.getId()==itemId){
				c = item;
				break;
			}
		}
		return c;
	}
	@Override
	public Item addItem(Item item) {
	
		list.add(item);
		return item;
	}
	@Override
	public Item updateItem(Item item) {
		list.forEach(e -> {
			if (e.getId()== item.getId()) {
				e.setTitle(item.getTitle());
				e.setDescription(item.getDescription());
			}
		});
		return item;
	}
	@Override
	public void deleteItem(long parseLong) {
		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
	}
}
*/