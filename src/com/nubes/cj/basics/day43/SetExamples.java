package com.nubes.cj.basics.day43;

import java.util.SortedSet;
import java.util.TreeSet;

public class SetExamples {

		public static void main(String[] args) {
			SortedSet<String> set = new TreeSet<>();
			String CS="ALN,GLN,NVR,KVR";
			String IS="GLN,NVR,RVR";
			String EC ="GLN,KVR,NS,PS,PSR";
			
			String data = CS.concat(",").concat(IS).concat(",").concat(EC);
			for(String name:data.split(",")) {
				set.add(name);
			}
			System.out.println(set);
			System.out.println(set.size());
			
		}
}
