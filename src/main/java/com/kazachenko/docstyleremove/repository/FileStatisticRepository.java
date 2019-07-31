package com.kazachenko.docstyleremove.repository;

import com.kazachenko.docstyleremove.model.FileStatisticEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileStatisticRepository extends CrudRepository<FileStatisticEntity, Integer> {
}
