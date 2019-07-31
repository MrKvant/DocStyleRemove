package com.kazachenko.docstyleremove.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "file_statistic")
public class FileStatisticEntity {
    private Integer id;
    private String name;
    private Timestamp timeProcessingStart;
    private Timestamp timeProcessingEnd;
    private Integer size;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "time_processing_start", nullable = true)
    public Timestamp getTimeProcessingStart() {
        return timeProcessingStart;
    }

    public void setTimeProcessingStart(Timestamp timeProcessingStart) {
        this.timeProcessingStart = timeProcessingStart;
    }

    @Basic
    @Column(name = "time_processing_end", nullable = true)
    public Timestamp getTimeProcessingEnd() {
        return timeProcessingEnd;
    }

    public void setTimeProcessingEnd(Timestamp timeProcessingEnd) {
        this.timeProcessingEnd = timeProcessingEnd;
    }

    @Basic
    @Column(name = "size", nullable = true)
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FileStatisticEntity that = (FileStatisticEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(timeProcessingStart, that.timeProcessingStart) &&
                Objects.equals(timeProcessingEnd, that.timeProcessingEnd) &&
                Objects.equals(size, that.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, timeProcessingStart, timeProcessingEnd, size);
    }
}
