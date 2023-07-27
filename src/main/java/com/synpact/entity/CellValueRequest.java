package com.synpact.entity;


public class CellValueRequest {

    private String cellId;
    private Object value;

    public CellValueRequest() {
    }

    public CellValueRequest(String cellId, Object value) {
        this.cellId = cellId;
        this.value = value;
    }

    public String getCellId() {
        return cellId;
    }

    public void setCellId(String cellId) {
        this.cellId = cellId;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

}