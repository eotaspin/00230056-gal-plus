package com.telefonica.gal.api;

import com.telefonica.gal.servicesConsolidation.response.SERVICESCONSOLIDATIONRESPONSE;
import org.springframework.http.ResponseEntity;

public interface ApiConsolidationService {

    ResponseEntity<SERVICESCONSOLIDATIONRESPONSE> consolidationPackage(String xmlRequest);

}
