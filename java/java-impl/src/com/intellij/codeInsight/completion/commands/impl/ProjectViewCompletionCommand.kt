// Copyright 2000-2024 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.
package com.intellij.codeInsight.completion.commands.impl

import com.intellij.ide.actions.ActivateToolWindowAction.Manager

class ProjectViewCompletionCommand : AbstractActionCompletionCommand(Manager.getActionIdForToolWindow("Project"),
                                                                     "Project tree",
                                                                     null,
                                                                     -150)