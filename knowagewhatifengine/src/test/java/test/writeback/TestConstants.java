/*
 * Knowage, Open Source Business Intelligence suite
 * Copyright (C) 2016 Engineering Ingegneria Informatica S.p.A.
 * 
 * Knowage is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Knowage is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package test.writeback;

import java.math.BigDecimal;


/**
 * @author Marco Cortella (marco.cortella@eng.it)
 *
 */
public class TestConstants {
	
	//public static String workspaceFolder = "D:/Documenti/Sviluppo/workspaces/helios/spagobi/server";
	public static String workspaceFolder = "C:/Users/cortella/workspaceJEE";

	public static String RESOURCE_PATH = workspaceFolder+"/SpagoBICockpitEngine/test/resources/";
	public static String WEBCONTENT_PATH = workspaceFolder+"/SpagoBICockpitEngine/WebContent";
	public static String AF_CONFIG_FILE = "/WEB-INF/conf/master.xml";
	
	public static String CACHE_CONFIG_TABLE_PREFIX = "sbicache";
	public static BigDecimal CACHE_CONFIG_CACHE_DIMENSION = BigDecimal.valueOf(104857600); //in bytes
	public static int CACHE_CONFIG_PERCENTAGE_TO_CLEAN = 50;
	public static String CACHE_CONFIG_SCHEMA_NAME = "spagobi_testw";

	
	public enum DatabaseType { MYSQL, POSTGRES, ORACLE, SQLSERVER };
	
	public static boolean enableTestsOnMySql = true;
	public static boolean enableTestsOnPostgres = true;
	public static boolean enableTestsOnOracle = true;
	public static boolean enableTestsOnSQLServer = true;



	// =======================================================
	// MYSQL 
	// =======================================================
	public static String MYSQL_DRIVER = "com.mysql.jdbc.Driver";
	public static String MYSQL_URL = "jdbc:mysql://localhost:3306/foodmart_key";
	public static String MYSQL_USER = "root";
	public static String MYSQL_PWD = "root";
	
	

	
	// =======================================================
	// POSTGRES
	// =======================================================
	public static String POSTGRES_DRIVER = "org.postgresql.Driver";
	public static String POSTGRES_DIALECT_CLASS = "org.hibernate.dialect.PostgreSQLDialect";
	public static String POSTGRES_DIALECT_NAME = "sbidomains.nm.postgresql";

	//-------------
	// FOR WRITING
	//-------------
	public static String POSTGRES_LABEL_WRITING = "datasetTest_postgres_write";
	public static String POSTGRES_URL_WRITING = "jdbc:postgresql://172.27.1.83:5432/spagobi_testw";
	public static String POSTGRES_USER_WRITING = "spagobi";
	public static String POSTGRES_PWD_WRITING = "spagobi";
	
	//-------------
	// FOR READING
	//-------------
	public static String POSTGRES_LABEL_READING = "datasetTest_postgres_read";
	public static String POSTGRES_URL_READING = "jdbc:postgresql://172.27.1.83:5432/spagobi_testr";
	public static String POSTGRES_USER_READING = "spagobi";
	public static String POSTGRES_PWD_READING = "spagobi";
	
	// =======================================================
	// ORACLE
	// =======================================================
	public static String ORACLE_DRIVER = "oracle.jdbc.OracleDriver";
	public static String ORACLE_DIALECT_CLASS = "org.hibernate.dialect.Oracle9Dialect";
	public static String ORACLE_DIALECT_NAME = "sbidomains.nm.oracle_9i10g";
	public static String ORACLE_LABEL = "datasetTest_oracle_write";
	public static String ORACLE_URL = "jdbc:oracle:thin:@172.27.1.83:1521:repo"; //sibilla2
	public static String ORACLE_USER = "foodmart_key";
	public static String ORACLE_PWD = "foodmart_key";
	public static String ORACLE_MONDRIAN_SCHEMA = "foodmart_key";

	
	// =======================================================
	// SQL SERVER
	// =======================================================
	public static String SQLSERVER_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	public static String SQLSERVER_DIALECT_CLASS = "org.hibernate.dialect.SQLServerDialect";
	public static String SQLSERVER_DIALECT_NAME = "sbidomains.nm.sqlserver";

	//-------------
	// FOR WRITING
	//-------------
	public static String SQLSERVER_LABEL_WRITING = "datasetTest_sqlserver_write";
	public static String SQLSERVER_URL_WRITING = "jdbc:sqlserver://172.27.1.80:1433;databaseName=testSpagoBI;schema=spagobi_testw"; //server Padova
	public static String SQLSERVER_USER_WRITING = "spagobi";
	public static String SQLSERVER_PWD_WRITING = "bispago";
	
	//-------------
	// FOR READING
	//-------------
	public static String SQLSERVER_LABEL_READING = "datasetTest_sqlserver_read";
	public static String SQLSERVER_URL_READING = "jdbc:sqlserver://172.27.1.80:1433;databaseName=testSpagoBI;schema=spagobi_testr";
	public static String SQLSERVER_USER_READING = "spagobi";
	public static String SQLSERVER_PWD_READING = "bispago";
}
