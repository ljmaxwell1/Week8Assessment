package main.beans;

/**
 *Larry J Maxwell - ljmaxwell1@dmacc.edu
 *CIS175 - Spring 2022
 *Mar 11, 2022
 **/

import javax.persistence.Embeddable;

@Embeddable
public class Specs {
	private String ram;
	private String hdd;
	private String processor;
	
	public Specs() {
		super();
	}
	
	public Specs(String ram, String hdd, String processor) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.processor = processor;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getHdd() {
		return hdd;
	}
	public void setHdd(String hdd) {
		this.hdd = hdd;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "Specs [ram=" + ram + ", hdd=" + hdd + ", processor=" + processor + "]";
	}


}
