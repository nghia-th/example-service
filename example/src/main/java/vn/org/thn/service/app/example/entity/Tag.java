package vn.org.thn.service.app.example.entity;

import vn.org.thn.service.base.db.mybatis.annotation.Entity;
import vn.org.thn.service.base.db.mybatis.annotation.Id;
import vn.org.thn.service.base.db.mybatis.annotation.Table;

/**
 * DB test entity #3: primary key is a client-supplied {@code String} (no {@code @GeneratedValue})
 * - the caller decides the id, e.g. a slug like {@code "urgent"}. Exercises
 * {@code InsertExecutor.save()}'s "caller-supplied key" branch: the very first save for a given id
 * INSERTs, and calling save() again with the same id UPDATEs it (a true upsert, not just a create).
 */
@Entity
@Table(name = "tag")
public class Tag {

    @Id
    private String id;

    private String label;
    private Integer priority = 0;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }
}
