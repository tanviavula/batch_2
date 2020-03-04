package com.nubes.cj.basics.day41;

import java.util.List;

public class Manager {
	public static void main(String[] args) {
		StockService service = new StockService();
		//List<Stock> stockList = service.getAllStockData();
		//stockList.stream().forEach(e->System.out.println(e));
		
		System.out.println("High volume:"+service.volumeIsHigh());
		System.out.println("Low volume:"+service.volumeIsLow());
		System.out.println("Average high price:"+service.avergeHighPrice());
		System.out.println("High low price:"+service.averageLowPrice());
		
		List<Stock> stockList = service.inSortByVolume("ASC");
		stockList.stream().forEach(e->System.out.println(e));
	}
}
