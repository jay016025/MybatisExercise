package idv.jay.persistent.Vo;

import java.io.Serializable;
import java.util.List;

public class Dept2 implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer deptno;
	private String dname;
	private String loc;
	private List<Emp2> emps;
	
	public Integer getDeptno() {
		return deptno;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
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
	public List<Emp2> getEmps() {
		return emps;
	}
	public void setEmps(List<Emp2> emps) {
		this.emps = emps;
	}
	@Override
	public String toString() {
		return "Dept2 [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deptno == null) ? 0 : deptno.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dept2 other = (Dept2) obj;
		if (deptno == null) {
			if (other.deptno != null)
				return false;
		} else if (!deptno.equals(other.deptno))
			return false;
		return true;
	}
	
	
}
