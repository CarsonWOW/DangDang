package com.dangdang.po;

public class PageInfo {
	private int currPageNo = 1; // 当前页码
	private int pageSize = 3;    // 页面大小，即每页显示记录数
	private int totalCount; // 记录总数
	private int totalPageCount; // 总页数
	
	public void setTotalCount(int totalCount) {
		if(totalCount!=0){
			if(totalCount%pageSize==0){
				totalPageCount=totalCount/pageSize;
			}else{
				totalPageCount=totalCount/pageSize+1;
			}
		}
		this.totalCount = totalCount;
	}

	public int getCurrPageNo() {
		return currPageNo;
	}

	public void setCurrPageNo(int currPageNo) {
		this.currPageNo = currPageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalPageCount() {
		return totalPageCount;
	}

	public void setTotalPageCount(int totalPageCount) {
		this.totalPageCount = totalPageCount;
	}

	public int getTotalCount() {
		return totalCount;
	}
	
	
}
