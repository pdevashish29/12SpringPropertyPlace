package com.test;

import javax.sql.DataSource;

public class customerDAO implements Custo {
	private DataSource dataSource;

	/* (non-Javadoc)
	 * @see com.test.Custo#getDataSource()
	 */
	@Override
	public DataSource getDataSource() {
		return dataSource;
	}

	/* (non-Javadoc)
	 * @see com.test.Custo#setDataSource(javax.sql.DataSource)
	 */
	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	
}
