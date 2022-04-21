package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dto.ItemSearchRequest;
import com.example.demo.entity.Item;
import com.example.demo.service.ItemService;

/*
 * ユーザー情報 Controller
 */
@Controller
public class ItemController {
	/*
	 * ユーザー情報 Service
	 */
	@Autowired
	ItemService itemService;

	@GetMapping("/search")
	public String displaySearch(Model model) {
		return "search";
	}

	@PostMapping("/id-search")
	public String search(@ModelAttribute ItemSearchRequest itemSearchRequest, Model model) {
		Item item = itemService.search(itemSearchRequest);
		model.addAttribute("item", item);
		return "search/search-id";
	}
}
