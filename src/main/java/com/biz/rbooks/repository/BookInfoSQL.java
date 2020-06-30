package com.biz.rbooks.repository;

import org.apache.ibatis.jdbc.SQL;

public class BookInfoSQL {
	
	public String book_insert_sql() {
		
		return new SQL() {
			{
				INSERT_INTO("tbl_books");
				
				INTO_COLUMNS("b_code");
				INTO_COLUMNS("b_name");
				INTO_COLUMNS("b_author");
				INTO_COLUMNS("b_comp");
				INTO_COLUMNS("b_year");
				INTO_COLUMNS("b_iprice");
				
				INTO_VALUES("#{b_code,jdbcType=VARCHAR}");
				INTO_VALUES("#{b_name,jdbcType=VARCHAR}");
				INTO_VALUES("#{b_author,jdbcType=VARCHAR}");
				INTO_VALUES("#{b_comp,jdbcType=VARCHAR}");
				INTO_VALUES("#{b_year,jdbcType=VARCHAR}");
				INTO_VALUES("#{b_iprice,jdbcType=VARCHAR}");
			}
		}.toString();
		
	}
	
	
	public String book_update_sql() {
		
		return new SQL() {
			{
				UPDATE("tbl_books");
				
				WHERE("b_code = #{b_code,jdbcType=VARCHAR}");
				SET("b_name = #{b_name,jdbcType=VARCHAR}");
				SET("b_author = #{b_author,jdbcType=VARCHAR}");
				SET("b_comp = #{b_comp,jdbcType=VARCHAR}");
				SET("b_year = #{b_year,jdbcType=VARCHAR}");
				SET("b_iprice = #{b_iprice,jdbcType=VARCHAR}");
			}
		}.toString();
		
	}
}
