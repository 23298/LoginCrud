package Com.Ism.loginVO;

public class LoginVo {
	
	private String fName,lName,pwd;
	private int id;
	private String file;

	public LoginVo()
	{
	}

	public LoginVo(String fName, String lName, String pwd) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.pwd = pwd;
		
	}
	
	

	public String getfName()
	{
		return fName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setfName(String fName)
	{
		this.fName = fName;
	}

	public String getlName()
	{
		return lName;
	}

	public void setlName(String lName)
	{
		this.lName = lName;
	}

	public String getPwd()
	{
		return pwd;
	}

	public void setPwd(String pwd)
	{
		this.pwd = pwd;
	}
	
}