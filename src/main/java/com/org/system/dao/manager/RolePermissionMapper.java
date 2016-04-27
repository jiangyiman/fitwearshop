package com.org.system.dao.manager;

import com.org.system.model.manager.RolePermission;
import java.util.List;


/**
 * 
 * RolePermissionMapper数据库操作接口类
 * 
 */

public interface RolePermissionMapper{


	/**
	 * 
	 * 添加
	 * 
	 **/
	 public void save( RolePermission RolePermission);

	/**
	 * 
	 * 添加 （匹配有值的字段）
	 * 
	 **/
	 public void saveBySelective( RolePermission RolePermission);

	/**
	 * 
	 * 批量新增
	 * 
	 **/
	 public void saveBatchRolePermission(List<RolePermission> list);

	/**
	 * 
	 * 主键ID修改 
	 * 
	 **/
	 public int updateByPrimaryKey( RolePermission RolePermission);


	/**
	 * 
	 * 查询（根据主键ID查询）
	 * 
	 **/
	 public RolePermission  selectByPrimaryKey (Long id );

	/**
	 * 
	 * 多条数据
	 * 
	 **/
	 public List<RolePermission>  queryList (RolePermission RolePermission);

	/**
	 * 
	 * 分页查询
	 * 
	 **/
	 public List<RolePermission>  queryPageList(RolePermission RolePermission);

	/**
	 * 
	 * 分页查询
	 * 
	 **/
	 public Integer  queryPageCount (RolePermission RolePermission);

}