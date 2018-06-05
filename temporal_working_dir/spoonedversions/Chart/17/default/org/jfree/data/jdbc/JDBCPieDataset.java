

package org.jfree.data.jdbc;


public class JDBCPieDataset extends org.jfree.data.general.DefaultPieDataset {
	private transient java.sql.Connection connection;

	public JDBCPieDataset(java.lang.String url, java.lang.String driverName, java.lang.String user, java.lang.String password) throws java.lang.ClassNotFoundException, java.sql.SQLException {
		java.lang.Class.forName(driverName);
		org.jfree.data.jdbc.JDBCPieDataset.this.connection = java.sql.DriverManager.getConnection(url, user, password);
	}

	public JDBCPieDataset(java.sql.Connection con) {
		if (con == null) {
			throw new java.lang.NullPointerException("A connection must be supplied.");
		}
		org.jfree.data.jdbc.JDBCPieDataset.this.connection = con;
	}

	public JDBCPieDataset(java.sql.Connection con, java.lang.String query) throws java.sql.SQLException {
		this(con);
		executeQuery(query);
	}

	public void executeQuery(java.lang.String query) throws java.sql.SQLException {
		executeQuery(org.jfree.data.jdbc.JDBCPieDataset.this.connection, query);
	}

	public void executeQuery(java.sql.Connection con, java.lang.String query) throws java.sql.SQLException {
		java.sql.Statement statement = null;
		java.sql.ResultSet resultSet = null;
		try {
			statement = con.createStatement();
			resultSet = statement.executeQuery(query);
			java.sql.ResultSetMetaData metaData = resultSet.getMetaData();
			int columnCount = metaData.getColumnCount();
			if (columnCount != 2) {
				throw new java.sql.SQLException("Invalid sql generated.  PieDataSet requires 2 columns only");
			}
			int columnType = metaData.getColumnType(2);
			double value = java.lang.Double.NaN;
			while (resultSet.next()) {
				java.lang.Comparable key = resultSet.getString(1);
				switch (columnType) {
					case java.sql.Types.NUMERIC :
					case java.sql.Types.REAL :
					case java.sql.Types.INTEGER :
					case java.sql.Types.DOUBLE :
					case java.sql.Types.FLOAT :
					case java.sql.Types.DECIMAL :
					case java.sql.Types.BIGINT :
						value = resultSet.getDouble(2);
						setValue(key, value);
						break;
					case java.sql.Types.DATE :
					case java.sql.Types.TIME :
					case java.sql.Types.TIMESTAMP :
						java.sql.Timestamp date = resultSet.getTimestamp(2);
						value = date.getTime();
						setValue(key, value);
						break;
					default :
						java.lang.System.err.println("JDBCPieDataset - unknown data type");
						break;
				}
			} 
			fireDatasetChanged();
		} finally {
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (java.lang.Exception e) {
					java.lang.System.err.println("JDBCPieDataset: swallowing exception.");
				}
			}
			if (statement != null) {
				try {
					statement.close();
				} catch (java.lang.Exception e) {
					java.lang.System.err.println("JDBCPieDataset: swallowing exception.");
				}
			}
		}
	}

	public void close() {
		try {
			org.jfree.data.jdbc.JDBCPieDataset.this.connection.close();
		} catch (java.lang.Exception e) {
			java.lang.System.err.println("JdbcXYDataset: swallowing exception.");
		}
	}
}

