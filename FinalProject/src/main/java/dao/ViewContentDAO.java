package dao;

import java.sql.ResultSet;

public class ViewContentDAO {
	DAL dal;
	
	public ViewContentDAO() 
	{
		dal=new DAL();
	}
	public ResultSet getAllContent() 
	{
		//fix: sua lai cach viet cau lenh;
		return null;
		/*dal.getData("Select @rownum := @rownum + 1 AS STT,Title,Brief,CreateDate\r\n"
				+ "From Content,(SELECT @rownum := 0) r\r\n"
				+ "Order by CreateDate desc;");*/
	}
}
