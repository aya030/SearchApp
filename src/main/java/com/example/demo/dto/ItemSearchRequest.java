package com.example.demo.dto;

import lombok.Data;

/*
 * ユーザー情報 検索用リクエストデータ
 */
@Data
public class ItemSearchRequest {
	/*
	 * ユーザーID
	 */
	private String id;
}