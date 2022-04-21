package com.example.demo.entity;

import lombok.Data;

/**
 * ユーザー情報 Entity
 */
@Data
public class Item {
	/**
	 * ID
	 */
	private String id;
	/**
	 * 名前
	 */
	private String name;
	/**
	 * 値段
	 */
	private int price;
	/**
	 * 個数
	 */
	private int num;

}