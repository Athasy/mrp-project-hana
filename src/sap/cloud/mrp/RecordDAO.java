package sap.cloud.mrp;

import javax.sql.DataSource;

public class RecordDAO {
	private DataSource dataSource;
	
	public RecordDAO(DataSource newDataSource){
		this.dataSource = newDataSource;
	}
	
	
}
