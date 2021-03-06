/**
 * Copyright (c) 2020 Bosch.IO GmbH and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.hawkbit.repository.event.remote;

import org.eclipse.hawkbit.repository.model.Action;

import java.util.List;

/**
 * Generic deployment event for the Multi-Assignments feature. The event extends
 * the {@link MultiActionEvent} and holds a list of controller IDs to identify
 * the targets which are affected by a deployment action and a list of
 * actionIds containing the identifiers of the affected actions
 * as payload. This event is only published in case of an assignment.
 */
public class MultiActionAssignEvent extends MultiActionEvent {

    private static final long serialVersionUID = 1L;

    /**
     * Default constructor.
     */
    public MultiActionAssignEvent() {
        // for serialization libs like jackson
    }

    /**
     * Constructor.
     *
     * @param tenant
     *            tenant the event is scoped to
     * @param applicationId
     *            the application id
     * @param actions
     *            the actions of the deployment action
     */
    public MultiActionAssignEvent(String tenant, String applicationId, List<Action> actions) {
        super(tenant, applicationId, actions);
    }

}
