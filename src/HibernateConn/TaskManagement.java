package HibernateConn;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class TaskManagement {
	@Column(name="Task Name")
	private String TaskName;
	@Id @ Column(name="Task ID")
	private int TaskId;
	@Temporal(TemporalType.DATE) @Column(name="Due Date")
	private Date DueDate;
	@Column(name="Start Date")
	private Date StartDate;
	@Column(name="Priority")
	private String Priority;
	@Column(name="Status")
	private String Status;

	public String getTaskName() {
		return TaskName;
	}
	public void setTaskName(String taskName) {
		TaskName = taskName;
	}
	public int getTaskId() {
		return TaskId;
	}
	public void setTaskId(int taskId) {
		TaskId = taskId;
	}
	public Date getDueDate() {
		return DueDate;
	}
	public void setDueDate(Date dueDate) {
		DueDate = dueDate;
	}
	public Date getStartDate() {
		return StartDate;
	}
	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}
	public String getPriority() {
		return Priority;
	}
	public void setPriority(String priority) {
		Priority = priority;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
}
