/*
 * This file is part of Gradoop.
 *
 * Gradoop is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Gradoop is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Gradoop.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.gradoop.storage.api;

import org.gradoop.model.api.EPGMEdge;
import org.gradoop.model.api.EPGMVertex;

import java.util.Set;

/**
 * Representation of vertex data on the storage level. We additionally store
 * outgoing and incoming edges for faster access during e.g. traversal.
 *
 * @param <ED> edge data type
 */
public interface PersistentVertex<ED extends EPGMEdge> extends EPGMVertex {

  /**
   * Returns outgoing edge data for the vertex.
   *
   * @return outgoing edge data
   */
  Set<ED> getOutgoingEdges();

  /**
   * Sets outgoing edge data.
   *
   * @param outgoingEdgeData outgoing edge data
   */
  void setOutgoingEdges(Set<ED> outgoingEdgeData);

  /**
   * Returns incoming edge data for the vertex.
   *
   * @return incoming edge data
   */
  Set<ED> getIncomingEdges();

  /**
   * Sets incoming edge data.
   *
   * @param incomingEdgeData incoming edge data
   */
  void setIncomingEdges(Set<ED> incomingEdgeData);

}