package com.dstz.base.datasource;

import javax.sql.DataSource;

/**
 * 数据源加载
 *
 * @author wacxhs
 */
public interface DataSourceLoading {

	/**
	 * 加载数据源
	 * @param alias 别名
	 * @return 数据源
	 */
	DataSource loadDataSource(String alias);
}
