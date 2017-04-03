package com.ducky.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;

import com.ducky.model.UserDatabase;

public class PostDAO {
	static Connection conn = null;
	static PreparedStatement stm = null;
	static ResultSet rs = null;

	public static List<UserDatabase> queryDatabase() {
		String sql = "select * from Post where id=1";
		UserDatabase user = new UserDatabase();
		List<UserDatabase> list = new ArrayList<UserDatabase>();
		try {
			conn = DBConnection.getConnection("HR", "Iloveyou1992");
			stm = conn.prepareStatement(sql);
			rs = stm.executeQuery();
			
			while (rs.next()) {
				int id = rs.getInt(1);
				String title = rs.getString(2);
				String staticlink = rs.getString(3);
				String content = rs.getString(4);
				String posttime = rs.getString(5);
				String email = rs.getString(6);
				String mobile = rs.getString(7);
				String tag = rs.getString(8);
				boolean posted = rs.getBoolean(9);

				UserDatabase userDatabase = new UserDatabase();
				userDatabase.setId(id);
				userDatabase.setTitle(title);
				userDatabase.setStaticlink(staticlink);
				userDatabase.setContent(content);
				userDatabase.setPosttime(posttime);
				userDatabase.setEmail(email);
				userDatabase.setMobile(mobile);
				userDatabase.setTag(tag);
				userDatabase.setPosted(posted);

				list.add(userDatabase);
			}
		} catch (

		Exception e) {
			System.out.println("Error " + e);
			System.exit(0);
		}
		return list;
	}
}
