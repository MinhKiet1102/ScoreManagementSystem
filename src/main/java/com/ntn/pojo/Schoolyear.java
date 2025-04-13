/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntn.pojo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import java.io.Serializable;
import java.util.Set;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "schoolyear")
@NamedQueries({
    @NamedQuery(name = "Schoolyear.findAll", query = "SELECT s FROM Schoolyear s"),
    @NamedQuery(name = "Schoolyear.findById", query = "SELECT s FROM Schoolyear s WHERE s.id = :id"),
    @NamedQuery(name = "Schoolyear.findByNameYear", query = "SELECT s FROM Schoolyear s WHERE s.nameYear = :nameYear"),
    @NamedQuery(name = "Schoolyear.findByYearStart", query = "SELECT s FROM Schoolyear s WHERE s.yearStart = :yearStart"),
    @NamedQuery(name = "Schoolyear.findByYearEnd", query = "SELECT s FROM Schoolyear s WHERE s.yearEnd = :yearEnd"),
    @NamedQuery(name = "Schoolyear.findBySemesterName", query = "SELECT s FROM Schoolyear s WHERE s.semesterName = :semesterName")})
public class Schoolyear implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Size(max = 50)
    @Column(name = "NameYear")
    private String nameYear;
    @Size(max = 30)
    @Column(name = "YearStart")
    private String yearStart;
    @Size(max = 30)
    @Column(name = "YearEnd")
    private String yearEnd;
    @Size(max = 55)
    @Column(name = "SemesterName")
    private String semesterName;
    @OneToMany(mappedBy = "schoolYearId")
    private Set<Score> scoreSet;
    @OneToMany(mappedBy = "schoolYearId")
    private Set<Studentsubjectteacher> studentsubjectteacherSet;

    public Schoolyear() {
    }

    public Schoolyear(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameYear() {
        return nameYear;
    }

    public void setNameYear(String nameYear) {
        this.nameYear = nameYear;
    }

    public String getYearStart() {
        return yearStart;
    }

    public void setYearStart(String yearStart) {
        this.yearStart = yearStart;
    }

    public String getYearEnd() {
        return yearEnd;
    }

    public void setYearEnd(String yearEnd) {
        this.yearEnd = yearEnd;
    }

    public String getSemesterName() {
        return semesterName;
    }

    public void setSemesterName(String semesterName) {
        this.semesterName = semesterName;
    }

    public Set<Score> getScoreSet() {
        return scoreSet;
    }

    public void setScoreSet(Set<Score> scoreSet) {
        this.scoreSet = scoreSet;
    }

    public Set<Studentsubjectteacher> getStudentsubjectteacherSet() {
        return studentsubjectteacherSet;
    }

    public void setStudentsubjectteacherSet(Set<Studentsubjectteacher> studentsubjectteacherSet) {
        this.studentsubjectteacherSet = studentsubjectteacherSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Schoolyear)) {
            return false;
        }
        Schoolyear other = (Schoolyear) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ntn.pojo.Schoolyear[ id=" + id + " ]";
    }
    
}
