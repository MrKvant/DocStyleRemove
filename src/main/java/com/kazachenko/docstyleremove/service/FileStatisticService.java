package com.kazachenko.docstyleremove.service;

import com.kazachenko.docstyleremove.repository.FileStatisticRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FileStatisticService {
    @Autowired
    private FileStatisticRepository fileStatisticRepository;
}
