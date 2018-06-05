

package org.jfree.data.jdbc;


public class JDBCCategoryDataset extends org.jfree.data.category.DefaultCategoryDataset {
	private transient java.sql.Connection connection;

	private boolean transpose = true;

	public JDBCCategoryDataset(java.lang.String url, java.lang.String driverName, java.lang.String user, java.lang.String passwd) throws java.lang.ClassNotFoundException, java.sql.SQLException {
		java.lang.Class.forName(driverName);
		org.jfree.data.jdbc.JDBCCategoryDataset.this.connection = java.sql.DriverManager.getConnection(url, user, passwd);
	}

	public JDBCCategoryDataset(java.sql.Connection connection) {
		if (connection == null) {
			throw new java.lang.NullPointerException("A connection must be supplied.");
		}
		org.jfree.data.jdbc.JDBCCategoryDataset.this.connection = connection;
	}

	public JDBCCategoryDataset(java.sql.Connection connection, java.lang.String query) throws java.sql.SQLException {
		this(connection);
		executeQuery(query);
	}

	public boolean getTranspose() {
		return org.jfree.data.jdbc.JDBCCategoryDataset.this.transpose;
	}

	public void setTranspose(boolean transpose) {
		org.jfree.data.jdbc.JDBCCategoryDataset.this.transpose = transpose;
	}

	public void executeQuery(java.lang.String query) throws java.sql.SQLException {
		executeQuery(org.jfree.data.jdbc.JDBCCategoryDataset.this.connection, query);
	}

	public void executeQuery(java.sql.Connection con, java.lang.String query) throws java.sql.SQLException {
		java.sql.Statement statement = null;
		java.sql.ResultSet resultSet = null;
		try {
			statement = con.createStatement();
			resultSet = statement.executeQuery(query);
			java.sql.ResultSetMetaData metaData = resultSet.getMetaData();
			int columnCount = metaData.getColumnCount();
			if (columnCount < 2) {
				throw new java.sql.SQLException(("JDBCCategoryDataset.executeQuery() : insufficient columns " + "returned from the database."));
			}
			int i = getRowCount();
			while ((--i) >= 0) {
				removeRow(i);
			} 
			while (resultSet.next()) {
				java.lang.Comparable rowKey = resultSet.getString(1);
				for (int column = 2; column <= columnCount; column++) {
					java.lang.Comparable columnKey = metaData.getColumnName(column);
					int columnType = metaData.getColumnType(column);
					switch (columnType) {
						case java.sql.Types.TINYINT :
						case java.sql.Types.SMALLINT :
						case java.sql.Types.INTEGER :
						case java.sql.Types.BIGINT :
						case java.sql.Types.FLOAT :
						case java.sql.Types.DOUBLE :
						case java.sql.Types.DECIMAL :
						case java.sql.Types.NUMERIC :
						case java.sql.Types.REAL :
							{
								java.lang.Number value = ((java.lang.Number) (resultSet.getObject(column)));
								if (org.jfree.data.jdbc.JDBCCategoryDataset.this.transpose) {
									setValue(value, columnKey, rowKey);
								}else {
									setValue(value, rowKey, columnKey);
								}
								break;
							}
						case java.sql.Types.DATE :
						case java.sql.Types.TIME :
						case java.sql.Types.TIMESTAMP :
							{
								java.sql.Date date = ((java.sql.Date) (resultSet.getObject(column)));
								java.lang.Number value = new java.lang.Long(date.getTime());
								if (org.jfree.data.jdbc.JDBCCategoryDataset.this.transpose) {
									setValue(value, columnKey, rowKey);
								}else {
									setValue(value, rowKey, columnKey);
								}
								break;
							}
						case java.sql.Types.CHAR :
						case java.sql.Types.VARCHAR :
						case java.sql.Types.LONGVARCHAR :
							{
								java.lang.String string = ((java.lang.String) (resultSet.getObject(column)));
								try {
									java.lang.Number value = java.lang.Double.valueOf(string);
									if (org.jfree.data.jdbc.JDBCCategoryDataset.this.transpose) {
										setValue(value, columnKey, rowKey);
									}else {
										setValue(value, rowKey, columnKey);
									}
								} catch (java.lang.NumberFormatException e) {
								}
								break;
							}
						default :
							break;
					}
				}
			} 
			fireDatasetChanged();
		} finally {
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (java.lang.Exception e) {
				}
			}
			if (statement != null) {
				try {
					statement.close();
				} catch (java.lang.Exception e) {
				}
			}
		}
	}
}

