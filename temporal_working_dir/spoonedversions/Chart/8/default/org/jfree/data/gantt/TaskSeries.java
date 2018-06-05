

package org.jfree.data.gantt;


public class TaskSeries extends org.jfree.data.general.Series {
	private java.util.List tasks;

	public TaskSeries(java.lang.String name) {
		super(name);
		org.jfree.data.gantt.TaskSeries.this.tasks = new java.util.ArrayList();
	}

	public void add(org.jfree.data.gantt.Task task) {
		if (task == null) {
			throw new java.lang.IllegalArgumentException("Null 'task' argument.");
		}
		org.jfree.data.gantt.TaskSeries.this.tasks.add(task);
		fireSeriesChanged();
	}

	public void remove(org.jfree.data.gantt.Task task) {
		org.jfree.data.gantt.TaskSeries.this.tasks.remove(task);
		fireSeriesChanged();
	}

	public void removeAll() {
		org.jfree.data.gantt.TaskSeries.this.tasks.clear();
		fireSeriesChanged();
	}

	public int getItemCount() {
		return org.jfree.data.gantt.TaskSeries.this.tasks.size();
	}

	public org.jfree.data.gantt.Task get(int index) {
		return ((org.jfree.data.gantt.Task) (org.jfree.data.gantt.TaskSeries.this.tasks.get(index)));
	}

	public org.jfree.data.gantt.Task get(java.lang.String description) {
		org.jfree.data.gantt.Task result = null;
		int count = org.jfree.data.gantt.TaskSeries.this.tasks.size();
		for (int i = 0; i < count; i++) {
			org.jfree.data.gantt.Task t = ((org.jfree.data.gantt.Task) (org.jfree.data.gantt.TaskSeries.this.tasks.get(i)));
			if (t.getDescription().equals(description)) {
				result = t;
				break;
			}
		}
		return result;
	}

	public java.util.List getTasks() {
		return java.util.Collections.unmodifiableList(org.jfree.data.gantt.TaskSeries.this.tasks);
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.gantt.TaskSeries.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.gantt.TaskSeries)) {
			return false;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		org.jfree.data.gantt.TaskSeries that = ((org.jfree.data.gantt.TaskSeries) (obj));
		if (!(org.jfree.data.gantt.TaskSeries.this.tasks.equals(that.tasks))) {
			return false;
		}
		return true;
	}
}

