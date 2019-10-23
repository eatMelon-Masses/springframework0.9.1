/*
 * SpringMockCallableStatement.java
 *
 * Copyright (C) 2002 by Interprise Software.  All rights reserved.
 */
package com.interface21.jdbc.mock;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.*;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/**
 * @task enter type comments
 * 
 * @author <a href="mailto:tcook@interprisesoftware.com">Trevor D. Cook</a>
 * @version $Id: SpringMockCallableStatement.java,v 1.3 2003/05/07 07:17:10 jhoeller Exp $
 */
public class SpringMockCallableStatement
	extends SpringMockPreparedStatement
	implements CallableStatement {

	private Map outParameters = new HashMap();
	
	/**
	 * @see java.sql.CallableStatement#registerOutParameter(int, int)
	 */
	public void registerOutParameter(int parameterIndex, int sqlType)
		throws SQLException {
			outParameters.put(new Integer(parameterIndex), new Integer(sqlType));
	}

	/**
	 * @see java.sql.CallableStatement#registerOutParameter(int, int, int)
	 */
	public void registerOutParameter(
		int parameterIndex,
		int sqlType,
		int scale)
		throws SQLException {
			notImplemented();
	}

	/**
	 * @see java.sql.CallableStatement#wasNull()
	 */
	public boolean wasNull() throws SQLException {
		notImplemented();
		return false;
	}

	/**
	 * @see java.sql.CallableStatement#getString(int)
	 */
	public String getString(int parameterIndex) throws SQLException {
		notImplemented();
		return null;
	}

	/**
	 * @see java.sql.CallableStatement#getBoolean(int)
	 */
	public boolean getBoolean(int parameterIndex) throws SQLException {
		notImplemented();
		return false;
	}

	/**
	 * @see java.sql.CallableStatement#getByte(int)
	 */
	public byte getByte(int parameterIndex) throws SQLException {
		notImplemented();
		return 0;
	}

	/**
	 * @see java.sql.CallableStatement#getShort(int)
	 */
	public short getShort(int parameterIndex) throws SQLException {
		notImplemented();
		return 0;
	}

	/**
	 * @see java.sql.CallableStatement#getInt(int)
	 */
	public int getInt(int parameterIndex) throws SQLException {
		notImplemented();
		return 0;
	}

	/**
	 * @see java.sql.CallableStatement#getLong(int)
	 */
	public long getLong(int parameterIndex) throws SQLException {
		notImplemented();
		return 0;
	}

	/**
	 * @see java.sql.CallableStatement#getFloat(int)
	 */
	public float getFloat(int parameterIndex) throws SQLException {
		notImplemented();
		return 0;
	}

	/**
	 * @see java.sql.CallableStatement#getDouble(int)
	 */
	public double getDouble(int parameterIndex) throws SQLException {
		notImplemented();
		return 0;
	}

	/**
	 * @see java.sql.CallableStatement#getBigDecimal(int, int)
	 * @deprecated
	 */
	public BigDecimal getBigDecimal(int parameterIndex, int scale)
		throws SQLException {
			notImplemented();
		return null;
	}

	/**
	 * @see java.sql.CallableStatement#getBytes(int)
	 */
	public byte[] getBytes(int parameterIndex) throws SQLException {
		notImplemented();
		return null;
	}

	/**
	 * @see java.sql.CallableStatement#getDate(int)
	 */
	public Date getDate(int parameterIndex) throws SQLException {
		notImplemented();
		return null;
	}

	/**
	 * @see java.sql.CallableStatement#getTime(int)
	 */
	public Time getTime(int parameterIndex) throws SQLException {
		notImplemented();
		return null;
	}

	/**
	 * @see java.sql.CallableStatement#getTimestamp(int)
	 */
	public Timestamp getTimestamp(int parameterIndex) throws SQLException {
		notImplemented();
		return null;
	}

	/**
	 * @see java.sql.CallableStatement#getObject(int)
	 */
	public Object getObject(int parameterIndex) throws SQLException {
		return outParameters.get(new Integer(parameterIndex));
	}

	/**
	 * @see java.sql.CallableStatement#getBigDecimal(int)
	 */
	public BigDecimal getBigDecimal(int parameterIndex) throws SQLException {
		notImplemented();
		return null;
	}

	/**
	 * @see java.sql.CallableStatement#getObject(int, java.util.Map)
	 */
	public Object getObject(int i, Map map) throws SQLException {
		notImplemented();
		return null;
	}

	/**
	 * @see java.sql.CallableStatement#getRef(int)
	 */
	public Ref getRef(int i) throws SQLException {
		notImplemented();
		return null;
	}

	/**
	 * @see java.sql.CallableStatement#getBlob(int)
	 */
	public Blob getBlob(int i) throws SQLException {
		notImplemented();
		return null;
	}

	/**
	 * @see java.sql.CallableStatement#getClob(int)
	 */
	public Clob getClob(int i) throws SQLException {
		notImplemented();
		return null;
	}

	/**
	 * @see java.sql.CallableStatement#getArray(int)
	 */
	public Array getArray(int i) throws SQLException {
		notImplemented();
		return null;
	}

	/**
	 * @see java.sql.CallableStatement#getDate(int, java.util.Calendar)
	 */
	public Date getDate(int parameterIndex, Calendar cal) throws SQLException {
		notImplemented();
		return null;
	}

	/**
	 * @see java.sql.CallableStatement#getTime(int, java.util.Calendar)
	 */
	public Time getTime(int parameterIndex, Calendar cal) throws SQLException {
		notImplemented();
		return null;
	}

	/**
	 * @see java.sql.CallableStatement#getTimestamp(int, java.util.Calendar)
	 */
	public Timestamp getTimestamp(int parameterIndex, Calendar cal)
		throws SQLException {
			notImplemented();
		return null;
	}

	/**
	 * @see java.sql.CallableStatement#registerOutParameter(int, int, java.lang.String)
	 */
	public void registerOutParameter(
		int paramIndex,
		int sqlType,
		String typeName)
		throws SQLException {
			notImplemented();
	}

	/**
	 * @see java.sql.CallableStatement#registerOutParameter(java.lang.String, int)
	 */
	public void registerOutParameter(String parameterName, int sqlType)
		throws SQLException {
			notImplemented();
	}

	/**
	 * @see java.sql.CallableStatement#registerOutParameter(java.lang.String, int, int)
	 */
	public void registerOutParameter(
		String parameterName,
		int sqlType,
		int scale)
		throws SQLException {
			notImplemented();
	}

	/**
	 * @see java.sql.CallableStatement#registerOutParameter(java.lang.String, int, java.lang.String)
	 */
	public void registerOutParameter(
		String parameterName,
		int sqlType,
		String typeName)
		throws SQLException {
			notImplemented();
	}

	/**
	 * @see java.sql.CallableStatement#getURL(int)
	 */
	public URL getURL(int parameterIndex) throws SQLException {
		notImplemented();
		return null;
	}

	/**
	 * @see java.sql.CallableStatement#setURL(java.lang.String, java.net.URL)
	 */
	public void setURL(String parameterName, URL val) throws SQLException {
		notImplemented();
	}

	/**
	 * @see java.sql.CallableStatement#setNull(java.lang.String, int)
	 */
	public void setNull(String parameterName, int sqlType)
		throws SQLException {
			notImplemented();
	}

	/**
	 * @see java.sql.CallableStatement#setBoolean(java.lang.String, boolean)
	 */
	public void setBoolean(String parameterName, boolean x)
		throws SQLException {
			notImplemented();
	}

	/**
	 * @see java.sql.CallableStatement#setByte(java.lang.String, byte)
	 */
	public void setByte(String parameterName, byte x) throws SQLException {
		notImplemented();
	}

	/**
	 * @see java.sql.CallableStatement#setShort(java.lang.String, short)
	 */
	public void setShort(String parameterName, short x) throws SQLException {
		notImplemented();
	}

	/**
	 * @see java.sql.CallableStatement#setInt(java.lang.String, int)
	 */
	public void setInt(String parameterName, int x) throws SQLException {
		notImplemented();
	}

	/**
	 * @see java.sql.CallableStatement#setLong(java.lang.String, long)
	 */
	public void setLong(String parameterName, long x) throws SQLException {
		notImplemented();
	}

	/**
	 * @see java.sql.CallableStatement#setFloat(java.lang.String, float)
	 */
	public void setFloat(String parameterName, float x) throws SQLException {
		notImplemented();
	}

	/**
	 * @see java.sql.CallableStatement#setDouble(java.lang.String, double)
	 */
	public void setDouble(String parameterName, double x) throws SQLException {
		notImplemented();
	}

	/**
	 * @see java.sql.CallableStatement#setBigDecimal(java.lang.String, java.math.BigDecimal)
	 */
	public void setBigDecimal(String parameterName, BigDecimal x)
		throws SQLException {
			notImplemented();
	}

	/**
	 * @see java.sql.CallableStatement#setString(java.lang.String, java.lang.String)
	 */
	public void setString(String parameterName, String x) throws SQLException {
		notImplemented();
	}

	/**
	 * @see java.sql.CallableStatement#setBytes(java.lang.String, byte)
	 */
	public void setBytes(String parameterName, byte[] x) throws SQLException {
		notImplemented();
	}

	/**
	 * @see java.sql.CallableStatement#setDate(java.lang.String, java.sql.Date)
	 */
	public void setDate(String parameterName, Date x) throws SQLException {
		notImplemented();
	}

	/**
	 * @see java.sql.CallableStatement#setTime(java.lang.String, java.sql.Time)
	 */
	public void setTime(String parameterName, Time x) throws SQLException {
		notImplemented();
	}

	/**
	 * @see java.sql.CallableStatement#setTimestamp(java.lang.String, java.sql.Timestamp)
	 */
	public void setTimestamp(String parameterName, Timestamp x)
		throws SQLException {
			notImplemented();
	}

	/**
	 * @see java.sql.CallableStatement#setAsciiStream(java.lang.String, java.io.InputStream, int)
	 */
	public void setAsciiStream(String parameterName, InputStream x, int length)
		throws SQLException {
			notImplemented();
	}

	/**
	 * @see java.sql.CallableStatement#setBinaryStream(java.lang.String, java.io.InputStream, int)
	 */
	public void setBinaryStream(
		String parameterName,
		InputStream x,
		int length)
		throws SQLException {
			notImplemented();
	}

	/**
	 * @see java.sql.CallableStatement#setObject(java.lang.String, java.lang.Object, int, int)
	 */
	public void setObject(
		String parameterName,
		Object x,
		int targetSqlType,
		int scale)
		throws SQLException {
			notImplemented();
	}

	/**
	 * @see java.sql.CallableStatement#setObject(java.lang.String, java.lang.Object, int)
	 */
	public void setObject(String parameterName, Object x, int targetSqlType)
		throws SQLException {
			notImplemented();
	}

	/**
	 * @see java.sql.CallableStatement#setObject(java.lang.String, java.lang.Object)
	 */
	public void setObject(String parameterName, Object x) throws SQLException {
		notImplemented();
	}

	/**
	 * @see java.sql.CallableStatement#setCharacterStream(java.lang.String, java.io.Reader, int)
	 */
	public void setCharacterStream(
		String parameterName,
		Reader reader,
		int length)
		throws SQLException {
			notImplemented();
	}

	/**
	 * @see java.sql.CallableStatement#setDate(java.lang.String, java.sql.Date, java.util.Calendar)
	 */
	public void setDate(String parameterName, Date x, Calendar cal)
		throws SQLException {
			notImplemented();
	}

	/**
	 * @see java.sql.CallableStatement#setTime(java.lang.String, java.sql.Time, java.util.Calendar)
	 */
	public void setTime(String parameterName, Time x, Calendar cal)
		throws SQLException {
			notImplemented();
	}

	/**
	 * @see java.sql.CallableStatement#setTimestamp(java.lang.String, java.sql.Timestamp, java.util.Calendar)
	 */
	public void setTimestamp(String parameterName, Timestamp x, Calendar cal)
		throws SQLException {
			notImplemented();
	}

	/**
	 * @see java.sql.CallableStatement#setNull(java.lang.String, int, java.lang.String)
	 */
	public void setNull(String parameterName, int sqlType, String typeName)
		throws SQLException {
			notImplemented();
	}

	/**
	 * @see java.sql.CallableStatement#getString(java.lang.String)
	 */
	public String getString(String parameterName) throws SQLException {
		notImplemented();
		return null;
	}

	/**
	 * @see java.sql.CallableStatement#getBoolean(java.lang.String)
	 */
	public boolean getBoolean(String parameterName) throws SQLException {
		notImplemented();
		return false;
	}

	/**
	 * @see java.sql.CallableStatement#getByte(java.lang.String)
	 */
	public byte getByte(String parameterName) throws SQLException {
		notImplemented();
		return 0;
	}

	/**
	 * @see java.sql.CallableStatement#getShort(java.lang.String)
	 */
	public short getShort(String parameterName) throws SQLException {
		notImplemented();
		return 0;
	}

	/**
	 * @see java.sql.CallableStatement#getInt(java.lang.String)
	 */
	public int getInt(String parameterName) throws SQLException {
		notImplemented();
		return 0;
	}

	/**
	 * @see java.sql.CallableStatement#getLong(java.lang.String)
	 */
	public long getLong(String parameterName) throws SQLException {
		notImplemented();
		return 0;
	}

	/**
	 * @see java.sql.CallableStatement#getFloat(java.lang.String)
	 */
	public float getFloat(String parameterName) throws SQLException {
		notImplemented();
		return 0;
	}

	/**
	 * @see java.sql.CallableStatement#getDouble(java.lang.String)
	 */
	public double getDouble(String parameterName) throws SQLException {
		notImplemented();
		return 0;
	}

	/**
	 * @see java.sql.CallableStatement#getBytes(java.lang.String)
	 */
	public byte[] getBytes(String parameterName) throws SQLException {
		notImplemented();
		return null;
	}

	/**
	 * @see java.sql.CallableStatement#getDate(java.lang.String)
	 */
	public Date getDate(String parameterName) throws SQLException {
		notImplemented();
		return null;
	}

	/**
	 * @see java.sql.CallableStatement#getTime(java.lang.String)
	 */
	public Time getTime(String parameterName) throws SQLException {
		notImplemented();
		return null;
	}

	/**
	 * @see java.sql.CallableStatement#getTimestamp(java.lang.String)
	 */
	public Timestamp getTimestamp(String parameterName) throws SQLException {
		notImplemented();
		return null;
	}

	/**
	 * @see java.sql.CallableStatement#getObject(java.lang.String)
	 */
	public Object getObject(String parameterName) throws SQLException {
		notImplemented();
		return null;
	}

	/**
	 * @see java.sql.CallableStatement#getBigDecimal(java.lang.String)
	 */
	public BigDecimal getBigDecimal(String parameterName) throws SQLException {
		notImplemented();
		return null;
	}

	/**
	 * @see java.sql.CallableStatement#getObject(java.lang.String, java.util.Map)
	 */
	public Object getObject(String parameterName, Map map)
		throws SQLException {
			notImplemented();
		return null;
	}

	/**
	 * @see java.sql.CallableStatement#getRef(java.lang.String)
	 */
	public Ref getRef(String parameterName) throws SQLException {
		notImplemented();
		return null;
	}

	/**
	 * @see java.sql.CallableStatement#getBlob(java.lang.String)
	 */
	public Blob getBlob(String parameterName) throws SQLException {
		notImplemented();
		return null;
	}

	/**
	 * @see java.sql.CallableStatement#getClob(java.lang.String)
	 */
	public Clob getClob(String parameterName) throws SQLException {
		notImplemented();
		return null;
	}

	/**
	 * @see java.sql.CallableStatement#getArray(java.lang.String)
	 */
	public Array getArray(String parameterName) throws SQLException {
		notImplemented();
		return null;
	}

	/**
	 * @see java.sql.CallableStatement#getDate(java.lang.String, java.util.Calendar)
	 */
	public Date getDate(String parameterName, Calendar cal)
		throws SQLException {
			notImplemented();
		return null;
	}

	/**
	 * @see java.sql.CallableStatement#getTime(java.lang.String, java.util.Calendar)
	 */
	public Time getTime(String parameterName, Calendar cal)
		throws SQLException {
			notImplemented();
		return null;
	}

	/**
	 * @see java.sql.CallableStatement#getTimestamp(java.lang.String, java.util.Calendar)
	 */
	public Timestamp getTimestamp(String parameterName, Calendar cal)
		throws SQLException {
			notImplemented();
		return null;
	}

	/**
	 * @see java.sql.CallableStatement#getURL(java.lang.String)
	 */
	public URL getURL(String parameterName) throws SQLException {
		notImplemented();
		return null;
	}

	/**
	 * Retrieves the value of the designated JDBC <code>ROWID</code> parameter as a
	 * <code>java.sql.RowId</code> object.
	 *
	 * @param parameterIndex the first parameter is 1, the second is 2,...
	 * @return a <code>RowId</code> object that represents the JDBC <code>ROWID</code>
	 * value is used as the designated parameter. If the parameter contains
	 * a SQL <code>NULL</code>, then a <code>null</code> value is returned.
	 * @throws SQLException                    if the parameterIndex is not valid;
	 *                                         if a database access error occurs or
	 *                                         this method is called on a closed <code>CallableStatement</code>
	 * @throws SQLFeatureNotSupportedException if the JDBC driver does not support
	 *                                         this method
	 * @since 1.6
	 */
	@Override
	public RowId getRowId(int parameterIndex) throws SQLException {
		return null;
	}

	/**
	 * Retrieves the value of the designated JDBC <code>ROWID</code> parameter as a
	 * <code>java.sql.RowId</code> object.
	 *
	 * @param parameterName the name of the parameter
	 * @return a <code>RowId</code> object that represents the JDBC <code>ROWID</code>
	 * value is used as the designated parameter. If the parameter contains
	 * a SQL <code>NULL</code>, then a <code>null</code> value is returned.
	 * @throws SQLException                    if parameterName does not correspond to a named
	 *                                         parameter; if a database access error occurs or
	 *                                         this method is called on a closed <code>CallableStatement</code>
	 * @throws SQLFeatureNotSupportedException if the JDBC driver does not support
	 *                                         this method
	 * @since 1.6
	 */
	@Override
	public RowId getRowId(String parameterName) throws SQLException {
		return null;
	}

	/**
	 * Sets the designated parameter to the given <code>java.sql.RowId</code> object. The
	 * driver converts this to a SQL <code>ROWID</code> when it sends it to the
	 * database.
	 *
	 * @param parameterName the name of the parameter
	 * @param x             the parameter value
	 * @throws SQLException                    if parameterName does not correspond to a named
	 *                                         parameter; if a database access error occurs or
	 *                                         this method is called on a closed <code>CallableStatement</code>
	 * @throws SQLFeatureNotSupportedException if the JDBC driver does not support
	 *                                         this method
	 * @since 1.6
	 */
	@Override
	public void setRowId(String parameterName, RowId x) throws SQLException {

	}

	/**
	 * Sets the designated parameter to the given <code>String</code> object.
	 * The driver converts this to a SQL <code>NCHAR</code> or
	 * <code>NVARCHAR</code> or <code>LONGNVARCHAR</code>
	 *
	 * @param parameterName the name of the parameter to be set
	 * @param value         the parameter value
	 * @throws SQLException                    if parameterName does not correspond to a named
	 *                                         parameter; if the driver does not support national
	 *                                         character sets;  if the driver can detect that a data conversion
	 *                                         error could occur; if a database access error occurs or
	 *                                         this method is called on a closed <code>CallableStatement</code>
	 * @throws SQLFeatureNotSupportedException if the JDBC driver does not support
	 *                                         this method
	 * @since 1.6
	 */
	@Override
	public void setNString(String parameterName, String value) throws SQLException {

	}

	/**
	 * Sets the designated parameter to a <code>Reader</code> object. The
	 * <code>Reader</code> reads the data till end-of-file is reached. The
	 * driver does the necessary conversion from Java character format to
	 * the national character set in the database.
	 *
	 * @param parameterName the name of the parameter to be set
	 * @param value         the parameter value
	 * @param length        the number of characters in the parameter data.
	 * @throws SQLException                    if parameterName does not correspond to a named
	 *                                         parameter; if the driver does not support national
	 *                                         character sets;  if the driver can detect that a data conversion
	 *                                         error could occur; if a database access error occurs or
	 *                                         this method is called on a closed <code>CallableStatement</code>
	 * @throws SQLFeatureNotSupportedException if the JDBC driver does not support
	 *                                         this method
	 * @since 1.6
	 */
	@Override
	public void setNCharacterStream(String parameterName, Reader value, long length) throws SQLException {

	}

	/**
	 * Sets the designated parameter to a <code>java.sql.NClob</code> object. The object
	 * implements the <code>java.sql.NClob</code> interface. This <code>NClob</code>
	 * object maps to a SQL <code>NCLOB</code>.
	 *
	 * @param parameterName the name of the parameter to be set
	 * @param value         the parameter value
	 * @throws SQLException                    if parameterName does not correspond to a named
	 *                                         parameter; if the driver does not support national
	 *                                         character sets;  if the driver can detect that a data conversion
	 *                                         error could occur; if a database access error occurs or
	 *                                         this method is called on a closed <code>CallableStatement</code>
	 * @throws SQLFeatureNotSupportedException if the JDBC driver does not support
	 *                                         this method
	 * @since 1.6
	 */
	@Override
	public void setNClob(String parameterName, NClob value) throws SQLException {

	}

	/**
	 * Sets the designated parameter to a <code>Reader</code> object.  The <code>reader</code> must contain  the number
	 * of characters specified by length otherwise a <code>SQLException</code> will be
	 * generated when the <code>CallableStatement</code> is executed.
	 * This method differs from the <code>setCharacterStream (int, Reader, int)</code> method
	 * because it informs the driver that the parameter value should be sent to
	 * the server as a <code>CLOB</code>.  When the <code>setCharacterStream</code> method is used, the
	 * driver may have to do extra work to determine whether the parameter
	 * data should be send to the server as a <code>LONGVARCHAR</code> or a <code>CLOB</code>
	 *
	 * @param parameterName the name of the parameter to be set
	 * @param reader        An object that contains the data to set the parameter value to.
	 * @param length        the number of characters in the parameter data.
	 * @throws SQLException                    if parameterName does not correspond to a named
	 *                                         parameter; if the length specified is less than zero;
	 *                                         a database access error occurs or
	 *                                         this method is called on a closed <code>CallableStatement</code>
	 * @throws SQLFeatureNotSupportedException if the JDBC driver does not support
	 *                                         this method
	 * @since 1.6
	 */
	@Override
	public void setClob(String parameterName, Reader reader, long length) throws SQLException {

	}

	/**
	 * Sets the designated parameter to a <code>InputStream</code> object.  The <code>inputstream</code> must contain  the number
	 * of characters specified by length, otherwise a <code>SQLException</code> will be
	 * generated when the <code>CallableStatement</code> is executed.
	 * This method differs from the <code>setBinaryStream (int, InputStream, int)</code>
	 * method because it informs the driver that the parameter value should be
	 * sent to the server as a <code>BLOB</code>.  When the <code>setBinaryStream</code> method is used,
	 * the driver may have to do extra work to determine whether the parameter
	 * data should be sent to the server as a <code>LONGVARBINARY</code> or a <code>BLOB</code>
	 *
	 * @param parameterName the name of the parameter to be set
	 *                      the second is 2, ...
	 * @param inputStream   An object that contains the data to set the parameter
	 *                      value to.
	 * @param length        the number of bytes in the parameter data.
	 * @throws SQLException                    if parameterName does not correspond to a named
	 *                                         parameter; if the length specified
	 *                                         is less than zero; if the number of bytes in the inputstream does not match
	 *                                         the specified length; if a database access error occurs or
	 *                                         this method is called on a closed <code>CallableStatement</code>
	 * @throws SQLFeatureNotSupportedException if the JDBC driver does not support
	 *                                         this method
	 * @since 1.6
	 */
	@Override
	public void setBlob(String parameterName, InputStream inputStream, long length) throws SQLException {

	}

	/**
	 * Sets the designated parameter to a <code>Reader</code> object.  The <code>reader</code> must contain  the number
	 * of characters specified by length otherwise a <code>SQLException</code> will be
	 * generated when the <code>CallableStatement</code> is executed.
	 * This method differs from the <code>setCharacterStream (int, Reader, int)</code> method
	 * because it informs the driver that the parameter value should be sent to
	 * the server as a <code>NCLOB</code>.  When the <code>setCharacterStream</code> method is used, the
	 * driver may have to do extra work to determine whether the parameter
	 * data should be send to the server as a <code>LONGNVARCHAR</code> or a <code>NCLOB</code>
	 *
	 * @param parameterName the name of the parameter to be set
	 * @param reader        An object that contains the data to set the parameter value to.
	 * @param length        the number of characters in the parameter data.
	 * @throws SQLException                    if parameterName does not correspond to a named
	 *                                         parameter; if the length specified is less than zero;
	 *                                         if the driver does not support national
	 *                                         character sets;  if the driver can detect that a data conversion
	 *                                         error could occur; if a database access error occurs or
	 *                                         this method is called on a closed <code>CallableStatement</code>
	 * @throws SQLFeatureNotSupportedException if the JDBC driver does not support
	 *                                         this method
	 * @since 1.6
	 */
	@Override
	public void setNClob(String parameterName, Reader reader, long length) throws SQLException {

	}

	/**
	 * Retrieves the value of the designated JDBC <code>NCLOB</code> parameter as a
	 * <code>java.sql.NClob</code> object in the Java programming language.
	 *
	 * @param parameterIndex the first parameter is 1, the second is 2, and
	 *                       so on
	 * @return the parameter value as a <code>NClob</code> object in the
	 * Java programming language.  If the value was SQL <code>NULL</code>, the
	 * value <code>null</code> is returned.
	 * @throws SQLException                    if the parameterIndex is not valid;
	 *                                         if the driver does not support national
	 *                                         character sets;  if the driver can detect that a data conversion
	 *                                         error could occur; if a database access error occurs or
	 *                                         this method is called on a closed <code>CallableStatement</code>
	 * @throws SQLFeatureNotSupportedException if the JDBC driver does not support
	 *                                         this method
	 * @since 1.6
	 */
	@Override
	public NClob getNClob(int parameterIndex) throws SQLException {
		return null;
	}

	/**
	 * Retrieves the value of a JDBC <code>NCLOB</code> parameter as a
	 * <code>java.sql.NClob</code> object in the Java programming language.
	 *
	 * @param parameterName the name of the parameter
	 * @return the parameter value as a <code>NClob</code> object in the
	 * Java programming language.  If the value was SQL <code>NULL</code>,
	 * the value <code>null</code> is returned.
	 * @throws SQLException                    if parameterName does not correspond to a named
	 *                                         parameter; if the driver does not support national
	 *                                         character sets;  if the driver can detect that a data conversion
	 *                                         error could occur; if a database access error occurs or
	 *                                         this method is called on a closed <code>CallableStatement</code>
	 * @throws SQLFeatureNotSupportedException if the JDBC driver does not support
	 *                                         this method
	 * @since 1.6
	 */
	@Override
	public NClob getNClob(String parameterName) throws SQLException {
		return null;
	}

	/**
	 * Sets the designated parameter to the given <code>java.sql.SQLXML</code> object. The driver converts this to an
	 * <code>SQL XML</code> value when it sends it to the database.
	 *
	 * @param parameterName the name of the parameter
	 * @param xmlObject     a <code>SQLXML</code> object that maps an <code>SQL XML</code> value
	 * @throws SQLException                    if parameterName does not correspond to a named
	 *                                         parameter; if a database access error occurs;
	 *                                         this method is called on a closed <code>CallableStatement</code> or
	 *                                         the <code>java.xml.transform.Result</code>,
	 *                                         <code>Writer</code> or <code>OutputStream</code> has not been closed for the <code>SQLXML</code> object
	 * @throws SQLFeatureNotSupportedException if the JDBC driver does not support
	 *                                         this method
	 * @since 1.6
	 */
	@Override
	public void setSQLXML(String parameterName, SQLXML xmlObject) throws SQLException {

	}

	/**
	 * Retrieves the value of the designated <code>SQL XML</code> parameter as a
	 * <code>java.sql.SQLXML</code> object in the Java programming language.
	 *
	 * @param parameterIndex index of the first parameter is 1, the second is 2, ...
	 * @return a <code>SQLXML</code> object that maps an <code>SQL XML</code> value
	 * @throws SQLException                    if the parameterIndex is not valid;
	 *                                         if a database access error occurs or
	 *                                         this method is called on a closed <code>CallableStatement</code>
	 * @throws SQLFeatureNotSupportedException if the JDBC driver does not support
	 *                                         this method
	 * @since 1.6
	 */
	@Override
	public SQLXML getSQLXML(int parameterIndex) throws SQLException {
		return null;
	}

	/**
	 * Retrieves the value of the designated <code>SQL XML</code> parameter as a
	 * <code>java.sql.SQLXML</code> object in the Java programming language.
	 *
	 * @param parameterName the name of the parameter
	 * @return a <code>SQLXML</code> object that maps an <code>SQL XML</code> value
	 * @throws SQLException                    if parameterName does not correspond to a named
	 *                                         parameter; if a database access error occurs or
	 *                                         this method is called on a closed <code>CallableStatement</code>
	 * @throws SQLFeatureNotSupportedException if the JDBC driver does not support
	 *                                         this method
	 * @since 1.6
	 */
	@Override
	public SQLXML getSQLXML(String parameterName) throws SQLException {
		return null;
	}

	/**
	 * Retrieves the value of the designated <code>NCHAR</code>,
	 * <code>NVARCHAR</code>
	 * or <code>LONGNVARCHAR</code> parameter as
	 * a <code>String</code> in the Java programming language.
	 * <p>
	 * For the fixed-length type JDBC <code>NCHAR</code>,
	 * the <code>String</code> object
	 * returned has exactly the same value the SQL
	 * <code>NCHAR</code> value had in the
	 * database, including any padding added by the database.
	 *
	 * @param parameterIndex index of the first parameter is 1, the second is 2, ...
	 * @return a <code>String</code> object that maps an
	 * <code>NCHAR</code>, <code>NVARCHAR</code> or <code>LONGNVARCHAR</code> value
	 * @throws SQLException                    if the parameterIndex is not valid;
	 *                                         if a database access error occurs or
	 *                                         this method is called on a closed <code>CallableStatement</code>
	 * @throws SQLFeatureNotSupportedException if the JDBC driver does not support
	 *                                         this method
	 * @see #setNString
	 * @since 1.6
	 */
	@Override
	public String getNString(int parameterIndex) throws SQLException {
		return null;
	}

	/**
	 * Retrieves the value of the designated <code>NCHAR</code>,
	 * <code>NVARCHAR</code>
	 * or <code>LONGNVARCHAR</code> parameter as
	 * a <code>String</code> in the Java programming language.
	 * <p>
	 * For the fixed-length type JDBC <code>NCHAR</code>,
	 * the <code>String</code> object
	 * returned has exactly the same value the SQL
	 * <code>NCHAR</code> value had in the
	 * database, including any padding added by the database.
	 *
	 * @param parameterName the name of the parameter
	 * @return a <code>String</code> object that maps an
	 * <code>NCHAR</code>, <code>NVARCHAR</code> or <code>LONGNVARCHAR</code> value
	 * @throws SQLException                    if parameterName does not correspond to a named
	 *                                         parameter;
	 *                                         if a database access error occurs or
	 *                                         this method is called on a closed <code>CallableStatement</code>
	 * @throws SQLFeatureNotSupportedException if the JDBC driver does not support
	 *                                         this method
	 * @see #setNString
	 * @since 1.6
	 */
	@Override
	public String getNString(String parameterName) throws SQLException {
		return null;
	}

	/**
	 * Retrieves the value of the designated parameter as a
	 * <code>java.io.Reader</code> object in the Java programming language.
	 * It is intended for use when
	 * accessing  <code>NCHAR</code>,<code>NVARCHAR</code>
	 * and <code>LONGNVARCHAR</code> parameters.
	 *
	 * @param parameterIndex the first parameter is 1, the second is 2, ...
	 * @return a <code>java.io.Reader</code> object that contains the parameter
	 * value; if the value is SQL <code>NULL</code>, the value returned is
	 * <code>null</code> in the Java programming language.
	 * @throws SQLException                    if the parameterIndex is not valid;
	 *                                         if a database access error occurs or
	 *                                         this method is called on a closed <code>CallableStatement</code>
	 * @throws SQLFeatureNotSupportedException if the JDBC driver does not support
	 *                                         this method
	 * @since 1.6
	 */
	@Override
	public Reader getNCharacterStream(int parameterIndex) throws SQLException {
		return null;
	}

	/**
	 * Retrieves the value of the designated parameter as a
	 * <code>java.io.Reader</code> object in the Java programming language.
	 * It is intended for use when
	 * accessing  <code>NCHAR</code>,<code>NVARCHAR</code>
	 * and <code>LONGNVARCHAR</code> parameters.
	 *
	 * @param parameterName the name of the parameter
	 * @return a <code>java.io.Reader</code> object that contains the parameter
	 * value; if the value is SQL <code>NULL</code>, the value returned is
	 * <code>null</code> in the Java programming language
	 * @throws SQLException                    if parameterName does not correspond to a named
	 *                                         parameter; if a database access error occurs or
	 *                                         this method is called on a closed <code>CallableStatement</code>
	 * @throws SQLFeatureNotSupportedException if the JDBC driver does not support
	 *                                         this method
	 * @since 1.6
	 */
	@Override
	public Reader getNCharacterStream(String parameterName) throws SQLException {
		return null;
	}

	/**
	 * Retrieves the value of the designated parameter as a
	 * <code>java.io.Reader</code> object in the Java programming language.
	 *
	 * @param parameterIndex the first parameter is 1, the second is 2, ...
	 * @return a <code>java.io.Reader</code> object that contains the parameter
	 * value; if the value is SQL <code>NULL</code>, the value returned is
	 * <code>null</code> in the Java programming language.
	 * @throws SQLException if the parameterIndex is not valid; if a database access error occurs or
	 *                      this method is called on a closed <code>CallableStatement</code>
	 * @since 1.6
	 */
	@Override
	public Reader getCharacterStream(int parameterIndex) throws SQLException {
		return null;
	}

	/**
	 * Retrieves the value of the designated parameter as a
	 * <code>java.io.Reader</code> object in the Java programming language.
	 *
	 * @param parameterName the name of the parameter
	 * @return a <code>java.io.Reader</code> object that contains the parameter
	 * value; if the value is SQL <code>NULL</code>, the value returned is
	 * <code>null</code> in the Java programming language
	 * @throws SQLException                    if parameterName does not correspond to a named
	 *                                         parameter; if a database access error occurs or
	 *                                         this method is called on a closed <code>CallableStatement</code>
	 * @throws SQLFeatureNotSupportedException if the JDBC driver does not support
	 *                                         this method
	 * @since 1.6
	 */
	@Override
	public Reader getCharacterStream(String parameterName) throws SQLException {
		return null;
	}

	/**
	 * Sets the designated parameter to the given <code>java.sql.Blob</code> object.
	 * The driver converts this to an SQL <code>BLOB</code> value when it
	 * sends it to the database.
	 *
	 * @param parameterName the name of the parameter
	 * @param x             a <code>Blob</code> object that maps an SQL <code>BLOB</code> value
	 * @throws SQLException                    if parameterName does not correspond to a named
	 *                                         parameter; if a database access error occurs or
	 *                                         this method is called on a closed <code>CallableStatement</code>
	 * @throws SQLFeatureNotSupportedException if the JDBC driver does not support
	 *                                         this method
	 * @since 1.6
	 */
	@Override
	public void setBlob(String parameterName, Blob x) throws SQLException {

	}

	/**
	 * Sets the designated parameter to the given <code>java.sql.Clob</code> object.
	 * The driver converts this to an SQL <code>CLOB</code> value when it
	 * sends it to the database.
	 *
	 * @param parameterName the name of the parameter
	 * @param x             a <code>Clob</code> object that maps an SQL <code>CLOB</code> value
	 * @throws SQLException                    if parameterName does not correspond to a named
	 *                                         parameter; if a database access error occurs or
	 *                                         this method is called on a closed <code>CallableStatement</code>
	 * @throws SQLFeatureNotSupportedException if the JDBC driver does not support
	 *                                         this method
	 * @since 1.6
	 */
	@Override
	public void setClob(String parameterName, Clob x) throws SQLException {

	}

	/**
	 * Sets the designated parameter to the given input stream, which will have
	 * the specified number of bytes.
	 * When a very large ASCII value is input to a <code>LONGVARCHAR</code>
	 * parameter, it may be more practical to send it via a
	 * <code>java.io.InputStream</code>. Data will be read from the stream
	 * as needed until end-of-file is reached.  The JDBC driver will
	 * do any necessary conversion from ASCII to the database char format.
	 *
	 * <P><B>Note:</B> This stream object can either be a standard
	 * Java stream object or your own subclass that implements the
	 * standard interface.
	 *
	 * @param parameterName the name of the parameter
	 * @param x             the Java input stream that contains the ASCII parameter value
	 * @param length        the number of bytes in the stream
	 * @throws SQLException                    if parameterName does not correspond to a named
	 *                                         parameter; if a database access error occurs or
	 *                                         this method is called on a closed <code>CallableStatement</code>
	 * @throws SQLFeatureNotSupportedException if the JDBC driver does not support
	 *                                         this method
	 * @since 1.6
	 */
	@Override
	public void setAsciiStream(String parameterName, InputStream x, long length) throws SQLException {

	}

	/**
	 * Sets the designated parameter to the given input stream, which will have
	 * the specified number of bytes.
	 * When a very large binary value is input to a <code>LONGVARBINARY</code>
	 * parameter, it may be more practical to send it via a
	 * <code>java.io.InputStream</code> object. The data will be read from the stream
	 * as needed until end-of-file is reached.
	 *
	 * <P><B>Note:</B> This stream object can either be a standard
	 * Java stream object or your own subclass that implements the
	 * standard interface.
	 *
	 * @param parameterName the name of the parameter
	 * @param x             the java input stream which contains the binary parameter value
	 * @param length        the number of bytes in the stream
	 * @throws SQLException                    if parameterName does not correspond to a named
	 *                                         parameter; if a database access error occurs or
	 *                                         this method is called on a closed <code>CallableStatement</code>
	 * @throws SQLFeatureNotSupportedException if the JDBC driver does not support
	 *                                         this method
	 * @since 1.6
	 */
	@Override
	public void setBinaryStream(String parameterName, InputStream x, long length) throws SQLException {

	}

	/**
	 * Sets the designated parameter to the given <code>Reader</code>
	 * object, which is the given number of characters long.
	 * When a very large UNICODE value is input to a <code>LONGVARCHAR</code>
	 * parameter, it may be more practical to send it via a
	 * <code>java.io.Reader</code> object. The data will be read from the stream
	 * as needed until end-of-file is reached.  The JDBC driver will
	 * do any necessary conversion from UNICODE to the database char format.
	 *
	 * <P><B>Note:</B> This stream object can either be a standard
	 * Java stream object or your own subclass that implements the
	 * standard interface.
	 *
	 * @param parameterName the name of the parameter
	 * @param reader        the <code>java.io.Reader</code> object that
	 *                      contains the UNICODE data used as the designated parameter
	 * @param length        the number of characters in the stream
	 * @throws SQLException                    if parameterName does not correspond to a named
	 *                                         parameter; if a database access error occurs or
	 *                                         this method is called on a closed <code>CallableStatement</code>
	 * @throws SQLFeatureNotSupportedException if the JDBC driver does not support
	 *                                         this method
	 * @since 1.6
	 */
	@Override
	public void setCharacterStream(String parameterName, Reader reader, long length) throws SQLException {

	}

	/**
	 * Sets the designated parameter to the given input stream.
	 * When a very large ASCII value is input to a <code>LONGVARCHAR</code>
	 * parameter, it may be more practical to send it via a
	 * <code>java.io.InputStream</code>. Data will be read from the stream
	 * as needed until end-of-file is reached.  The JDBC driver will
	 * do any necessary conversion from ASCII to the database char format.
	 *
	 * <P><B>Note:</B> This stream object can either be a standard
	 * Java stream object or your own subclass that implements the
	 * standard interface.
	 * <P><B>Note:</B> Consult your JDBC driver documentation to determine if
	 * it might be more efficient to use a version of
	 * <code>setAsciiStream</code> which takes a length parameter.
	 *
	 * @param parameterName the name of the parameter
	 * @param x             the Java input stream that contains the ASCII parameter value
	 * @throws SQLException                    if parameterName does not correspond to a named
	 *                                         parameter; if a database access error occurs or
	 *                                         this method is called on a closed <code>CallableStatement</code>
	 * @throws SQLFeatureNotSupportedException if the JDBC driver does not support this method
	 * @since 1.6
	 */
	@Override
	public void setAsciiStream(String parameterName, InputStream x) throws SQLException {

	}

	/**
	 * Sets the designated parameter to the given input stream.
	 * When a very large binary value is input to a <code>LONGVARBINARY</code>
	 * parameter, it may be more practical to send it via a
	 * <code>java.io.InputStream</code> object. The data will be read from the
	 * stream as needed until end-of-file is reached.
	 *
	 * <P><B>Note:</B> This stream object can either be a standard
	 * Java stream object or your own subclass that implements the
	 * standard interface.
	 * <P><B>Note:</B> Consult your JDBC driver documentation to determine if
	 * it might be more efficient to use a version of
	 * <code>setBinaryStream</code> which takes a length parameter.
	 *
	 * @param parameterName the name of the parameter
	 * @param x             the java input stream which contains the binary parameter value
	 * @throws SQLException                    if parameterName does not correspond to a named
	 *                                         parameter; if a database access error occurs or
	 *                                         this method is called on a closed <code>CallableStatement</code>
	 * @throws SQLFeatureNotSupportedException if the JDBC driver does not support this method
	 * @since 1.6
	 */
	@Override
	public void setBinaryStream(String parameterName, InputStream x) throws SQLException {

	}

	/**
	 * Sets the designated parameter to the given <code>Reader</code>
	 * object.
	 * When a very large UNICODE value is input to a <code>LONGVARCHAR</code>
	 * parameter, it may be more practical to send it via a
	 * <code>java.io.Reader</code> object. The data will be read from the stream
	 * as needed until end-of-file is reached.  The JDBC driver will
	 * do any necessary conversion from UNICODE to the database char format.
	 *
	 * <P><B>Note:</B> This stream object can either be a standard
	 * Java stream object or your own subclass that implements the
	 * standard interface.
	 * <P><B>Note:</B> Consult your JDBC driver documentation to determine if
	 * it might be more efficient to use a version of
	 * <code>setCharacterStream</code> which takes a length parameter.
	 *
	 * @param parameterName the name of the parameter
	 * @param reader        the <code>java.io.Reader</code> object that contains the
	 *                      Unicode data
	 * @throws SQLException                    if parameterName does not correspond to a named
	 *                                         parameter; if a database access error occurs or
	 *                                         this method is called on a closed <code>CallableStatement</code>
	 * @throws SQLFeatureNotSupportedException if the JDBC driver does not support this method
	 * @since 1.6
	 */
	@Override
	public void setCharacterStream(String parameterName, Reader reader) throws SQLException {

	}

	/**
	 * Sets the designated parameter to a <code>Reader</code> object. The
	 * <code>Reader</code> reads the data till end-of-file is reached. The
	 * driver does the necessary conversion from Java character format to
	 * the national character set in the database.
	 *
	 * <P><B>Note:</B> This stream object can either be a standard
	 * Java stream object or your own subclass that implements the
	 * standard interface.
	 * <P><B>Note:</B> Consult your JDBC driver documentation to determine if
	 * it might be more efficient to use a version of
	 * <code>setNCharacterStream</code> which takes a length parameter.
	 *
	 * @param parameterName the name of the parameter
	 * @param value         the parameter value
	 * @throws SQLException                    if parameterName does not correspond to a named
	 *                                         parameter; if the driver does not support national
	 *                                         character sets;  if the driver can detect that a data conversion
	 *                                         error could occur; if a database access error occurs; or
	 *                                         this method is called on a closed <code>CallableStatement</code>
	 * @throws SQLFeatureNotSupportedException if the JDBC driver does not support this method
	 * @since 1.6
	 */
	@Override
	public void setNCharacterStream(String parameterName, Reader value) throws SQLException {

	}

	/**
	 * Sets the designated parameter to a <code>Reader</code> object.
	 * This method differs from the <code>setCharacterStream (int, Reader)</code> method
	 * because it informs the driver that the parameter value should be sent to
	 * the server as a <code>CLOB</code>.  When the <code>setCharacterStream</code> method is used, the
	 * driver may have to do extra work to determine whether the parameter
	 * data should be send to the server as a <code>LONGVARCHAR</code> or a <code>CLOB</code>
	 *
	 * <P><B>Note:</B> Consult your JDBC driver documentation to determine if
	 * it might be more efficient to use a version of
	 * <code>setClob</code> which takes a length parameter.
	 *
	 * @param parameterName the name of the parameter
	 * @param reader        An object that contains the data to set the parameter value to.
	 * @throws SQLException                    if parameterName does not correspond to a named
	 *                                         parameter; if a database access error occurs or this method is called on
	 *                                         a closed <code>CallableStatement</code>
	 * @throws SQLFeatureNotSupportedException if the JDBC driver does not support this method
	 * @since 1.6
	 */
	@Override
	public void setClob(String parameterName, Reader reader) throws SQLException {

	}

	/**
	 * Sets the designated parameter to a <code>InputStream</code> object.
	 * This method differs from the <code>setBinaryStream (int, InputStream)</code>
	 * method because it informs the driver that the parameter value should be
	 * sent to the server as a <code>BLOB</code>.  When the <code>setBinaryStream</code> method is used,
	 * the driver may have to do extra work to determine whether the parameter
	 * data should be send to the server as a <code>LONGVARBINARY</code> or a <code>BLOB</code>
	 *
	 * <P><B>Note:</B> Consult your JDBC driver documentation to determine if
	 * it might be more efficient to use a version of
	 * <code>setBlob</code> which takes a length parameter.
	 *
	 * @param parameterName the name of the parameter
	 * @param inputStream   An object that contains the data to set the parameter
	 *                      value to.
	 * @throws SQLException                    if parameterName does not correspond to a named
	 *                                         parameter; if a database access error occurs or
	 *                                         this method is called on a closed <code>CallableStatement</code>
	 * @throws SQLFeatureNotSupportedException if the JDBC driver does not support this method
	 * @since 1.6
	 */
	@Override
	public void setBlob(String parameterName, InputStream inputStream) throws SQLException {

	}

	/**
	 * Sets the designated parameter to a <code>Reader</code> object.
	 * This method differs from the <code>setCharacterStream (int, Reader)</code> method
	 * because it informs the driver that the parameter value should be sent to
	 * the server as a <code>NCLOB</code>.  When the <code>setCharacterStream</code> method is used, the
	 * driver may have to do extra work to determine whether the parameter
	 * data should be send to the server as a <code>LONGNVARCHAR</code> or a <code>NCLOB</code>
	 * <P><B>Note:</B> Consult your JDBC driver documentation to determine if
	 * it might be more efficient to use a version of
	 * <code>setNClob</code> which takes a length parameter.
	 *
	 * @param parameterName the name of the parameter
	 * @param reader        An object that contains the data to set the parameter value to.
	 * @throws SQLException                    if parameterName does not correspond to a named
	 *                                         parameter; if the driver does not support national character sets;
	 *                                         if the driver can detect that a data conversion
	 *                                         error could occur;  if a database access error occurs or
	 *                                         this method is called on a closed <code>CallableStatement</code>
	 * @throws SQLFeatureNotSupportedException if the JDBC driver does not support this method
	 * @since 1.6
	 */
	@Override
	public void setNClob(String parameterName, Reader reader) throws SQLException {

	}

	/**
	 * <p>Returns an object representing the value of OUT parameter
	 * {@code parameterIndex} and will convert from the
	 * SQL type of the parameter to the requested Java data type, if the
	 * conversion is supported. If the conversion is not
	 * supported or null is specified for the type, a
	 * <code>SQLException</code> is thrown.
	 * <p>
	 * At a minimum, an implementation must support the conversions defined in
	 * Appendix B, Table B-3 and conversion of appropriate user defined SQL
	 * types to a Java type which implements {@code SQLData}, or {@code Struct}.
	 * Additional conversions may be supported and are vendor defined.
	 *
	 * @param parameterIndex the first parameter is 1, the second is 2, and so on
	 * @param type           Class representing the Java data type to convert the
	 *                       designated parameter to.
	 * @return an instance of {@code type} holding the OUT parameter value
	 * @throws SQLException                    if conversion is not supported, type is null or
	 *                                         another error occurs. The getCause() method of the
	 *                                         exception may provide a more detailed exception, for example, if
	 *                                         a conversion error occurs
	 * @throws SQLFeatureNotSupportedException if the JDBC driver does not support
	 *                                         this method
	 * @since 1.7
	 */
	@Override
	public <T> T getObject(int parameterIndex, Class<T> type) throws SQLException {
		return null;
	}

	/**
	 * <p>Returns an object representing the value of OUT parameter
	 * {@code parameterName} and will convert from the
	 * SQL type of the parameter to the requested Java data type, if the
	 * conversion is supported. If the conversion is not
	 * supported  or null is specified for the type, a
	 * <code>SQLException</code> is thrown.
	 * <p>
	 * At a minimum, an implementation must support the conversions defined in
	 * Appendix B, Table B-3 and conversion of appropriate user defined SQL
	 * types to a Java type which implements {@code SQLData}, or {@code Struct}.
	 * Additional conversions may be supported and are vendor defined.
	 *
	 * @param parameterName the name of the parameter
	 * @param type          Class representing the Java data type to convert
	 *                      the designated parameter to.
	 * @return an instance of {@code type} holding the OUT parameter
	 * value
	 * @throws SQLException                    if conversion is not supported, type is null or
	 *                                         another error occurs. The getCause() method of the
	 *                                         exception may provide a more detailed exception, for example, if
	 *                                         a conversion error occurs
	 * @throws SQLFeatureNotSupportedException if the JDBC driver does not support
	 *                                         this method
	 * @since 1.7
	 */
	@Override
	public <T> T getObject(String parameterName, Class<T> type) throws SQLException {
		return null;
	}

	/**
	 * @see java.sql.PreparedStatement#setURL(int, java.net.URL)
	 */
	public void setURL(int parameterIndex, URL x) throws SQLException {
		notImplemented();
	}

	/**
	 * @see java.sql.PreparedStatement#getParameterMetaData()
	 */
	public ParameterMetaData getParameterMetaData() throws SQLException {
		notImplemented();
		return null;
	}

	/**
	 * Sets the designated parameter to the given <code>java.sql.RowId</code> object. The
	 * driver converts this to a SQL <code>ROWID</code> value when it sends it
	 * to the database
	 *
	 * @param parameterIndex the first parameter is 1, the second is 2, ...
	 * @param x              the parameter value
	 * @throws SQLException                    if parameterIndex does not correspond to a parameter
	 *                                         marker in the SQL statement; if a database access error occurs or
	 *                                         this method is called on a closed <code>PreparedStatement</code>
	 * @throws SQLFeatureNotSupportedException if the JDBC driver does not support this method
	 * @since 1.6
	 */
	@Override
	public void setRowId(int parameterIndex, RowId x) throws SQLException {

	}

	/**
	 * Sets the designated parameter to the given <code>String</code> object.
	 * The driver converts this to a SQL <code>NCHAR</code> or
	 * <code>NVARCHAR</code> or <code>LONGNVARCHAR</code> value
	 * (depending on the argument's
	 * size relative to the driver's limits on <code>NVARCHAR</code> values)
	 * when it sends it to the database.
	 *
	 * @param parameterIndex of the first parameter is 1, the second is 2, ...
	 * @param value          the parameter value
	 * @throws SQLException                    if parameterIndex does not correspond to a parameter
	 *                                         marker in the SQL statement; if the driver does not support national
	 *                                         character sets;  if the driver can detect that a data conversion
	 *                                         error could occur; if a database access error occurs; or
	 *                                         this method is called on a closed <code>PreparedStatement</code>
	 * @throws SQLFeatureNotSupportedException if the JDBC driver does not support this method
	 * @since 1.6
	 */
	@Override
	public void setNString(int parameterIndex, String value) throws SQLException {

	}

	/**
	 * Sets the designated parameter to a <code>Reader</code> object. The
	 * <code>Reader</code> reads the data till end-of-file is reached. The
	 * driver does the necessary conversion from Java character format to
	 * the national character set in the database.
	 *
	 * @param parameterIndex of the first parameter is 1, the second is 2, ...
	 * @param value          the parameter value
	 * @param length         the number of characters in the parameter data.
	 * @throws SQLException                    if parameterIndex does not correspond to a parameter
	 *                                         marker in the SQL statement; if the driver does not support national
	 *                                         character sets;  if the driver can detect that a data conversion
	 *                                         error could occur; if a database access error occurs; or
	 *                                         this method is called on a closed <code>PreparedStatement</code>
	 * @throws SQLFeatureNotSupportedException if the JDBC driver does not support this method
	 * @since 1.6
	 */
	@Override
	public void setNCharacterStream(int parameterIndex, Reader value, long length) throws SQLException {

	}

	/**
	 * Sets the designated parameter to a <code>java.sql.NClob</code> object. The driver converts this to a
	 * SQL <code>NCLOB</code> value when it sends it to the database.
	 *
	 * @param parameterIndex of the first parameter is 1, the second is 2, ...
	 * @param value          the parameter value
	 * @throws SQLException                    if parameterIndex does not correspond to a parameter
	 *                                         marker in the SQL statement; if the driver does not support national
	 *                                         character sets;  if the driver can detect that a data conversion
	 *                                         error could occur; if a database access error occurs; or
	 *                                         this method is called on a closed <code>PreparedStatement</code>
	 * @throws SQLFeatureNotSupportedException if the JDBC driver does not support this method
	 * @since 1.6
	 */
	@Override
	public void setNClob(int parameterIndex, NClob value) throws SQLException {

	}

	/**
	 * Sets the designated parameter to a <code>Reader</code> object.  The reader must contain  the number
	 * of characters specified by length otherwise a <code>SQLException</code> will be
	 * generated when the <code>PreparedStatement</code> is executed.
	 * This method differs from the <code>setCharacterStream (int, Reader, int)</code> method
	 * because it informs the driver that the parameter value should be sent to
	 * the server as a <code>CLOB</code>.  When the <code>setCharacterStream</code> method is used, the
	 * driver may have to do extra work to determine whether the parameter
	 * data should be sent to the server as a <code>LONGVARCHAR</code> or a <code>CLOB</code>
	 *
	 * @param parameterIndex index of the first parameter is 1, the second is 2, ...
	 * @param reader         An object that contains the data to set the parameter value to.
	 * @param length         the number of characters in the parameter data.
	 * @throws SQLException                    if parameterIndex does not correspond to a parameter
	 *                                         marker in the SQL statement; if a database access error occurs; this method is called on
	 *                                         a closed <code>PreparedStatement</code> or if the length specified is less than zero.
	 * @throws SQLFeatureNotSupportedException if the JDBC driver does not support this method
	 * @since 1.6
	 */
	@Override
	public void setClob(int parameterIndex, Reader reader, long length) throws SQLException {

	}

	/**
	 * Sets the designated parameter to a <code>InputStream</code> object.  The inputstream must contain  the number
	 * of characters specified by length otherwise a <code>SQLException</code> will be
	 * generated when the <code>PreparedStatement</code> is executed.
	 * This method differs from the <code>setBinaryStream (int, InputStream, int)</code>
	 * method because it informs the driver that the parameter value should be
	 * sent to the server as a <code>BLOB</code>.  When the <code>setBinaryStream</code> method is used,
	 * the driver may have to do extra work to determine whether the parameter
	 * data should be sent to the server as a <code>LONGVARBINARY</code> or a <code>BLOB</code>
	 *
	 * @param parameterIndex index of the first parameter is 1,
	 *                       the second is 2, ...
	 * @param inputStream    An object that contains the data to set the parameter
	 *                       value to.
	 * @param length         the number of bytes in the parameter data.
	 * @throws SQLException                    if parameterIndex does not correspond to a parameter
	 *                                         marker in the SQL statement; if a database access error occurs;
	 *                                         this method is called on a closed <code>PreparedStatement</code>;
	 *                                         if the length specified
	 *                                         is less than zero or if the number of bytes in the inputstream does not match
	 *                                         the specified length.
	 * @throws SQLFeatureNotSupportedException if the JDBC driver does not support this method
	 * @since 1.6
	 */
	@Override
	public void setBlob(int parameterIndex, InputStream inputStream, long length) throws SQLException {

	}

	/**
	 * Sets the designated parameter to a <code>Reader</code> object.  The reader must contain  the number
	 * of characters specified by length otherwise a <code>SQLException</code> will be
	 * generated when the <code>PreparedStatement</code> is executed.
	 * This method differs from the <code>setCharacterStream (int, Reader, int)</code> method
	 * because it informs the driver that the parameter value should be sent to
	 * the server as a <code>NCLOB</code>.  When the <code>setCharacterStream</code> method is used, the
	 * driver may have to do extra work to determine whether the parameter
	 * data should be sent to the server as a <code>LONGNVARCHAR</code> or a <code>NCLOB</code>
	 *
	 * @param parameterIndex index of the first parameter is 1, the second is 2, ...
	 * @param reader         An object that contains the data to set the parameter value to.
	 * @param length         the number of characters in the parameter data.
	 * @throws SQLException                    if parameterIndex does not correspond to a parameter
	 *                                         marker in the SQL statement; if the length specified is less than zero;
	 *                                         if the driver does not support national character sets;
	 *                                         if the driver can detect that a data conversion
	 *                                         error could occur;  if a database access error occurs or
	 *                                         this method is called on a closed <code>PreparedStatement</code>
	 * @throws SQLFeatureNotSupportedException if the JDBC driver does not support this method
	 * @since 1.6
	 */
	@Override
	public void setNClob(int parameterIndex, Reader reader, long length) throws SQLException {

	}

	/**
	 * Sets the designated parameter to the given <code>java.sql.SQLXML</code> object.
	 * The driver converts this to an
	 * SQL <code>XML</code> value when it sends it to the database.
	 * <p>
	 *
	 * @param parameterIndex index of the first parameter is 1, the second is 2, ...
	 * @param xmlObject      a <code>SQLXML</code> object that maps an SQL <code>XML</code> value
	 * @throws SQLException                    if parameterIndex does not correspond to a parameter
	 *                                         marker in the SQL statement; if a database access error occurs;
	 *                                         this method is called on a closed <code>PreparedStatement</code>
	 *                                         or the <code>java.xml.transform.Result</code>,
	 *                                         <code>Writer</code> or <code>OutputStream</code> has not been closed for
	 *                                         the <code>SQLXML</code> object
	 * @throws SQLFeatureNotSupportedException if the JDBC driver does not support this method
	 * @since 1.6
	 */
	@Override
	public void setSQLXML(int parameterIndex, SQLXML xmlObject) throws SQLException {

	}

	/**
	 * Sets the designated parameter to the given input stream, which will have
	 * the specified number of bytes.
	 * When a very large ASCII value is input to a <code>LONGVARCHAR</code>
	 * parameter, it may be more practical to send it via a
	 * <code>java.io.InputStream</code>. Data will be read from the stream
	 * as needed until end-of-file is reached.  The JDBC driver will
	 * do any necessary conversion from ASCII to the database char format.
	 *
	 * <P><B>Note:</B> This stream object can either be a standard
	 * Java stream object or your own subclass that implements the
	 * standard interface.
	 *
	 * @param parameterIndex the first parameter is 1, the second is 2, ...
	 * @param x              the Java input stream that contains the ASCII parameter value
	 * @param length         the number of bytes in the stream
	 * @throws SQLException if parameterIndex does not correspond to a parameter
	 *                      marker in the SQL statement; if a database access error occurs or
	 *                      this method is called on a closed <code>PreparedStatement</code>
	 * @since 1.6
	 */
	@Override
	public void setAsciiStream(int parameterIndex, InputStream x, long length) throws SQLException {

	}

	/**
	 * Sets the designated parameter to the given input stream, which will have
	 * the specified number of bytes.
	 * When a very large binary value is input to a <code>LONGVARBINARY</code>
	 * parameter, it may be more practical to send it via a
	 * <code>java.io.InputStream</code> object. The data will be read from the
	 * stream as needed until end-of-file is reached.
	 *
	 * <P><B>Note:</B> This stream object can either be a standard
	 * Java stream object or your own subclass that implements the
	 * standard interface.
	 *
	 * @param parameterIndex the first parameter is 1, the second is 2, ...
	 * @param x              the java input stream which contains the binary parameter value
	 * @param length         the number of bytes in the stream
	 * @throws SQLException if parameterIndex does not correspond to a parameter
	 *                      marker in the SQL statement; if a database access error occurs or
	 *                      this method is called on a closed <code>PreparedStatement</code>
	 * @since 1.6
	 */
	@Override
	public void setBinaryStream(int parameterIndex, InputStream x, long length) throws SQLException {

	}

	/**
	 * Sets the designated parameter to the given <code>Reader</code>
	 * object, which is the given number of characters long.
	 * When a very large UNICODE value is input to a <code>LONGVARCHAR</code>
	 * parameter, it may be more practical to send it via a
	 * <code>java.io.Reader</code> object. The data will be read from the stream
	 * as needed until end-of-file is reached.  The JDBC driver will
	 * do any necessary conversion from UNICODE to the database char format.
	 *
	 * <P><B>Note:</B> This stream object can either be a standard
	 * Java stream object or your own subclass that implements the
	 * standard interface.
	 *
	 * @param parameterIndex the first parameter is 1, the second is 2, ...
	 * @param reader         the <code>java.io.Reader</code> object that contains the
	 *                       Unicode data
	 * @param length         the number of characters in the stream
	 * @throws SQLException if parameterIndex does not correspond to a parameter
	 *                      marker in the SQL statement; if a database access error occurs or
	 *                      this method is called on a closed <code>PreparedStatement</code>
	 * @since 1.6
	 */
	@Override
	public void setCharacterStream(int parameterIndex, Reader reader, long length) throws SQLException {

	}

	/**
	 * Sets the designated parameter to the given input stream.
	 * When a very large ASCII value is input to a <code>LONGVARCHAR</code>
	 * parameter, it may be more practical to send it via a
	 * <code>java.io.InputStream</code>. Data will be read from the stream
	 * as needed until end-of-file is reached.  The JDBC driver will
	 * do any necessary conversion from ASCII to the database char format.
	 *
	 * <P><B>Note:</B> This stream object can either be a standard
	 * Java stream object or your own subclass that implements the
	 * standard interface.
	 * <P><B>Note:</B> Consult your JDBC driver documentation to determine if
	 * it might be more efficient to use a version of
	 * <code>setAsciiStream</code> which takes a length parameter.
	 *
	 * @param parameterIndex the first parameter is 1, the second is 2, ...
	 * @param x              the Java input stream that contains the ASCII parameter value
	 * @throws SQLException                    if parameterIndex does not correspond to a parameter
	 *                                         marker in the SQL statement; if a database access error occurs or
	 *                                         this method is called on a closed <code>PreparedStatement</code>
	 * @throws SQLFeatureNotSupportedException if the JDBC driver does not support this method
	 * @since 1.6
	 */
	@Override
	public void setAsciiStream(int parameterIndex, InputStream x) throws SQLException {

	}

	/**
	 * Sets the designated parameter to the given input stream.
	 * When a very large binary value is input to a <code>LONGVARBINARY</code>
	 * parameter, it may be more practical to send it via a
	 * <code>java.io.InputStream</code> object. The data will be read from the
	 * stream as needed until end-of-file is reached.
	 *
	 * <P><B>Note:</B> This stream object can either be a standard
	 * Java stream object or your own subclass that implements the
	 * standard interface.
	 * <P><B>Note:</B> Consult your JDBC driver documentation to determine if
	 * it might be more efficient to use a version of
	 * <code>setBinaryStream</code> which takes a length parameter.
	 *
	 * @param parameterIndex the first parameter is 1, the second is 2, ...
	 * @param x              the java input stream which contains the binary parameter value
	 * @throws SQLException                    if parameterIndex does not correspond to a parameter
	 *                                         marker in the SQL statement; if a database access error occurs or
	 *                                         this method is called on a closed <code>PreparedStatement</code>
	 * @throws SQLFeatureNotSupportedException if the JDBC driver does not support this method
	 * @since 1.6
	 */
	@Override
	public void setBinaryStream(int parameterIndex, InputStream x) throws SQLException {

	}

	/**
	 * Sets the designated parameter to the given <code>Reader</code>
	 * object.
	 * When a very large UNICODE value is input to a <code>LONGVARCHAR</code>
	 * parameter, it may be more practical to send it via a
	 * <code>java.io.Reader</code> object. The data will be read from the stream
	 * as needed until end-of-file is reached.  The JDBC driver will
	 * do any necessary conversion from UNICODE to the database char format.
	 *
	 * <P><B>Note:</B> This stream object can either be a standard
	 * Java stream object or your own subclass that implements the
	 * standard interface.
	 * <P><B>Note:</B> Consult your JDBC driver documentation to determine if
	 * it might be more efficient to use a version of
	 * <code>setCharacterStream</code> which takes a length parameter.
	 *
	 * @param parameterIndex the first parameter is 1, the second is 2, ...
	 * @param reader         the <code>java.io.Reader</code> object that contains the
	 *                       Unicode data
	 * @throws SQLException                    if parameterIndex does not correspond to a parameter
	 *                                         marker in the SQL statement; if a database access error occurs or
	 *                                         this method is called on a closed <code>PreparedStatement</code>
	 * @throws SQLFeatureNotSupportedException if the JDBC driver does not support this method
	 * @since 1.6
	 */
	@Override
	public void setCharacterStream(int parameterIndex, Reader reader) throws SQLException {

	}

	/**
	 * Sets the designated parameter to a <code>Reader</code> object. The
	 * <code>Reader</code> reads the data till end-of-file is reached. The
	 * driver does the necessary conversion from Java character format to
	 * the national character set in the database.
	 *
	 * <P><B>Note:</B> This stream object can either be a standard
	 * Java stream object or your own subclass that implements the
	 * standard interface.
	 * <P><B>Note:</B> Consult your JDBC driver documentation to determine if
	 * it might be more efficient to use a version of
	 * <code>setNCharacterStream</code> which takes a length parameter.
	 *
	 * @param parameterIndex of the first parameter is 1, the second is 2, ...
	 * @param value          the parameter value
	 * @throws SQLException                    if parameterIndex does not correspond to a parameter
	 *                                         marker in the SQL statement; if the driver does not support national
	 *                                         character sets;  if the driver can detect that a data conversion
	 *                                         error could occur; if a database access error occurs; or
	 *                                         this method is called on a closed <code>PreparedStatement</code>
	 * @throws SQLFeatureNotSupportedException if the JDBC driver does not support this method
	 * @since 1.6
	 */
	@Override
	public void setNCharacterStream(int parameterIndex, Reader value) throws SQLException {

	}

	/**
	 * Sets the designated parameter to a <code>Reader</code> object.
	 * This method differs from the <code>setCharacterStream (int, Reader)</code> method
	 * because it informs the driver that the parameter value should be sent to
	 * the server as a <code>CLOB</code>.  When the <code>setCharacterStream</code> method is used, the
	 * driver may have to do extra work to determine whether the parameter
	 * data should be sent to the server as a <code>LONGVARCHAR</code> or a <code>CLOB</code>
	 *
	 * <P><B>Note:</B> Consult your JDBC driver documentation to determine if
	 * it might be more efficient to use a version of
	 * <code>setClob</code> which takes a length parameter.
	 *
	 * @param parameterIndex index of the first parameter is 1, the second is 2, ...
	 * @param reader         An object that contains the data to set the parameter value to.
	 * @throws SQLException                    if parameterIndex does not correspond to a parameter
	 *                                         marker in the SQL statement; if a database access error occurs; this method is called on
	 *                                         a closed <code>PreparedStatement</code>or if parameterIndex does not correspond to a parameter
	 *                                         marker in the SQL statement
	 * @throws SQLFeatureNotSupportedException if the JDBC driver does not support this method
	 * @since 1.6
	 */
	@Override
	public void setClob(int parameterIndex, Reader reader) throws SQLException {

	}

	/**
	 * Sets the designated parameter to a <code>InputStream</code> object.
	 * This method differs from the <code>setBinaryStream (int, InputStream)</code>
	 * method because it informs the driver that the parameter value should be
	 * sent to the server as a <code>BLOB</code>.  When the <code>setBinaryStream</code> method is used,
	 * the driver may have to do extra work to determine whether the parameter
	 * data should be sent to the server as a <code>LONGVARBINARY</code> or a <code>BLOB</code>
	 *
	 * <P><B>Note:</B> Consult your JDBC driver documentation to determine if
	 * it might be more efficient to use a version of
	 * <code>setBlob</code> which takes a length parameter.
	 *
	 * @param parameterIndex index of the first parameter is 1,
	 *                       the second is 2, ...
	 * @param inputStream    An object that contains the data to set the parameter
	 *                       value to.
	 * @throws SQLException                    if parameterIndex does not correspond to a parameter
	 *                                         marker in the SQL statement; if a database access error occurs;
	 *                                         this method is called on a closed <code>PreparedStatement</code> or
	 *                                         if parameterIndex does not correspond
	 *                                         to a parameter marker in the SQL statement,
	 * @throws SQLFeatureNotSupportedException if the JDBC driver does not support this method
	 * @since 1.6
	 */
	@Override
	public void setBlob(int parameterIndex, InputStream inputStream) throws SQLException {

	}

	/**
	 * Sets the designated parameter to a <code>Reader</code> object.
	 * This method differs from the <code>setCharacterStream (int, Reader)</code> method
	 * because it informs the driver that the parameter value should be sent to
	 * the server as a <code>NCLOB</code>.  When the <code>setCharacterStream</code> method is used, the
	 * driver may have to do extra work to determine whether the parameter
	 * data should be sent to the server as a <code>LONGNVARCHAR</code> or a <code>NCLOB</code>
	 * <P><B>Note:</B> Consult your JDBC driver documentation to determine if
	 * it might be more efficient to use a version of
	 * <code>setNClob</code> which takes a length parameter.
	 *
	 * @param parameterIndex index of the first parameter is 1, the second is 2, ...
	 * @param reader         An object that contains the data to set the parameter value to.
	 * @throws SQLException                    if parameterIndex does not correspond to a parameter
	 *                                         marker in the SQL statement;
	 *                                         if the driver does not support national character sets;
	 *                                         if the driver can detect that a data conversion
	 *                                         error could occur;  if a database access error occurs or
	 *                                         this method is called on a closed <code>PreparedStatement</code>
	 * @throws SQLFeatureNotSupportedException if the JDBC driver does not support this method
	 * @since 1.6
	 */
	@Override
	public void setNClob(int parameterIndex, Reader reader) throws SQLException {

	}

	/**
	 * @see java.sql.Statement#getMoreResults(int)
	 */
	public boolean getMoreResults(int current) throws SQLException {
		notImplemented();
		return false;
	}

	/**
	 * @see java.sql.Statement#getGeneratedKeys()
	 */
	public ResultSet getGeneratedKeys() throws SQLException {
		notImplemented();
		return null;
	}

	/**
	 * @see java.sql.Statement#executeUpdate(java.lang.String, int)
	 */
	public int executeUpdate(String sql, int autoGeneratedKeys)
		throws SQLException {
			notImplemented();
		return 0;
	}

	/**
	 * @see java.sql.Statement#executeUpdate(java.lang.String, int)
	 */
	public int executeUpdate(String sql, int[] columnIndexes)
		throws SQLException {
			notImplemented();
		return 0;
	}

	/**
	 * @see java.sql.Statement#executeUpdate(java.lang.String, java.lang.String)
	 */
	public int executeUpdate(String sql, String[] columnNames)
		throws SQLException {
			notImplemented();
		return 0;
	}

	/**
	 * @see java.sql.Statement#execute(java.lang.String, int)
	 */
	public boolean execute(String sql, int autoGeneratedKeys)
		throws SQLException {
			notImplemented();
		return false;
	}

	/**
	 * @see java.sql.Statement#execute(java.lang.String, int)
	 */
	public boolean execute(String sql, int[] columnIndexes)
		throws SQLException {
			notImplemented();
		return false;
	}

	/**
	 * @see java.sql.Statement#execute(java.lang.String, java.lang.String)
	 */
	public boolean execute(String sql, String[] columnNames)
		throws SQLException {
			notImplemented();
		return false;
	}

	/**
	 * @see java.sql.Statement#getResultSetHoldability()
	 */
	public int getResultSetHoldability() throws SQLException {
		notImplemented();
		return 0;
	}

	/**
	 * Retrieves whether this <code>Statement</code> object has been closed. A <code>Statement</code> is closed if the
	 * method close has been called on it, or if it is automatically closed.
	 *
	 * @return true if this <code>Statement</code> object is closed; false if it is still open
	 * @throws SQLException if a database access error occurs
	 * @since 1.6
	 */
	@Override
	public boolean isClosed() throws SQLException {
		return false;
	}

	/**
	 * Requests that a <code>Statement</code> be pooled or not pooled.  The value
	 * specified is a hint to the statement pool implementation indicating
	 * whether the application wants the statement to be pooled.  It is up to
	 * the statement pool manager as to whether the hint is used.
	 * <p>
	 * The poolable value of a statement is applicable to both internal
	 * statement caches implemented by the driver and external statement caches
	 * implemented by application servers and other applications.
	 * <p>
	 * By default, a <code>Statement</code> is not poolable when created, and
	 * a <code>PreparedStatement</code> and <code>CallableStatement</code>
	 * are poolable when created.
	 * <p>
	 *
	 * @param poolable requests that the statement be pooled if true and
	 *                 that the statement not be pooled if false
	 *                 <p>
	 * @throws SQLException if this method is called on a closed
	 *                      <code>Statement</code>
	 *                      <p>
	 * @since 1.6
	 */
	@Override
	public void setPoolable(boolean poolable) throws SQLException {

	}

	/**
	 * Returns a  value indicating whether the <code>Statement</code>
	 * is poolable or not.
	 * <p>
	 *
	 * @return <code>true</code> if the <code>Statement</code>
	 * is poolable; <code>false</code> otherwise
	 * <p>
	 * @throws SQLException if this method is called on a closed
	 *                      <code>Statement</code>
	 *                      <p>
	 * @see Statement#setPoolable(boolean) setPoolable(boolean)
	 * @since 1.6
	 * <p>
	 */
	@Override
	public boolean isPoolable() throws SQLException {
		return false;
	}

	/**
	 * Specifies that this {@code Statement} will be closed when all its
	 * dependent result sets are closed. If execution of the {@code Statement}
	 * does not produce any result sets, this method has no effect.
	 * <p>
	 * <strong>Note:</strong> Multiple calls to {@code closeOnCompletion} do
	 * not toggle the effect on this {@code Statement}. However, a call to
	 * {@code closeOnCompletion} does effect both the subsequent execution of
	 * statements, and statements that currently have open, dependent,
	 * result sets.
	 *
	 * @throws SQLException if this method is called on a closed
	 *                      {@code Statement}
	 * @since 1.7
	 */
	@Override
	public void closeOnCompletion() throws SQLException {

	}

	/**
	 * Returns a value indicating whether this {@code Statement} will be
	 * closed when all its dependent result sets are closed.
	 *
	 * @return {@code true} if the {@code Statement} will be closed when all
	 * of its dependent result sets are closed; {@code false} otherwise
	 * @throws SQLException if this method is called on a closed
	 *                      {@code Statement}
	 * @since 1.7
	 */
	@Override
	public boolean isCloseOnCompletion() throws SQLException {
		return false;
	}

	/**
	 * Returns an object that implements the given interface to allow access to
	 * non-standard methods, or standard methods not exposed by the proxy.
	 * <p>
	 * If the receiver implements the interface then the result is the receiver
	 * or a proxy for the receiver. If the receiver is a wrapper
	 * and the wrapped object implements the interface then the result is the
	 * wrapped object or a proxy for the wrapped object. Otherwise return the
	 * the result of calling <code>unwrap</code> recursively on the wrapped object
	 * or a proxy for that result. If the receiver is not a
	 * wrapper and does not implement the interface, then an <code>SQLException</code> is thrown.
	 *
	 * @param iface A Class defining an interface that the result must implement.
	 * @return an object that implements the interface. May be a proxy for the actual implementing object.
	 * @throws SQLException If no object found that implements the interface
	 * @since 1.6
	 */
	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		return null;
	}

	/**
	 * Returns true if this either implements the interface argument or is directly or indirectly a wrapper
	 * for an object that does. Returns false otherwise. If this implements the interface then return true,
	 * else if this is a wrapper then return the result of recursively calling <code>isWrapperFor</code> on the wrapped
	 * object. If this does not implement the interface and is not a wrapper, return false.
	 * This method should be implemented as a low-cost operation compared to <code>unwrap</code> so that
	 * callers can use this method to avoid expensive <code>unwrap</code> calls that may fail. If this method
	 * returns true then calling <code>unwrap</code> with the same argument should succeed.
	 *
	 * @param iface a Class defining an interface.
	 * @return true if this implements the interface or directly or indirectly wraps an object that does.
	 * @throws SQLException if an error occurs while determining whether this is a wrapper
	 *                      for an object with the given interface.
	 * @since 1.6
	 */
	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		return false;
	}
}
