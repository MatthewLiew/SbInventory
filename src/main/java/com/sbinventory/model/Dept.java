package com.sbinventory.model;

public class Dept {

	private int deptid;
	private int deptcode;
	private String deptname;
	private int orgid;
	
	public Dept() {}

	public Dept(int deptid, int deptcode, String deptname, int orgid) {
		this.deptid = deptid;
		this.deptcode = deptcode;
		this.deptname = deptname;
		this.orgid = orgid;
	}
	
	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public int getDeptcode() {
		return deptcode;
	}

	public void setDeptcode(int deptcode) {
		this.deptcode = deptcode;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public int getOrgid() {
		return orgid;
	}

	public void setOrgid(int orgid) {
		this.orgid = orgid;
	}
	
	public boolean isSelected(int deptid){
        if (this.deptid==deptid) {
            return true;
        }
        return false;
    }
	
	public boolean isDeptname(int deptid) {
		if (this.deptid==deptid) {
            return true;
        } else {return false;}
	}
}