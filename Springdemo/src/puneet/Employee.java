package puneet;

public class Employee {
	 int eid;
	 String ename;
	 String address;
	public Employee()
	{
		System.out.println("obj created..................");		
	}
	public Employee(int eid, String ename, String address) {
		this.eid = eid;
		this.ename = ename;
		this.address = address;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", address=" + address + "]";
	}

}
