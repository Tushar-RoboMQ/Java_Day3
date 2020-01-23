package Exceptions;



public class Election {
	private int Electionid;
	private String name;
	private String electiondate;
	private String District;
	private String Constituency;
	private String Countingdate;
	public Election(int electionid, String name, String electiondate, String district, String constituency,
			String countingdate) {
		super();
		Electionid = electionid;
		this.name = name;
		this.electiondate = electiondate;
		District = district;
		Constituency = constituency;
		Countingdate = countingdate;
	}
	public int getElectionid() {
		return Electionid;
	}
	public void setElectionid(int electionid) {
		Electionid = electionid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getElectiondate() {
		return electiondate;
	}
	public void setElectiondate(String electiondate) {
		this.electiondate = electiondate;
	}
	public String getDistrict() {
		return District;
	}
	public void setDistrict(String district) {
		District = district;
	}
	public String getConstituency() {
		return Constituency;
	}
	public void setConstituency(String constituency) {
		Constituency = constituency;
	}
	public String getCountingdate() {
		return Countingdate;
	}
	public void setCountingdate(String countingdate) {
		Countingdate = countingdate;
	}
	@Override
	public String toString() {
		return "Election \n[Electionid=" + Electionid + ", name=" + name + ", electiondate=" + electiondate
				+ ", District=" + District + ", Constituency=" + Constituency + ", Countingdate=" + Countingdate + "]";
	}
	
	
	public int hashCode() {
		return name.hashCode();
	}
	
	public boolean equals(Object o) {
		//System.out.println("in the equals()");
		boolean flag=false;
		if(o instanceof Election) {
			Election p=(Election)o;
			//System.out.println(p.id);
			//System.out.println(this.id);
			if(p.name==this.name) {
				flag=true;
			}
		}
		return flag;
	}
	

}
