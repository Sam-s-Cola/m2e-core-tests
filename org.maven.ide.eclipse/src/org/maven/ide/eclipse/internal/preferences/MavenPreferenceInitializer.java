/*******************************************************************************
 * Copyright (c) 2008 Sonatype, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package org.maven.ide.eclipse.internal.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import org.maven.ide.eclipse.MavenPlugin;


/**
 * Maven preferences initializer.
 * 
 * @author Eugene Kuleshov
 */
public class MavenPreferenceInitializer extends AbstractPreferenceInitializer {

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
   */
  public void initializeDefaultPreferences() {
    IPreferenceStore store = MavenPlugin.getDefault().getPreferenceStore();

    store.setDefault(MavenPreferenceConstants.P_GLOBAL_SETTINGS_FILE, "");

    store.setDefault(MavenPreferenceConstants.P_DEBUG_OUTPUT, false);

    store.setDefault(MavenPreferenceConstants.P_OFFLINE, false);

    store.setDefault(MavenPreferenceConstants.P_DOWNLOAD_SOURCES, false);
    store.setDefault(MavenPreferenceConstants.P_DOWNLOAD_JAVADOC, false);

    store.setDefault(MavenPreferenceConstants.P_GOAL_ON_UPDATE, MavenPreferenceConstants.DEFAULT_GOALS_ON_UPDATE);
    store.setDefault(MavenPreferenceConstants.P_GOAL_ON_IMPORT, MavenPreferenceConstants.DEFAULT_GOALS_ON_IMPORT);

    // store.setDefault( MavenPreferenceConstants.P_GLOBAL_CHECKSUM_POLICY, ArtifactRepositoryPolicy.CHECKSUM_POLICY_WARN);
    // store.setDefault( MavenPreferenceConstants.P_UPDATE_SNAPSHOTS, false);
    // store.setDefault( MavenPreferenceConstants.P_CHECK_LATEST_PLUGIN_VERSION, false);

    store.setDefault(MavenPreferenceConstants.P_OUTPUT_FOLDER, "target-eclipse");

    store.setDefault(MavenPreferenceConstants.P_RUNTIMES, "");
    store.setDefault(MavenPreferenceConstants.P_DEFAULT_RUNTIME, "");

    store.setDefault(MavenPreferenceConstants.P_UPDATE_INDEXES, true);
  }

}
