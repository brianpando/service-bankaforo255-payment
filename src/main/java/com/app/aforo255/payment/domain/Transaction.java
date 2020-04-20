package com.app.aforo255.payment.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Transaction implements Serializable{
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int nroprestamo;
	private double importe_couta;
	private int couta;
	private int prestamoid;
	private String type;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNroprestamo() {
		return nroprestamo;
	}
	public void setNroprestamo(int nroprestamo) {
		this.nroprestamo = nroprestamo;
	}
	public double getImporte_couta() {
		return importe_couta;
	}
	public void setImporte_couta(double importe_couta) {
		this.importe_couta = importe_couta;
	}
	public int getCouta() {
		return couta;
	}
	public void setCouta(int couta) {
		this.couta = couta;
	}
	public int getPrestamoid() {
		return prestamoid;
	}
	public void setPrestamoid(int prestamoid) {
		this.prestamoid = prestamoid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
	
}
