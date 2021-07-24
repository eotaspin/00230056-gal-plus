package com.telefonica.gal.dynamicconf.spain.td.error.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import com.telefonica.gal.dynamicconf.repository.DynamicConfigErrors_DTO;
import com.telefonica.gal.dynamicconf.repository.DynamicConfigRepository;
import com.telefonica.gal.dynamicconf.unica.error.td.repository.model.Route_UNICA_ERROR_TD;

@Component
public class DynamicConfigRepository_SPAIN_TD_ERROR extends DynamicConfigRepository<DynamicConfigErrors_DTO,Route_UNICA_ERROR_TD> {

	public DynamicConfigRepository_SPAIN_TD_ERROR() {
		super(new DynamicConfigJSON_SPAIN_TD_ERROR());
	}


	@Override
	public boolean isValid() {
		return true;
	}


	@Override
	public List<Route_UNICA_ERROR_TD> getMaps() {
		return getRepository().getErrors();
	}


	@Override
	public String getVersion() {
		// TODO Auto-generated method stub
		return getRepository().getVersion();
	}


	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return getRepository().getInfo();
	}


	

}
