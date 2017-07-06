package com.icl.epod.util;

import org.springframework.stereotype.Component;

import com.icl.epod.entity.AddressEntity;
import com.icl.epod.entity.CarrierEntity;
import com.icl.epod.entity.CarrierLicenseEntity;
import com.icl.epod.entity.UserEntity;
import com.icl.epod.entity.VendorEntity;
import com.icl.epod.model.AddressModel;
import com.icl.epod.model.CarrierModel;
import com.icl.epod.model.UserModel;
import com.icl.epod.model.VendorModel;

/**
 * @author Vijendra.y
 *
 */
@Component
public class CommonUtils {

	/**
	 * This method will convert CarrierModel To CarrierEntity.
	 *
	 */
	public CarrierEntity carrierModeToEntity(CarrierModel model, CarrierEntity entity) {
		if (model.getCompanyName() != null) {
			entity.setCompanyName(model.getCompanyName());
		}
		if (model.getCompanyAssignedCode() != null) {
			entity.setCompanyAssignedCode(model.getCompanyAssignedCode());
		}
		if (model.getFaxNumber() != null) {
			entity.setFaxNumber(model.getFaxNumber());
		}
		if (model.getTelephoneNumber() != null) {
			entity.setTelephoneNumber(model.getTelephoneNumber());
		}
		if (model.getContactFirstName() != null) {
			entity.setContactFirstName(model.getContactFirstName());
		}
		if (model.getContactLastName() != null) {
			entity.setContactLastName(model.getContactLastName());
		}
		if (model.getContactEmail() != null) {
			entity.setContactEmail(model.getContactEmail());
		}
		return entity;
	}

	/**
	 * This method will convert AddressModel To AddressEntity.
	 *
	 */
	public AddressEntity addressrModeToEntity(AddressModel model, AddressEntity entity) {
		if (model.getAddressLine1() != null) {
			entity.setAddressLine1(model.getAddressLine1());
		}
		if (model.getAddressLine2() != null) {
			entity.setAddressLine2(model.getAddressLine2());
		}
		if (model.getCity() != null) {
			entity.setCity(model.getCity());
		}
		if (model.getCounty() != null) {
			entity.setCounty(model.getCounty());
		}
		if (model.getState() != null) {
			entity.setState(model.getState());
		}
		if (model.getCountry() != null) {
			entity.setCountry(model.getCountry());
		}
		if (model.getZip() != null) {
			entity.setZip(model.getZip());
		}
		return entity;
	}

	/**
	 * This method will convert CarrierLicenseModel To CarrierLicenseEntity.
	 *
	 */
	public CarrierLicenseEntity carrierLicenseModelToEntity(CarrierModel model, CarrierLicenseEntity entity) {
		if (model.getCarrierLicense() != null) {
			entity.setCarrierLicense(model.getCarrierLicense());
		}
		if (model.getCarrierCMACCode() != null) {
			entity.setCarrierCMACCode(model.getCarrierCMACCode());
		}
		if (model.getCarrierLicense() != null) {
			entity.setCarrierLicense(model.getCarrierLicense());
		}
		if (model.getNumberOfLicense() != null) {
			entity.setNumberOfLicense(model.getNumberOfLicense());
		}
		return entity;
	}

	/**
	 * This method will convert VendorModel To VendorEntity.
	 *
	 */
	public VendorEntity vendorModelToEntity(VendorModel model) {
		VendorEntity entity = new VendorEntity();
		if (model.getDispatchTerminalLocation() != null) {
			entity.setDispatchTerminalLocation(model.getDispatchTerminalLocation());
		}
		if (model.getDispatchTerminalCode() != null) {
			entity.setDispatchTerminalCode(model.getDispatchTerminalCode());
		}
		if (model.getDispatchTerminalTelephone() != null) {
			entity.setDispatchTerminalTelephone(model.getDispatchTerminalTelephone());
		}
		if (model.getDispatchTerminalFax() != null) {
			entity.setDispatchTerminalFax(model.getDispatchTerminalFax());
		}
		if (model.getVendor() != null) {
			entity.setVendor(model.getVendor());
		}
		return entity;
	}

	/**
	 * This method will convert UserModel To UserEntity.
	 *
	 */

	public UserEntity userModeToEntity(UserModel model, UserEntity userEntity) {

		if (model.getUserName() != null) {
			userEntity.setUserName(model.getUserName());
		}
		if (model.getPassword() != null) {
			userEntity.setPassword(model.getPassword());
		}
		if (model.getFaxNumber() != null) {
			userEntity.setFaxNumber(model.getFaxNumber());
		}
		if (model.getFirstName() != null) {
			userEntity.setFirstName(model.getFirstName());
		}
		if (model.getLastName() != null) {
			userEntity.setLastName(model.getLastName());
		}
		if (model.getPhoneNumber() != null) {
			userEntity.setPhoneNumber(model.getPhoneNumber());
		}

		if (model.getImageId() != null) {
			userEntity.setImageId(model.getImageId());
		}
		userEntity.setCreateDate(new java.util.Date());

		return userEntity;
	}

}
