package com.nubes.ipl2020;

import java.sql.SQLException;
import java.util.List;

import com.nubes.ipl2020.model.Player;

public class Manager {
	public static void main(String[] args) throws SQLException {
		
		Ipl2020Stat obj = new Ipl2020Stat();
		//obj.showTeamsInfo();
		//obj.showPlayersInfo();
		//obj.showPlayersWithTeamAndCoach();
		//obj.showTeamNameAndAmount();
		
		List<Player> players = obj.getPlayers();
		players.stream().filter(p->p.getPrice()==2000000).forEach(e->System.out.println(e.getName() +" "+e.getPrice()));
		long count = players.stream().filter(p->p.getPrice()==2000000).count();
		System.out.println(count);
		
		
		
		
	}
}
