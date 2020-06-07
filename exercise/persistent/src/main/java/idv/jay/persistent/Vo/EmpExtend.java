package idv.jay.persistent.Vo;


/**
 * 員工延伸類別,一對一查詢出員工及部門
 * @author User
 * @category
 * date: 2020.06.07
 */
public class EmpExtend extends Emp2{
	private static final long serialVersionUID = 1L;
	private String dname;
	private String loc;
	
	public String getEname() {
		return dname;
	}
	public void setEname(String ename) {
		this.dname = ename;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
}
