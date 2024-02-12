package com.warproject.service;

import java.util.List;
import java.util.Map;

import com.warproject.entity.Addresss;

public interface AddressService {

	public Map<String, Object> saveAddress(Addresss address);

	public List<Addresss> getAllAddress();

}
