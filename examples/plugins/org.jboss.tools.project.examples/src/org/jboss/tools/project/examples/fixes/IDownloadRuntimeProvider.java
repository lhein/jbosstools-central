/*************************************************************************************
 * Copyright (c) 2014 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.jboss.tools.project.examples.fixes;

import java.util.Collection;

import org.eclipse.core.runtime.IProgressMonitor;
import org.jboss.tools.runtime.core.model.DownloadRuntime;

public interface IDownloadRuntimeProvider {

	Collection<DownloadRuntime> getDownloadRuntimes(IProgressMonitor monitor); 
}
