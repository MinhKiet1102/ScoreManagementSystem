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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.Set;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "subjectteacher")
@NamedQueries({
    @NamedQuery(name = "Subjectteacher.findAll", query = "SELECT s FROM Subjectteacher s"),
    @NamedQuery(name = "Subjectteacher.findById", query = "SELECT s FROM Subjectteacher s WHERE s.id = :id")})
public class Subjectteacher implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @OneToMany(mappedBy = "subjectTeacherId")
    private Set<Forum> forumSet;
    @OneToMany(mappedBy = "subjectTeacherId")
    private Set<Notification> notificationSet;
    @OneToMany(mappedBy = "subjectTeacherID")
    private Set<Score> scoreSet;
    @OneToMany(mappedBy = "subjectTeacherId")
    private Set<Studentsubjectteacher> studentsubjectteacherSet;
    @JoinColumn(name = "SubjectId", referencedColumnName = "Id")
    @ManyToOne
    private Subject subjectId;
    @JoinColumn(name = "TeacherId", referencedColumnName = "Id")
    @ManyToOne
    private Teacher teacherId;

    public Subjectteacher() {
    }

    public Subjectteacher(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<Forum> getForumSet() {
        return forumSet;
    }

    public void setForumSet(Set<Forum> forumSet) {
        this.forumSet = forumSet;
    }

    public Set<Notification> getNotificationSet() {
        return notificationSet;
    }

    public void setNotificationSet(Set<Notification> notificationSet) {
        this.notificationSet = notificationSet;
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

    public Subject getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Subject subjectId) {
        this.subjectId = subjectId;
    }

    public Teacher getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Teacher teacherId) {
        this.teacherId = teacherId;
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
        if (!(object instanceof Subjectteacher)) {
            return false;
        }
        Subjectteacher other = (Subjectteacher) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ntn.pojo.Subjectteacher[ id=" + id + " ]";
    }
    
}
