package com.mouraforte.menu.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mouraforte.menu.entity.Menu;
import com.mouraforte.menu.service.MenuService;

@Controller
@RequestMapping("/menus")
public class MenuController {

	@Autowired
	private MenuService menuService;

	@GetMapping
	public String getAllmenus(Model model) {
		List<Menu> menus = menuService.getAllMenus();
		model.addAttribute("menus", menus);
		return "index";
	}

	@GetMapping("/{id}")
	@ResponseBody
	public Menu getMenuById(@PathVariable UUID id) {
		return menuService.getMenuId(id);
	}

	@PostMapping
	@ResponseBody
	public Menu createMenu(@RequestBody Menu menu) {
		return menuService.createMenu(menu);
	}

	@PutMapping("/{id}")
	@ResponseBody
	public Menu updateMenu(@PathVariable UUID id, @RequestBody Menu menu) {
		return menuService.updateMenu(id, menu);
	}

	@DeleteMapping("/{id}")
	@ResponseBody
	public void deleteMenu(@PathVariable UUID id) {
		menuService.deleteMenu(id);
	}
	
	@GetMapping("/special")
    public String getSpecialMenus(Model model) {
        List<Menu> menus = menuService.getSpecialMenu();
        model.addAttribute("menus", menus);
        return "index";
    }
	@GetMapping("/days/{dayWeek}")
	public String getMenusByDeyWeek(@PathVariable String deyWeek, Model model) {
		List<Menu> menus = menuService.getMenusByDayWeek(deyWeek);
		model.addAttribute("menus", menus);
		return "index";
	}
	@GetMapping("/hours/{snack}")
	public String getMenuBySnack(@PathVariable String snack, Model model) {
		List<Menu> menus = menuService.getMenusBySnack(snack);
		model.addAttribute("menus", menus);
		return "index";
	}
}
