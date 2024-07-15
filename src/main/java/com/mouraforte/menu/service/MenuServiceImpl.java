package com.mouraforte.menu.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mouraforte.menu.entity.Menu;
import com.mouraforte.menu.repository.MenuRepository;

@Service
public class MenuServiceImpl implements MenuService{
	
	@Autowired
	private MenuRepository repository;

	@Override
	public List<Menu> getAllMenus() {
		return repository.findAll();
	}

	@Override
	public Menu getMenuId(UUID id) {
		return repository.findById(id).orElseThrow(()-> new RuntimeException("menu not found!" + id));
	}

	@Override
	public Menu createMenu(Menu menu) {
		return repository.save(menu);
	}

	@Override
	public Menu updateMenu(UUID id, Menu menu) {
		Menu existingMenu = repository.findById(id).orElseThrow(()-> new RuntimeException("menu not found!" + id));
		existingMenu.setName(menu.getName());
		existingMenu.setDescription(menu.getDescription());
		existingMenu.setPrice(menu.getPrice());
		existingMenu.setSpecial(menu.isSpecial());
		existingMenu.setDayWeek(menu.getDayWeek());
		existingMenu.setSnack(menu.getSnack());
		return repository.save(existingMenu);
	}

	@Override
	public void deleteMenu(UUID id) {
		Menu existingMenu = repository.findById(id).orElseThrow(()-> new RuntimeException("menu not found!" + id));
		repository.delete(existingMenu);
	}

	@Override
	public List<Menu> getSpecialMenu() {
		return repository.findBySpecial(true);
	}

	@Override
	public List<Menu> getMenusByDayWeek(String dayWeek) {
		return repository.findByDayWeek(dayWeek);
	}

	@Override
	public List<Menu> getMenusBySnack(String snack) {
		return repository.findBySnack(snack);
	}

}
