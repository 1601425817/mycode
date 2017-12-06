package com.pcq.ssm.dto;

import java.util.List;

public class Page {
	private int current;
	private int size = 4;
	private int totolRow;
	private int totolPage;
	private int offset;
	private List<?> list;
	
	public Page(int current) {
		this.current = current;
		this.offset = (current - 1)*size;
	}
	public int getCurrent() {
		return current;
	}
	public void setCurrent(int current) {
		this.current = current;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getTotolRow() {
		return totolRow;
	}
	public void setTotolRow(int totolRow) {
		this.totolRow = totolRow;
		this.totolPage = (totolRow / size) + ((totolRow % size) > 0 ? 1 : 0);
	}
	public int getTotolPage() {
		return totolPage;
	}
	public void setTotolPage(int totolPage) {
		this.totolPage = totolPage;
	}
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	public List<?> getList() {
		return list;
	}
	public void setList(List<?> list) {
		this.list = list;
	}
	
	
}
