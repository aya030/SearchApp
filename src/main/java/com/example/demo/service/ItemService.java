package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ItemSearchRequest;
import com.example.demo.entity.Item;
import com.example.demo.repository.ItemMapper;

/*
 * ユーザー情報 Service
 */
@Service
public class ItemService {
	/*
	 * ユーザー情報 Mapper
	 */
	@Autowired
	private ItemMapper itemMapper;

	/*
	 * ユーザー情報検索
	 */
	public Item search(ItemSearchRequest itemSearchRequest) {
		return itemMapper.search(itemSearchRequest);
	}
}
