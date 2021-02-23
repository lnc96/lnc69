package com.kgc.util;

import java.io.Serializable;
import java.util.List;

public class PageUtil<T>  implements  Serializable {
	private Integer pageIndex;
	private Integer pageSize;
	private Integer totalCount;
	private Integer totalPage;
	private List<T> list;
	public Integer getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(Integer pageIndex) {
		
		this.pageIndex = pageIndex;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;

		this.totalPage=(this.totalCount%this.pageSize==0)?
				         this.totalCount/this.pageSize:this.totalCount/this.pageSize+1;
				        	 
	}
	public Integer getTotalPage() {
		return totalPage;
	}
	/*public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}*/
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	
	
	
}
