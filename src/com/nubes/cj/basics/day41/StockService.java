package com.nubes.cj.basics.day41;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StockVolumeDesc implements Comparator<Stock> {

	@Override
	public int compare(Stock o1, Stock o2) {
		return new Float(o2.getVolume()).compareTo(o1.getVolume());

	}

}

class StockVolumeAesc implements Comparator<Stock> {

	@Override
	public int compare(Stock o1, Stock o2) {
		return new Float(o1.getVolume()).compareTo(o2.getVolume());
	}

}

public class StockService {

	private final String FILE_PATH = "INFY.csv";
	private List<Stock> stockList;

	public StockService() {
		stockList = new ArrayList<>();
		init();
	}

	// This method is used read data from file and store it into list
	private void init() {
		try {
			List<String> list = Files.readAllLines(Paths.get(FILE_PATH));
			list = list.subList(1, list.size());
			list.stream().forEach(e -> {
				String arr[] = e.split(",");
				String date = arr[0];
				float high = Float.parseFloat(arr[1]);
				float low = Float.parseFloat(arr[2]);
				float volume = Float.parseFloat(arr[3]);
				Stock stock = new Stock(date, high, low, volume);
				stockList.add(stock);
			});
		} catch (IOException e) {
			System.out.println("While reading file :");
			e.printStackTrace();
		}
	}

	public Stock volumeIsHigh() {
		Stock obj = null;
		float maxVolumn = stockList.get(0).getVolume();
		for (Stock s : stockList) {
			if (s.getVolume() > maxVolumn) {
				obj = s;
				maxVolumn = s.getVolume();
			}
		}
		return obj;
	}

	public Stock volumeIsLow() {
		Stock obj = null;
		float maxVolumn = stockList.get(0).getVolume();
		for (Stock s : stockList) {
			if (s.getVolume() < maxVolumn) {
				obj = s;
				maxVolumn = s.getVolume();
			}
		}
		return obj;
	}

	public double avergeHighPrice() {
		return stockList.stream().mapToDouble(s -> s.getHigh()).average().getAsDouble();

	}

	public double averageLowPrice() {
		return stockList.stream().mapToDouble(stock -> stock.getLow()).average().getAsDouble();

	}

	// Desc // Aesc
	public List<Stock> inSortByVolume(String order) {
		if (order.equalsIgnoreCase("ASC")) {
			Collections.sort(stockList, new StockVolumeAesc());

		} else {
			Collections.sort(stockList, new StockVolumeDesc());

		}
		return stockList;
	}

	public List<Stock> getAllStockData() {
		return stockList;
	}

}
