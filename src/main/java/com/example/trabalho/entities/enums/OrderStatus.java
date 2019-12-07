package com.example.trabalho.entities.enums;

public enum OrderStatus {
	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private int code;
	
	private OrderStatus(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	//converter valor numérico para tipo enumerado. Passo o código e retorna método correspondente ao código
	public static OrderStatus valueOf(int code) {
		//percorre todos valores possíveis do Status
		for(OrderStatus value :OrderStatus.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
}
