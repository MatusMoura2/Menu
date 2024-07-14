package com.mouraforte.menu.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mouraforte.menu.entity.Menu;

public interface MenuRepository extends JpaRepository<Menu, UUID>{
	List<Menu> findBySpecial(boolean special);
	List<Menu> findByDayWeek(String dayWeek);
	List<Menu> findBySnack(String snack);

}
