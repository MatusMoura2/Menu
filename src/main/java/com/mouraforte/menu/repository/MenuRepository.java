package com.mouraforte.menu.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mouraforte.menu.entity.Menu;

@Repository
public interface MenuRepository extends JpaRepository<Menu, UUID>{
	List<Menu> findBySpecial(boolean special);
	List<Menu> findByDayWeek(String dayWeek);
	List<Menu> findBySnack(String snack);

}
