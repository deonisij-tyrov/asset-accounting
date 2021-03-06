package com.maks.assetaccounting.service.company;

import com.maks.assetaccounting.dto.CompanyDto;
import com.maks.assetaccounting.service.CrudService;

import java.util.List;

public interface CompanyService extends CrudService<CompanyDto, CompanyDto> {

    List<CompanyDto> findCompaniesWithAssetsInAscendingOrder();
}
