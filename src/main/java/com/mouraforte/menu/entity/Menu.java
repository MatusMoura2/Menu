package com.mouraforte.menu.entity;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Menu {
	
		@Id
		@GeneratedValue(strategy = GenerationType.UUID)
		private UUID id;
		private String name;
		private String description;
		private double price;
		private boolean special;
		private String dayWeek;
		private String snack;
		public Menu(UUID id, String name, String description, double price, boolean special, String dayWeek,
				String snack) {
			super();
			this.id = id;
			this.name = name;
			this.description = description;
			this.price = price;
			this.special = special;
			this.dayWeek = dayWeek;
			this.snack = snack;
		}
		public UUID getId() {
			return id;
		}
		public void setId(UUID id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public boolean isSpecial() {
			return special;
		}
		public void setSpecial(boolean special) {
			this.special = special;
		}
		public String getDayWeek() {
			return dayWeek;
		}
		public void setDayWeek(String dayWeek) {
			this.dayWeek = dayWeek;
		}
		public String getSnack() {
			return snack;
		}
		public void setSnack(String snack) {
			this.snack = snack;
		}
		
}
