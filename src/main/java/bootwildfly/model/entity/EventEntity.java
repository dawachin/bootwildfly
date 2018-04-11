package bootwildfly.model.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class EventEntity {

    /** スケジュールID */
    private String id;

    /** スケジュール　タイトル */
    private String title;

    /** スケジュール　説明 */
    private String description;

    /** スケジュール　開始日時 */
    private Date startDate;

    /** スケジュール　終了日時 */
    private Date endDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
