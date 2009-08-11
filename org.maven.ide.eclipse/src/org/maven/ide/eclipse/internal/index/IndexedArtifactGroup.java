/*******************************************************************************
 * Copyright (c) 2008 Sonatype, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package org.maven.ide.eclipse.internal.index;

import java.util.LinkedHashMap;

import org.maven.ide.eclipse.index.IndexedArtifact;


public class IndexedArtifactGroup {
  private final IndexInfo indexInfo;
  private final String prefix;
  private final LinkedHashMap<String, IndexedArtifactGroup> nodes = new LinkedHashMap<String, IndexedArtifactGroup>();
  private final LinkedHashMap<String, IndexedArtifact> files = new LinkedHashMap<String, IndexedArtifact>();

  public IndexedArtifactGroup(IndexInfo indexInfo, String prefix) {
    this.indexInfo = indexInfo;
    this.prefix = prefix;
  }

  public LinkedHashMap<String, IndexedArtifactGroup> getNodes() {
    return nodes;
  }

  public LinkedHashMap<String, IndexedArtifact> getFiles() {
    return files;
  }

  public String getPrefix() {
    return prefix;
  }

  public IndexInfo getIndexInfo() {
    return indexInfo;
  }
}