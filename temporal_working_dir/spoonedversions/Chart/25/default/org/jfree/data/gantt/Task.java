

package org.jfree.data.gantt;


public class Task implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = 1094303785346988894L;

	private java.lang.String description;

	private org.jfree.data.time.TimePeriod duration;

	private java.lang.Double percentComplete;

	private java.util.List subtasks;

	public Task(java.lang.String description, org.jfree.data.time.TimePeriod duration) {
		if (description == null) {
			throw new java.lang.IllegalArgumentException("Null 'description' argument.");
		}
		org.jfree.data.gantt.Task.this.description = description;
		org.jfree.data.gantt.Task.this.duration = duration;
		org.jfree.data.gantt.Task.this.percentComplete = null;
		org.jfree.data.gantt.Task.this.subtasks = new java.util.ArrayList();
	}

	public Task(java.lang.String description, java.util.Date start, java.util.Date end) {
		this(description, new org.jfree.data.time.SimpleTimePeriod(start, end));
	}

	public java.lang.String getDescription() {
		return org.jfree.data.gantt.Task.this.description;
	}

	public void setDescription(java.lang.String description) {
		if (description == null) {
			throw new java.lang.IllegalArgumentException("Null 'description' argument.");
		}
		org.jfree.data.gantt.Task.this.description = description;
	}

	public org.jfree.data.time.TimePeriod getDuration() {
		return org.jfree.data.gantt.Task.this.duration;
	}

	public void setDuration(org.jfree.data.time.TimePeriod duration) {
		org.jfree.data.gantt.Task.this.duration = duration;
	}

	public java.lang.Double getPercentComplete() {
		return org.jfree.data.gantt.Task.this.percentComplete;
	}

	public void setPercentComplete(java.lang.Double percent) {
		org.jfree.data.gantt.Task.this.percentComplete = percent;
	}

	public void setPercentComplete(double percent) {
		setPercentComplete(new java.lang.Double(percent));
	}

	public void addSubtask(org.jfree.data.gantt.Task subtask) {
		if (subtask == null) {
			throw new java.lang.IllegalArgumentException("Null 'subtask' argument.");
		}
		org.jfree.data.gantt.Task.this.subtasks.add(subtask);
	}

	public void removeSubtask(org.jfree.data.gantt.Task subtask) {
		org.jfree.data.gantt.Task.this.subtasks.remove(subtask);
	}

	public int getSubtaskCount() {
		return org.jfree.data.gantt.Task.this.subtasks.size();
	}

	public org.jfree.data.gantt.Task getSubtask(int index) {
		return ((org.jfree.data.gantt.Task) (org.jfree.data.gantt.Task.this.subtasks.get(index)));
	}

	public boolean equals(java.lang.Object object) {
		if (object == (org.jfree.data.gantt.Task.this)) {
			return true;
		}
		if (!(object instanceof org.jfree.data.gantt.Task)) {
			return false;
		}
		org.jfree.data.gantt.Task that = ((org.jfree.data.gantt.Task) (object));
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.data.gantt.Task.this.description, that.description))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.data.gantt.Task.this.duration, that.duration))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.data.gantt.Task.this.percentComplete, that.percentComplete))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.data.gantt.Task.this.subtasks, that.subtasks))) {
			return false;
		}
		return true;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.data.gantt.Task clone = ((org.jfree.data.gantt.Task) (super.clone()));
		return clone;
	}
}

