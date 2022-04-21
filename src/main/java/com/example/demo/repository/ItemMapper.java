package com.example.demo.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.ItemSearchRequest;
import com.example.demo.entity.Item;

/*
 * ユーザー情報 Mapper
 */
@Mapper
public interface ItemMapper {
	/*
	 * ユーザー情報検索
	 */
	Item search(ItemSearchRequest item);
}