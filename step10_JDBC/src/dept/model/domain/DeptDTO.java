package dept.model.domain;

public class DeptDTO {
	private int deptno;
	private String dname;
	private String loc;

	public int getDeptno() {
		return deptno;
	}

	public DeptDTO(int deptno) {
		super();
		this.deptno = deptno;
	}

	public DeptDTO(int deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public void getDeptno(int deptno) {
		this.deptno = deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	@Override
	public String toString() {
		return "DeptDTO [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}

}
