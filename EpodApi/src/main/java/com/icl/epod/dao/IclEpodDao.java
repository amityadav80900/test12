package com.icl.epod.dao;

import java.io.Serializable;
import java.util.List;

import com.icl.epod.entity.AddressEntity;
import com.icl.epod.entity.CarrierEntity;
import com.icl.epod.entity.RoleEntity;
import com.icl.epod.entity.UserEntity;

/**
 * @author Vijendra.y
 *
 */
public interface IclEpodDao {

	Integer addCarrier(AddressEntity addressEntity);

	public <T> T fetchByKey(Serializable id, Class<T> entityClass);

	void updateCarrier(AddressEntity addressEntity);

	List<CarrierEntity> getAllCarrier();

	void removeCarrier(Integer itemId, Class<CarrierEntity> entity);

	UserEntity findById(Integer userId);

	Integer saveIclUser(UserEntity userModeToEntity);

	void deleteUserById(Integer userId);

	void updateIclUser(UserEntity userModeToEntity);

	List<UserEntity> getAllUsers();

	List<RoleEntity> getAllRoles();

	List<RoleEntity> getAllRolesWithRoleId();

	List<UserEntity> getAllUsersWithUserId();

	Integer assignRolesToIclUser(Integer userId, List<Integer> list);

}
