

package org.apache.commons.math.geometry.partitioning;


public interface BSPTreeVisitor<S extends org.apache.commons.math.geometry.Space> {
	enum Order {
PLUS_MINUS_SUB, PLUS_SUB_MINUS, MINUS_PLUS_SUB, MINUS_SUB_PLUS, SUB_PLUS_MINUS, SUB_MINUS_PLUS;	}

	org.apache.commons.math.geometry.partitioning.BSPTreeVisitor.Order visitOrder(org.apache.commons.math.geometry.partitioning.BSPTree<S> node);

	void visitInternalNode(org.apache.commons.math.geometry.partitioning.BSPTree<S> node);

	void visitLeafNode(org.apache.commons.math.geometry.partitioning.BSPTree<S> node);
}

