package com.nubes.cj.basics.day4;


	

public class CheckReamaingPeople {
	public static void main(String[] args) {
		int n_activites = 3;
		int p_count = 8;
		int p_count_activity = p_count / n_activites;
		int p_remaing = p_count % n_activites;
		System.out.println("No of person for activity:"+p_count_activity);
		System.out.println("No of leftout people :"+p_remaing);
	}
}
