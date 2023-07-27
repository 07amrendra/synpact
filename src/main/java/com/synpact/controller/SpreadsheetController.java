package com.synpact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.synpact.entity.CellValueRequest;
import com.synpact.entity.SpreadEntity;

@RestController
public class SpreadsheetController {
	
	private SpreadEntity spreadEntity;
	
	public SpreadsheetController() {
		spreadEntity = new SpreadEntity();
    }
	
	@PostMapping("/setCellValue")
    public void setCellValue(@RequestBody CellValueRequest request) {
		spreadEntity.setCellValue(request.getCellId(), request.getValue());
    }

    @GetMapping("/getCellValue")
    public Object getCellValue(@RequestBody CellValueRequest request) {
        return spreadEntity.getCellValue(request.getCellId());
    }

}
