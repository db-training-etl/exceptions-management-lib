package com.db.etl.exceptionsmanagementlibrary.application;

import com.db.etl.exceptionsmanagementlibrary.domain.ExceptionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ExceptionDispatcher {
    private ExceptionRepository exceptionRepository;
}
