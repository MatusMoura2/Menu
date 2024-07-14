package com.mouraforte.menu.service;

import java.util.List;
import java.util.UUID;

import com.mouraforte.menu.entity.Menu;

public interface MenuService {

	List<Menu> getAllMenus();
	Menu getMenuId(UUID id);
	Menu createMenu(Menu menu);
	Menu updateMenu(UUID id, Menu menu);
	void deleteMenu(UUID id);
	List<Menu> getSpecialMenu();
	List<Menu> getMenusByDayWeek(String dayWeek);
	List<Menu> getMenusBySnack(String snack);
}
