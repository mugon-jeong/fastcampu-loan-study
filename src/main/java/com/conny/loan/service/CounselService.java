package com.conny.loan.service;

import com.conny.loan.dto.CounselDTO.Request;
import com.conny.loan.dto.CounselDTO.Response;

public interface CounselService {

    Response create(Request request);
}
