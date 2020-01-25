package com.nubes.cj.basics.day18;

public class StringBufferExample{
		public static void main(String[] args) {
			StringBuffer sb_1 = new StringBuffer("Java");
			StringBuffer sb_2 = new StringBuffer("Java");
			System.out.println(sb_1 == sb_2);
			System.out.println(sb_1.equals(sb_2));
			
			sb_1.append(" Made Eassy");
			System.out.println(sb_1);
			sb_1.reverse();
			System.out.println(sb_1);
			
			String str = sb_2.toString();
			System.out.println(str);
			
			String name = "Krish";
			int age = 35;
			float salary = 45000;
			String qualification = "B.E";
			
			String profile = name + " "+ age+" "+salary+" "+qualification;
			String profile_1 = new StringBuffer(name).append(age).append(salary).append(qualification).toString();
//			String html = "<html>";
//			html = html + "\n<head>";
//			html = html + "\n\t<title>Welcome to HTML";
//			html = html + "\n</title>";
//			html = html + "\n<body>";
//			html = html + "<h1>This is my first HTML";
//			html = html + "<\body>";
//			html = "</html>";
			
			StringBuffer sb = new StringBuffer();
			sb.append("<html>").append("\n<head>").append("<title>");
			String html = sb.toString();
			
			StringBuilder sbd = new StringBuilder();
		}
}
