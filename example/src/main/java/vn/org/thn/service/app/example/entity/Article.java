package vn.org.thn.service.app.example.entity;

import vn.org.thn.service.base.db.mybatis.annotation.Entity;
import vn.org.thn.service.base.db.mybatis.annotation.GeneratedValue;
import vn.org.thn.service.base.db.mybatis.annotation.GenerationType;
import vn.org.thn.service.base.db.mybatis.annotation.Id;
import vn.org.thn.service.base.db.mybatis.annotation.Table;
import vn.org.thn.service.base.entity.BaseEntity;

import java.time.LocalDateTime;

/**
 * DB test entity #4: extends {@link BaseEntity} to exercise the shared audit columns
 * (createdAt/updatedAt/createdBy/updatedBy/deleted). As documented on {@link BaseEntity}, none of
 * those 4 fields are auto-populated - {@code ArticleService} sets them by hand before {@code save()}.
 * Also has its own auto-increment id (like {@link Category}) plus a {@code views} counter updated
 * via {@code UpdateBuilder#set} instead of a full-row {@code save()}, to exercise that builder too.
 */
@Entity
@Table(name = "article")
public class Article extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String content;
    private LocalDateTime publishedAt;
    private Long views = 0L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(LocalDateTime publishedAt) {
        this.publishedAt = publishedAt;
    }

    public Long getViews() {
        return views;
    }

    public void setViews(Long views) {
        this.views = views;
    }
}
