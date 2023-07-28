package com.synpact.entity;

import java.util.HashMap;
import java.util.Map;

public class SpreadEntity {
	private Map<String, Object> cells;
	public SpreadEntity() {
		cells=new HashMap<>();
	}
	public int getCellValue(String cellId) {
		return (int) this.cells.get(cellId);
	}
	public void setCellValue(String cellId, Object value) {
		try {
			if(value instanceof Integer || value instanceof Double) {
				this.cells.put(cellId, value);
			} else if(value instanceof String){
				String mid=value.toString().trim().substring(1);
				String[] ar=mid.split("\\+");
				System.out.println("size="+ar.length);
				int sum=0;
				for(String s:ar) {
					s=s.trim();
					if(this.cells.containsKey(s)) {
						sum+=(Integer) this.cells.getOrDefault(s, 0);
					}
				}
				this.cells.put(cellId, sum);
				System.out.println("cellid="+cellId+" sum="+sum);
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
