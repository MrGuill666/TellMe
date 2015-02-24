/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tellme.core;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author mad
 */
public class Information {
    Subject subject;
    String statement;
    Subject source;

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public void setRelated(List<Subject> related) {
        this.related = related;
    }
    List<Subject> related;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.subject);
        hash = 53 * hash + Objects.hashCode(this.statement);
        hash = 53 * hash + Objects.hashCode(this.related);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Information other = (Information) obj;
        if (!Objects.equals(this.subject, other.subject)) {
            return false;
        }
        if (!Objects.equals(this.statement, other.statement)) {
            return false;
        }
        if (!Objects.equals(this.related, other.related)) {
            return false;
        }
        return true;
    }
    
}
