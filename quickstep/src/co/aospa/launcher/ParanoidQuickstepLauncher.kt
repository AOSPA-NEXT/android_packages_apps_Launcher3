/*
 * Copyright (C) 2020-2024 Paranoid Android
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package co.aospa.launcher

import com.android.launcher3.uioverrides.QuickstepLauncher
import com.android.systemui.plugins.shared.LauncherOverlayManager

class ParanoidQuickstepLauncher : QuickstepLauncher() {

    companion object {
        private const val TAG = "ParanoidQuickstepLauncher"
    }

    override fun getDefaultOverlay(): LauncherOverlayManager {
        return OverlayCallbackImpl(this)
    }

}
