

package org.apache.commons.math3.geometry.partitioning.utilities;


public class AVLTree<T extends java.lang.Comparable<T>> {
	private org.apache.commons.math3.geometry.partitioning.utilities.AVLTree<T>.Node top;

	public AVLTree() {
		top = null;
	}

	public void insert(final T element) {
		if (element != null) {
			if ((top) == null) {
				top = new Node(element, null);
			}else {
				top.insert(element);
			}
		}
	}

	public boolean delete(final T element) {
		if (element != null) {
			for (org.apache.commons.math3.geometry.partitioning.utilities.AVLTree<T>.Node node = getNotSmaller(element); node != null; node = node.getNext()) {
				if ((node.element) == element) {
					node.delete();
					return true;
				}else
					if ((node.element.compareTo(element)) > 0) {
						return false;
					}
				
			}
		}
		return false;
	}

	public boolean isEmpty() {
		return (top) == null;
	}

	public int size() {
		return (top) == null ? 0 : top.size();
	}

	public org.apache.commons.math3.geometry.partitioning.utilities.AVLTree<T>.Node getSmallest() {
		return (top) == null ? null : top.getSmallest();
	}

	public org.apache.commons.math3.geometry.partitioning.utilities.AVLTree<T>.Node getLargest() {
		return (top) == null ? null : top.getLargest();
	}

	public org.apache.commons.math3.geometry.partitioning.utilities.AVLTree<T>.Node getNotSmaller(final T reference) {
		org.apache.commons.math3.geometry.partitioning.utilities.AVLTree<T>.Node candidate = null;
		for (org.apache.commons.math3.geometry.partitioning.utilities.AVLTree<T>.Node node = top; node != null;) {
			if ((node.element.compareTo(reference)) < 0) {
				if ((node.right) == null) {
					return candidate;
				}
				node = node.right;
			}else {
				candidate = node;
				if ((node.left) == null) {
					return candidate;
				}
				node = node.left;
			}
		}
		return null;
	}

	public org.apache.commons.math3.geometry.partitioning.utilities.AVLTree<T>.Node getNotLarger(final T reference) {
		org.apache.commons.math3.geometry.partitioning.utilities.AVLTree<T>.Node candidate = null;
		for (org.apache.commons.math3.geometry.partitioning.utilities.AVLTree<T>.Node node = top; node != null;) {
			if ((node.element.compareTo(reference)) > 0) {
				if ((node.left) == null) {
					return candidate;
				}
				node = node.left;
			}else {
				candidate = node;
				if ((node.right) == null) {
					return candidate;
				}
				node = node.right;
			}
		}
		return null;
	}

	private static enum Skew {
LEFT_HIGH, RIGHT_HIGH, BALANCED;	}

	public class Node {
		private T element;

		private org.apache.commons.math3.geometry.partitioning.utilities.AVLTree<T>.Node left;

		private org.apache.commons.math3.geometry.partitioning.utilities.AVLTree<T>.Node right;

		private org.apache.commons.math3.geometry.partitioning.utilities.AVLTree<T>.Node parent;

		private org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew skew;

		Node(final T element, final org.apache.commons.math3.geometry.partitioning.utilities.AVLTree<T>.Node parent) {
			org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Node.this.element = element;
			left = null;
			right = null;
			org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Node.this.parent = parent;
			skew = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.BALANCED;
		}

		public T getElement() {
			return element;
		}

		int size() {
			return (1 + ((left) == null ? 0 : left.size())) + ((right) == null ? 0 : right.size());
		}

		org.apache.commons.math3.geometry.partitioning.utilities.AVLTree<T>.Node getSmallest() {
			org.apache.commons.math3.geometry.partitioning.utilities.AVLTree<T>.Node node = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Node.this;
			while ((node.left) != null) {
				node = node.left;
			} 
			return node;
		}

		org.apache.commons.math3.geometry.partitioning.utilities.AVLTree<T>.Node getLargest() {
			org.apache.commons.math3.geometry.partitioning.utilities.AVLTree<T>.Node node = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Node.this;
			while ((node.right) != null) {
				node = node.right;
			} 
			return node;
		}

		public org.apache.commons.math3.geometry.partitioning.utilities.AVLTree<T>.Node getPrevious() {
			if ((left) != null) {
				final org.apache.commons.math3.geometry.partitioning.utilities.AVLTree<T>.Node node = left.getLargest();
				if (node != null) {
					return node;
				}
			}
			for (org.apache.commons.math3.geometry.partitioning.utilities.AVLTree<T>.Node node = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Node.this; (node.parent) != null; node = node.parent) {
				if (node != (node.parent.left)) {
					return node.parent;
				}
			}
			return null;
		}

		public org.apache.commons.math3.geometry.partitioning.utilities.AVLTree<T>.Node getNext() {
			if ((right) != null) {
				final org.apache.commons.math3.geometry.partitioning.utilities.AVLTree<T>.Node node = right.getSmallest();
				if (node != null) {
					return node;
				}
			}
			for (org.apache.commons.math3.geometry.partitioning.utilities.AVLTree<T>.Node node = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Node.this; (node.parent) != null; node = node.parent) {
				if (node != (node.parent.right)) {
					return node.parent;
				}
			}
			return null;
		}

		boolean insert(final T newElement) {
			if ((newElement.compareTo(org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Node.this.element)) < 0) {
				if ((left) == null) {
					left = new Node(newElement, org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Node.this);
					return rebalanceLeftGrown();
				}
				return left.insert(newElement) ? rebalanceLeftGrown() : false;
			}
			if ((right) == null) {
				right = new Node(newElement, org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Node.this);
				return rebalanceRightGrown();
			}
			return right.insert(newElement) ? rebalanceRightGrown() : false;
		}

		public void delete() {
			if ((((parent) == null) && ((left) == null)) && ((right) == null)) {
				element = null;
				top = null;
			}else {
				org.apache.commons.math3.geometry.partitioning.utilities.AVLTree<T>.Node node;
				org.apache.commons.math3.geometry.partitioning.utilities.AVLTree<T>.Node child;
				boolean leftShrunk;
				if (((left) == null) && ((right) == null)) {
					node = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Node.this;
					element = null;
					leftShrunk = node == (node.parent.left);
					child = null;
				}else {
					node = ((left) != null) ? left.getLargest() : right.getSmallest();
					element = node.element;
					leftShrunk = node == (node.parent.left);
					child = ((node.left) != null) ? node.left : node.right;
				}
				node = node.parent;
				if (leftShrunk) {
					node.left = child;
				}else {
					node.right = child;
				}
				if (child != null) {
					child.parent = node;
				}
				while (leftShrunk ? node.rebalanceLeftShrunk() : node.rebalanceRightShrunk()) {
					if ((node.parent) == null) {
						return ;
					}
					leftShrunk = node == (node.parent.left);
					node = node.parent;
				} 
			}
		}

		private boolean rebalanceLeftGrown() {
			switch (skew) {
				case LEFT_HIGH :
					if ((left.skew) == (org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.LEFT_HIGH)) {
						rotateCW();
						skew = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.BALANCED;
						right.skew = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.BALANCED;
					}else {
						final org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew s = left.right.skew;
						left.rotateCCW();
						rotateCW();
						switch (s) {
							case LEFT_HIGH :
								left.skew = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.BALANCED;
								right.skew = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.RIGHT_HIGH;
								break;
							case RIGHT_HIGH :
								left.skew = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.LEFT_HIGH;
								right.skew = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.BALANCED;
								break;
							default :
								left.skew = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.BALANCED;
								right.skew = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.BALANCED;
						}
						skew = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.BALANCED;
					}
					return false;
				case RIGHT_HIGH :
					skew = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.BALANCED;
					return false;
				default :
					skew = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.LEFT_HIGH;
					return true;
			}
		}

		private boolean rebalanceRightGrown() {
			switch (skew) {
				case LEFT_HIGH :
					skew = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.BALANCED;
					return false;
				case RIGHT_HIGH :
					if ((right.skew) == (org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.RIGHT_HIGH)) {
						rotateCCW();
						skew = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.BALANCED;
						left.skew = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.BALANCED;
					}else {
						final org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew s = right.left.skew;
						right.rotateCW();
						rotateCCW();
						switch (s) {
							case LEFT_HIGH :
								left.skew = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.BALANCED;
								right.skew = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.RIGHT_HIGH;
								break;
							case RIGHT_HIGH :
								left.skew = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.LEFT_HIGH;
								right.skew = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.BALANCED;
								break;
							default :
								left.skew = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.BALANCED;
								right.skew = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.BALANCED;
						}
						skew = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.BALANCED;
					}
					return false;
				default :
					skew = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.RIGHT_HIGH;
					return true;
			}
		}

		private boolean rebalanceLeftShrunk() {
			switch (skew) {
				case LEFT_HIGH :
					skew = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.BALANCED;
					return true;
				case RIGHT_HIGH :
					if ((right.skew) == (org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.RIGHT_HIGH)) {
						rotateCCW();
						skew = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.BALANCED;
						left.skew = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.BALANCED;
						return true;
					}else
						if ((right.skew) == (org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.BALANCED)) {
							rotateCCW();
							skew = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.LEFT_HIGH;
							left.skew = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.RIGHT_HIGH;
							return false;
						}else {
							final org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew s = right.left.skew;
							right.rotateCW();
							rotateCCW();
							switch (s) {
								case LEFT_HIGH :
									left.skew = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.BALANCED;
									right.skew = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.RIGHT_HIGH;
									break;
								case RIGHT_HIGH :
									left.skew = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.LEFT_HIGH;
									right.skew = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.BALANCED;
									break;
								default :
									left.skew = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.BALANCED;
									right.skew = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.BALANCED;
							}
							skew = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.BALANCED;
							return true;
						}
					
				default :
					skew = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.RIGHT_HIGH;
					return false;
			}
		}

		private boolean rebalanceRightShrunk() {
			switch (skew) {
				case RIGHT_HIGH :
					skew = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.BALANCED;
					return true;
				case LEFT_HIGH :
					if ((left.skew) == (org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.LEFT_HIGH)) {
						rotateCW();
						skew = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.BALANCED;
						right.skew = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.BALANCED;
						return true;
					}else
						if ((left.skew) == (org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.BALANCED)) {
							rotateCW();
							skew = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.RIGHT_HIGH;
							right.skew = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.LEFT_HIGH;
							return false;
						}else {
							final org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew s = left.right.skew;
							left.rotateCCW();
							rotateCW();
							switch (s) {
								case LEFT_HIGH :
									left.skew = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.BALANCED;
									right.skew = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.RIGHT_HIGH;
									break;
								case RIGHT_HIGH :
									left.skew = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.LEFT_HIGH;
									right.skew = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.BALANCED;
									break;
								default :
									left.skew = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.BALANCED;
									right.skew = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.BALANCED;
							}
							skew = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.BALANCED;
							return true;
						}
					
				default :
					skew = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Skew.LEFT_HIGH;
					return false;
			}
		}

		private void rotateCW() {
			final T tmpElt = element;
			element = left.element;
			left.element = tmpElt;
			final org.apache.commons.math3.geometry.partitioning.utilities.AVLTree<T>.Node tmpNode = left;
			left = tmpNode.left;
			tmpNode.left = tmpNode.right;
			tmpNode.right = right;
			right = tmpNode;
			if ((left) != null) {
				left.parent = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Node.this;
			}
			if ((right.right) != null) {
				right.right.parent = right;
			}
		}

		private void rotateCCW() {
			final T tmpElt = element;
			element = right.element;
			right.element = tmpElt;
			final org.apache.commons.math3.geometry.partitioning.utilities.AVLTree<T>.Node tmpNode = right;
			right = tmpNode.right;
			tmpNode.right = tmpNode.left;
			tmpNode.left = left;
			left = tmpNode;
			if ((right) != null) {
				right.parent = org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Node.this;
			}
			if ((left.left) != null) {
				left.left.parent = left;
			}
		}
	}
}

