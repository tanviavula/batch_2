package com.nubes.ipl2020;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.nubes.ipl2020.model.Player;

public class Ipl2020Stat {
	private static final String TEAM_INFO = "select label,city,coach from team";
	private static final String PLAYER_INFO = "select player,price,role,label from player";
	private static final String PLAYER_COACH_TEAM= "select p.player as name,p.price, t.team_name as team,t.coach from player p inner join team t on p.label = t.label";
    private static final String TEAM_AMOUNT = "select label as team,sum(price) as amount from player group by label order by amount desc";
    
	public void showTeamsInfo() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		DatabaseUtil dbUtil = DatabaseUtil.obj;

		try {
			con = dbUtil.getConnection();
			st = con.createStatement();
			rs = st.executeQuery(TEAM_INFO);
			while (rs.next()) {
				System.out.println(rs.getString("label"));
				System.out.println(rs.getString("city"));
				System.out.println(rs.getString("coach"));
				System.out.println("-------------------");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbUtil.close(con, st, rs);
		}
	}

	public void showPlayersInfo() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		DatabaseUtil dbUtil = DatabaseUtil.obj;
		try {
			con = dbUtil.getConnection();
			st = con.createStatement();
			rs = st.executeQuery(PLAYER_INFO);
			while (rs.next()) {
				System.out.println(rs.getString("player"));
				System.out.println(rs.getString("price"));
				System.out.println(rs.getString("role"));
				System.out.println(rs.getString("label"));
				System.out.println("-------------------");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbUtil.close(con, st, rs);
		}
	}
	public void showPlayersWithTeamAndCoach() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		DatabaseUtil dbUtil = DatabaseUtil.obj;
		try {
			con = dbUtil.getConnection();
			st = con.createStatement();
			rs = st.executeQuery(PLAYER_COACH_TEAM);
			while (rs.next()) {
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("price"));
				System.out.println(rs.getString("team"));
				System.out.println(rs.getString("coach"));
				System.out.println("-------------------");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbUtil.close(con, st, rs);
		}
	}
	
	public void showTeamNameAndAmount() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		DatabaseUtil dbUtil = DatabaseUtil.obj;
		try {
			con = dbUtil.getConnection();
			st = con.createStatement();
			rs = st.executeQuery(TEAM_AMOUNT);
			while (rs.next()) {
				System.out.println(rs.getString("team"));
				System.out.println(rs.getDouble("amount"));
				System.out.println("-------------------");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbUtil.close(con, st, rs);
		}
	}
	public List<Player> getPlayers(){
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		List<Player> players = new ArrayList<>();;
		DatabaseUtil dbUtil = DatabaseUtil.obj;
		try {
			con = dbUtil.getConnection();
			st = con.createStatement();
			rs = st.executeQuery(PLAYER_INFO);
			while (rs.next()) {
				String name = rs.getString("player");
				String role = rs.getString("role");
				double price = rs.getDouble("price");
				String label = rs.getString("label");
				Player player = new Player(name, role, label, price);
				players.add(player);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbUtil.close(con, st, rs);
		}
		return players;
	}
}
